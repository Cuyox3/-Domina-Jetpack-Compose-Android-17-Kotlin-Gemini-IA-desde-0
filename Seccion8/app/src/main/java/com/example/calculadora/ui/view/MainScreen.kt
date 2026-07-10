package com.example.calculadora.ui.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadora.ui.theme.CalculadoraTheme

class MainScreen {

    @Composable
    fun MainView(modifier: Modifier = Modifier) {

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        CalculadoraTheme {
            MainView(Modifier.padding(top = 24.pd))
        }
    }
}