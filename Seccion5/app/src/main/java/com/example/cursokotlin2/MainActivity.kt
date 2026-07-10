package com.example.cursokotlin2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.cursokotlin2.ui.theme.Cursokotlin2Theme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //SnackBar
            val scope = rememberCoroutineScope()
            val snakebarHS = remember { SnackbarHostState() }
            val recordMsg= stringResource(R.string.message_record)

            Cursokotlin2Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    snackbarHost = { SnackbarHost(hostState = snakebarHS) }) { innerPadding ->
                    MainView(
                        modifier = Modifier.padding(innerPadding),
                        onContentEvent = { msg ->
                            scope.launch {
                                val result = snakebarHS.showSnackbar(message = msg,
                                    actionLabel = recordMsg,
                                    duration = SnackbarDuration.Indefinite)
                                when(result) {
                                    SnackbarResult.ActionPerformed -> {
                                        Toast.makeText(this@MainActivity, recordMsg, Toast.LENGTH_SHORT).show()
                                    }
                                    SnackbarResult.Dismissed -> {}
                                }
                            }
                        })
                }
            }
        }
    }
}
