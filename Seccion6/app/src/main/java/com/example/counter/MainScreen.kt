package com.example.counter

import android.R
import android.graphics.Paint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.counter.ui.theme.CounterTheme
import com.example.counter.ui.theme.Typography
import java.util.stream.Gatherer

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPreview() {
    CounterTheme() {
        MainView(modifier = Modifier.padding(top= 24.dp), count = 0 ,  {})
    }
}

@Composable
fun MainView(modifier: Modifier,
             count : Int,
             onSetCount :(count : Int) -> Unit) {
    var countValue by remember { mutableIntStateOf(count) }
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
        val (txtCounter, btnPlus) = createRefs()

        //Button(onClick = {countValue++},
        ButtonView (
            modifier = Modifier.constrainAs(btnPlus) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            }.padding(top= 192.dp),
            onClick = {countValue++
                      onSetCount(countValue)},
            onLongClick = {countValue=0; onSetCount(countValue)}
            )//{ Text(text = "+1") }

        Text(text= "$countValue",
            modifier = Modifier.constrainAs(txtCounter) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(btnPlus.bottom)
            },
            style = Typography.displayLarge)
    }
}