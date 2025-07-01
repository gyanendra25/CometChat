package com.example.cometchat.chatscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cometchat.R

@Preview(showBackground = true)
@Composable
fun BottomBar() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = "",
            onValueChange = {},
            label = { Text("Type your message") }
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)) {

            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.add_circle),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.mic),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.wink),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.wirte),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.stars),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }

            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd) {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.send),
                        contentDescription = null,
                        modifier = Modifier.size(230.dp)
                    )
                }
            }
        }
    }
}