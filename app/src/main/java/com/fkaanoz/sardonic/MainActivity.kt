package com.fkaanoz.sardonic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.fkaanoz.sardonic.ui.theme.SardonicTheme

class MainActivity : ComponentActivity() {

    private lateinit var cityVM : CityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        cityVM = ViewModelProvider(this).get(CityViewModel::class.java)

        super.onCreate(savedInstanceState)
        setContent {
            SardonicTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("asd")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SardonicTheme {
        Greeting("Android")
    }
}