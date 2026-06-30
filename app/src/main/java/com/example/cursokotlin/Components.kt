package com.example.cursokotlin

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun ImagenMagito(){
    Image(painter = painterResource(R.drawable.icono_magito),
        contentDescription = "Magito")
}