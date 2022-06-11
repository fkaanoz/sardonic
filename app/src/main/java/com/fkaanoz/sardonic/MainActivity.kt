package com.fkaanoz.sardonic

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import com.fkaanoz.sardonic.ui.theme.SardonicTheme
import com.fkaanoz.sardonic.ui.theme.Shapes
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val systemUiController = rememberSystemUiController()
            systemUiController.setSystemBarsColor(color = Color.Black)
            SardonicTheme {
               Column(modifier = Modifier.fillMaxSize()) {
                   TopBar()
                   Body()
               }
            }
        }
    }
}


@Composable
fun TopBar(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(70.dp) ,
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.Top
    ) {
        Spacer(modifier = Modifier
            .weight(1f)
            .height(50.dp)
            .background(Color.Black))
        Row(horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .background(Color.Black)
                .fillMaxHeight()
                .weight(0.8F)
            ) {
            Text( text="ecz", color = Color.White, modifier = Modifier.padding(5.dp), fontSize = 40.sp)
        }
        Spacer(modifier = Modifier
            .weight(1f)
            .height(50.dp)
            .background(Color.Black))
     }
}

@Composable
fun Body() {
    Box(modifier = Modifier.padding( start=25.dp, end = 25.dp )) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 25.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
             ) {
            Text("Şehir Seçin",
                modifier = Modifier
                    .background(Color.Black)
                    .fillMaxWidth(1F)
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                fontSize =18.sp,
                color = Color.White )
//            Text("A",
//                modifier = Modifier
//                    .background(Color.Black)
//                    .fillMaxWidth(0.1F)
//                    .padding(horizontal = 12.dp, vertical = 8.dp),
//                fontSize =18.sp,
//                color = Color.Red )
        }


        DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(0.9f)) {
            DropdownMenuItem(onClick = { /* Handle refresh! */ }) {
                Text("City1")
            }
            DropdownMenuItem(onClick = { /* Handle refresh! */ }) {
                Text("City2")
            }
            DropdownMenuItem(onClick = { /* Handle refresh! */ }) {
                Text("City3")
            }
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    SardonicTheme {
//        Greeting()
//    }
//}