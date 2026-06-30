package com.example.cursokotlin2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.RemeasurementModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.cursokotlin2.ui.theme.CommonPaddingDefault
import com.example.cursokotlin2.ui.theme.CommonPaddingMicro
import com.example.cursokotlin2.ui.theme.CommonPaddingNano
import com.example.cursokotlin2.ui.theme.Cursokotlin2Theme
import com.example.cursokotlin2.ui.theme.imageSize

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPreview() {
    Cursokotlin2Theme() {
        MainView(Modifier.padding(top = 24.dp))
    }
}

@Composable
fun MainView(modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState())) {
        Card(modifier = modifier
            .fillMaxSize()
            .padding(CommonPaddingDefault)) {
            CardDefaults()
        }
        ElevatedCard(
            modifier = modifier
                .fillMaxSize()
                .padding(CommonPaddingDefault),
            elevation = CardDefaults.cardElevation(CommonPaddingMicro)
        ) {
            CardDefaults()
        }
        OutlinedCard(modifier = modifier
            .fillMaxSize()
            .padding(CommonPaddingDefault),
            border = BorderStroke(CommonPaddingMicro, MaterialTheme.colorScheme.primary)
        ) {
            CardDefaults()
        }
    }
}

@Composable
fun CardDefaults() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(CommonPaddingDefault)){

        val (imgCard, txtTitle, txtDescription, btnBuy, btnSkip) = createRefs()

        Image(painter = painterResource(R.drawable.icono_magito),
                    contentDescription = null,
            modifier = Modifier
                .constrainAs(imgCard){
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                }
                .size(imageSize)
                .background(Color.Magenta) )

        Text(text = stringResource(R.string.tittle_black_friday), modifier = Modifier
            .constrainAs(txtTitle){
                start.linkTo(parent.end)
        })

        Text(text = stringResource(R.string.description_black_friday),modifier = Modifier
            .constrainAs(imgCard){
                start.linkTo(imgCard.end)
                top.linkTo(txtDescription.top)    }
            ,maxLines = 3,
            overflow = TextOverflow.Ellipsis )

    }
}