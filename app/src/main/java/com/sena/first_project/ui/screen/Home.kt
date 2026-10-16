package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.first_project.ui.section.SeccionCentral
import com.sena.first_project.ui.section.SeccionInferior
import com.sena.first_project.ui.section.SeccionSuperior

private val Fondo = Color(0xFF151B2B)
private val Texto = Color(0xFFE0E7FF)

@Composable
fun Home() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Fondo
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(8.dp)
        ) {
            Text(
                text = "Scaffold",
                fontSize = 14.sp,
                color = Texto,
                modifier = Modifier.padding(4.dp)
            )

            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp),
                color = Fondo,
                shape = RoundedCornerShape(20.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "Surface",
                        fontSize = 14.sp,
                        color = Texto
                    )

                    SeccionSuperior()

                    SeccionCentral(
                        modifier = Modifier.weight(1f)
                    )

                    SeccionInferior()
                }
            }
        }
    }
}