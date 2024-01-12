package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Captaingame()
                }
            }
        }
    }
}

@Composable
fun Captaingame()
{
    val treasuresFound = remember { mutableStateOf(value = 0)}
    val direction = remember { mutableStateOf(value = "North")}
    val StromorTreasure =remember { mutableStateOf(value = "")}
    val backgroundimage = R.drawable.backgoundimage



    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Tresures found: ${treasuresFound.value}")
        Text(text = " Current Direction : ${direction.value}")
        Text(text = "${StromorTreasure.value}")


        Button(onClick = {
            direction.value="East"

            if(Random.nextBoolean())
            {
                treasuresFound.value++;
                StromorTreasure.value="WE FOUND TREASURE!!"
            }else
            {
                StromorTreasure.value="STROM AHEAD"
            }
        })
        {
            Text(text = "Sail East")
        }
        Button(onClick = {
            direction.value="West"
            //this creates random value for either treasures found or not in selected direction
            if(Random.nextBoolean())
            {
                treasuresFound.value++;
                StromorTreasure.value="WE FOUND TREASURE!!"
            }else
            {
                StromorTreasure.value="STROM AHEAD"
            }

        })
        {
            Text(text = "Sail West")
        }
        Button(onClick = {
            direction.value="North"
            if(Random.nextBoolean())
            {
                treasuresFound.value++;
                StromorTreasure.value="WE FOUND TREASURE!!"
            }else
            {
                StromorTreasure.value="STROM AHEAD"
            }
        })
        {
            Text(text = "Sail North")
        }
        Button(onClick = {
            direction.value="South"
            if(Random.nextBoolean())
            {
                treasuresFound.value++;
                StromorTreasure.value="WE FOUND TREASURE!!"
            }else
            {
                StromorTreasure.value="STROM AHEAD"
            }
        })
        {
            Text(text = "Sail South")
        }
    }
}