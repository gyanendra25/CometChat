package com.example.cometchat.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cometchat.R

@Preview(showSystemUi = true)
@Composable
fun HomeScreen() {

    val chatData = listOf(
        ChatDesignModel(
            R.drawable.ajay_devgn,
            name = "Ajay Devgan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.rajkummar_rao,
            name = "RajKummar Rao",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.bhuvan_bam,
            name = "Bhuvan Bam",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.carryminati,
            name = "Carryminati",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.disha_patani,
            name = "Disha Patani",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.hrithik_roshan,
            name = "Hritik Roshan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.kartik_aaryan,
            name = "Kartik Aaryan",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.mrbeast,
            name = "Mr. Beast",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.salman_khan,
            name = "Salman Khan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.tripti_dimri,
            name = "Tripti Dimri",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.rashmika,
            name = "Rashmika",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.salman_khan,
            name = "Salman Khan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.rashmika,
            name = "Rashmika",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.ajay_devgn,
            name = "Ajay Devgan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.rajkummar_rao,
            name = "RajKummar Rao",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.bhuvan_bam,
            name = "Bhuvan Bam",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.carryminati,
            name = "Carryminati",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.disha_patani,
            name = "Disha Patani",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.hrithik_roshan,
            name = "Hritik Roshan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.kartik_aaryan,
            name = "Kartik Aaryan",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.mrbeast,
            name = "Mr. Beast",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.salman_khan,
            name = "Salman Khan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time = "9:00",
            message = "Hii"
        ),
        ChatDesignModel(
            R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            time = "12:00",
            message = "Hello"
        ),
        ChatDesignModel(
            R.drawable.tripti_dimri,
            name = "Tripti Dimri",
            time = "12:00",
            message = "Hello"
        )

    )

    Column(modifier = Modifier.padding()) {

        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Chats",
                fontSize = 28.sp,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        HorizontalDivider()

        LazyColumn {
            items(chatData) {
                ChatDesign(it)
            }
        }
    }
}

