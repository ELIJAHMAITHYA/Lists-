package com.example.listsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listsapp.ui.theme.ListsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //A lazy column: Loads items only when we scroll
            LazyColumn {
                items(100) {
                    Text(
                        text = "Item Number: $it",
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 24.dp)
                            .verticalScroll(rememberScrollState())


                    )
                }
            }
        }
    }
}

//Normal column
//    setContent {
//        val scrollState = rememberScrollState()
//        Column(
//            modifier = Modifier.verticalScroll(scrollState)
//        ) {
//            for (i in 1..50) {
//                Text(
//                    text = "Item Number: $i",
//                    fontSize = 24.sp,
//                    textAlign = TextAlign.Center,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(vertical = 24.dp)
//
//
//                )
//            }
//        }
//    }



