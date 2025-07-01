package com.example.cometchat.chatscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cometchat.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun ChatContent(){
    val messages = listOf(
        Message("Yes, it's available.", isUser = false),
        Message("Awesome! Can I see a couple of pictures?", isUser = true),
        Message("Sure! Sending them over now.", isUser = false),
        Message("Thanks! Looks good.", isUser = true),
        Message("I’ll take it. Can you ship it?", isUser = true),
        Message("Absolutely. Just send your address, and I'll ship it out.", isUser = false),
        Message("Great, I’ll send it now. Thanks!", isUser = true),
        Message("Thank you!", isUser = false)
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row() {
                        Image(
                            painter = painterResource(id = R.drawable.kartik_aaryan),
                            contentDescription = "Profile",
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                        )
                        Spacer(Modifier.width(8.dp))
                        Column {
                            Text("George Alan", fontWeight = FontWeight.Bold)
                            Text("Online", style = MaterialTheme.typography.bodySmall)
                        }
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Call, contentDescription = "Call")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Videocam, contentDescription = "Video Call")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.MoreVert, contentDescription = "More")
                    }
                }
            )
        },
        bottomBar = {BottomBar()}
    ){
            padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 8.dp)
        ) {
            item {
                Text(
                    text = "Today",
                    modifier = Modifier
                        .padding(vertical = 8.dp),
                    color = Color.Gray
                )
            }
            items(messages) { message ->
                ChatBubble(message = message)
            }
        }
    }
}