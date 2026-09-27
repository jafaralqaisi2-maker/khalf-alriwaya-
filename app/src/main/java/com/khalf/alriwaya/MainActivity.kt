package com.khalf.alriwaya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)

    setContent {
        MaterialTheme {
            NarratorScreen()
        }
    }
}

}

@Composable
fun NarratorScreen() {
var text by remember { mutableStateOf("") }

Column(
    modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
    verticalArrangement = Arrangement.spacedBy(16.dp)
) {
    Text(
        text = "خلف الرواية – الراوي",
        style = MaterialTheme.typography.headlineSmall
    )

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        modifier = Modifier.fillMaxWidth(),
        minLines = 8,
        label = { Text("اكتب النص هنا") }
    )

    Button(
        onClick = {
            // سنضع محرك تحويل النص إلى صوت هنا لاحقًا
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("إنشاء الصوت")
    }
}

}
