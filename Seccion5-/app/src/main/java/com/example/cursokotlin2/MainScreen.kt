package com.example.cursokotlin2

import android.R.attr.contentDescription
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.RemeasurementModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.cursokotlin2.ui.theme.Blue200
import com.example.cursokotlin2.ui.theme.CommonPaddingDefault
import com.example.cursokotlin2.ui.theme.CommonPaddingMicro
import com.example.cursokotlin2.ui.theme.CommonPaddingNano
import com.example.cursokotlin2.ui.theme.Cursokotlin2Theme
import com.example.cursokotlin2.ui.theme.ImgCoverHeight
import com.example.cursokotlin2.ui.theme.Typography
import com.example.cursokotlin2.ui.theme.imageSize

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPreview() {
    Cursokotlin2Theme() {
        MainView(Modifier.padding(top = 24.dp))
    }
}


@OptIn(ExperimentalGlideComposeApi::class) // Uso de una libreria que esta en su version beta
@Composable
fun MainView(modifier: Modifier = Modifier) {

    Column(modifier = modifier.verticalScroll(rememberScrollState())) {

        Card(
            modifier = modifier
                .fillMaxSize()
                .padding(CommonPaddingDefault)
        )
        { CardDefaults() }

        ElevatedCard(
            modifier = modifier
                .fillMaxSize()
                .padding(CommonPaddingDefault),
            elevation = CardDefaults.cardElevation(CommonPaddingMicro)
        )
        { CardDefaults() }

        OutlinedCard(
            modifier = modifier
                .fillMaxSize()
                .padding(CommonPaddingDefault),
            border = BorderStroke(CommonPaddingMicro, MaterialTheme.colorScheme.primary)
        )
        { CardDefaults() }

        //
        //
        var urlValue by remember { mutableStateOf("https://static.wikia.nocookie.net/yugiohenespanol/images/a/ac/Chica_maga_oscura_%28personaje%29.jpg/revision/latest?cb=20120903042235&path-prefix=es") }
        Card(modifier = modifier
                .padding(CommonPaddingDefault)
                .fillMaxSize()) {
                Column(modifier = Modifier.fillMaxWidth()) {
                GlideImage(model =
                    if(urlValue.isEmpty())"https://static.wikia.nocookie.net/yugiohenespanol/images/5/58/Foto_mago_oscuro.jpg/revision/latest/scale-to-width/360?cb=20120121043211&path-prefix=es"
                    else urlValue,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(ImgCoverHeight)
                    .background(Blue200),
                contentScale = ContentScale.Crop)

            }
        }
    }
}

@Composable
fun CardDefaults() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(CommonPaddingDefault)
    ) {

        val (imgCard, txtTitle, txtDescription, btnBuy, btnSkip) = createRefs()

        Image(
            painter = painterResource(R.drawable.icono_magito), contentDescription = null,
            modifier = Modifier
                .constrainAs(imgCard) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                }
                .size(imageSize)
                .background(Color.Magenta))

        Text(
            text = stringResource(R.string.tittle_black_friday), modifier = Modifier
                .constrainAs(txtTitle) {
                    start.linkTo(imgCard.end, margin = CommonPaddingDefault)
                    end.linkTo(parent.end)
                    top.linkTo(imgCard.top)
                    width = Dimension.fillToConstraints
                },
            style = Typography.headlineSmall
        )

        Text(
            text = stringResource(R.string.description_black_friday), modifier = Modifier
            .constrainAs(txtDescription) {
                start.linkTo(txtTitle.start)
                end.linkTo(txtTitle.end)
                top.linkTo(txtTitle.bottom)
                bottom.linkTo(imgCard.bottom)
                width = Dimension.fillToConstraints
            }, maxLines = 3,
            overflow = TextOverflow.Ellipsis,
            style = Typography.bodySmall)

        Button(onClick = { }, modifier = Modifier.constrainAs(btnBuy) {
            end.linkTo(parent.end)
            top.linkTo(txtDescription.bottom, margin = CommonPaddingDefault)
            bottom.linkTo(parent.bottom)
        }) {
            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null)
            Text(text = stringResource(R.string.buy))
        }
        Button(onClick = { }, modifier = Modifier.constrainAs(btnSkip) {
            end.linkTo(btnBuy.start, margin = CommonPaddingDefault)
            top.linkTo(txtDescription.bottom, margin = CommonPaddingDefault)
            bottom.linkTo(parent.bottom)
        }) {
            Icon(imageVector = Icons.Default.SkipNext, contentDescription = null)
            Text(text = stringResource(R.string.skip))
        }
    }
}