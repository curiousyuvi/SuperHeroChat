package com.curiousyuvi.superherochat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.curiousyuvi.superherochat.ui.theme.SuperHeroChatTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperHeroChatTheme {
                HomePage()
            }
        }
    }
}

@Composable
fun HomePage(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.surface)) {

        var searchWord:String by remember { mutableStateOf("")}

        Column() {
            OutlinedTextField(value = searchWord, onValueChange = {searchWord=it}, modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
                leadingIcon = { Icon(Icons.Outlined.Search, "search") }
                )
        }

    }
}