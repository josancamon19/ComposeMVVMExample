package com.josancamon19.composemvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    @ExperimentalUnitApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(R.drawable.happy_meal_small),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.height(200.dp)
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Happy Meal",
                            style = TextStyle(fontSize = TextUnit(26f, TextUnitType.Sp))
                        )
                        Text(
                            text = "$5.99",
                            modifier = Modifier.align(Alignment.CenterVertically),
                            style = TextStyle(color = Color(0XFF86bb65))
                        )

                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "800 Calories",
                        style = TextStyle(fontSize = TextUnit(17f, TextUnitType.Sp))
                    )
                    Spacer(modifier = Modifier.padding(top = 20.dp))
                    Button(onClick = { }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Text(text = "ORDER NOW")
                    }

                }
            }
        }
    }
}
