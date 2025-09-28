package com.example.hokm.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainApp() {
    Scaffold {
        Box(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Hokm - Offline (skeleton)")
                Spacer(Modifier.height(12.dp))
                Button(onClick = {}) { Text("Start") }
            }
        }
    }
}
