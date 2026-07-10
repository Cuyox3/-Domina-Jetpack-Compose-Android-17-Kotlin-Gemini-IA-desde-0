package com.example.counter

import android.os.Bundle
import android.text.LoginFilter
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.counter.ui.theme.CounterTheme

class MainActivity : ComponentActivity() {

    var count:Int =  0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CounterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(modifier = Modifier.padding(innerPadding),
                        count = count , onSetCount = {
                            currentcount -> count = currentcount
                        })
                }
            }
        }
        Log.i("CursosKotlinParaVer", "onCreate: ")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CursosKotlinParaVer", "onStart: ")
    }

    override fun onResume() {
        super.onResume()

        Log.d("CursosKotlinParaVer", "Count $count ")
        Log.i("CursosKotlinParaVer", "onResume: ")
        //count = System.currentTimeMillis()

    }

    override fun onPause() {
        super.onPause()
        Log.i("CursosKotlinParaVer", "onPause: ")

    }

    override fun onStop() {
        super.onStop()
        Log.i("CursosKotlinParaVer", "onStop: ")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("CursosKotlinParaVer", "onRestart: ")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CursosKotlinParaVer", "onDestroy: ")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        // outState.putInt("Param_count", count)
        outState.putInt(PARAM_COUNT,count)
        super.onSaveInstanceState(outState)
        Log.i("CursosKotlinParaVer", "onSaveInstanceState: ")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        //count = savedInstanceState.getLong("Param_count", count)
        count = savedInstanceState.getInt(PARAM_COUNT, count)
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("CursosKotlinParaVer", "onRestoreInstanceState: ")

    }

    companion object{
        const val  PARAM_COUNT : String= "param_count"
    }
}
