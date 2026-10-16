package com.sena.first_project.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.first_project.ui.composable.Cuadro

private val Naranja = Color(0xFFFF8A00)
private val AzulPanel = Color(0xFF25304A)
private val Verde = Color(0xFFB8F34A)
private val Rosa = Color(0xFFFF5C93)
private val Cyan = Color(0xFF36D6E7)
private val Footer = Color(0xFF394867)

@Composable
fun SeccionSuperior() {
    Cuadro(
        nombre = "Box",
        color = Naranja,
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "HEADER",
                fontSize = 23.sp,
                color = Color(0xFF182033)
            )
        }
    }
}

@Composable
fun SeccionCentral(modifier: Modifier = Modifier) {
    Cuadro(
        nombre = "Box",
        color = AzulPanel,
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Cuadro(
                nombre = "",
                color = Verde,
                modifier = Modifier.size(65.dp)
            )

            Cuadro(
                nombre = "",
                color = Rosa,
                modifier = Modifier.size(65.dp)
            )

            Cuadro(
                nombre = "",
                color = Cyan,
                modifier = Modifier.size(65.dp)
            )
        }
    }
}

@Composable
fun SeccionInferior() {
    Cuadro(
        nombre = "Box",
        color = Footer,
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Fila",
                fontSize = 18.sp,
                color = Color.White
            )

            Text(
                text = "Columna",
                fontSize = 18.sp,
                color = Color.White
            )
        }
    }
}