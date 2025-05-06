package edu.unicauca.example.pocketplanet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import kotlinpocketplanet.composeapp.generated.resources.Res
import kotlinpocketplanet.composeapp.generated.resources.alerts
import kotlinpocketplanet.composeapp.generated.resources.logo
import kotlinpocketplanet.composeapp.generated.resources.recomendation
import kotlinpocketplanet.composeapp.generated.resources.statistics
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun PresentacionScreen(onNavigateToRegistro: () -> Unit = {}) {
    val logic = remember { PresentacionLogic() }
    val imageIndex by logic.imageIndex.collectAsState()
    val textIndex by logic.textIndex.collectAsState()

    val imageKeys = listOf(
        Res.drawable.logo,
        Res.drawable.recomendation,
        Res.drawable.statistics,
        Res.drawable.alerts
    )

    val textStrings = listOf("Alerta", "Estadísticas", "Recomendación", "Logo")

    Box(modifier = Modifier.fillMaxSize()) {
        EndScreen(modifier = Modifier.align(Alignment.BottomEnd))
        Row(modifier = Modifier.align(Alignment.TopCenter).padding(16.dp),horizontalArrangement = Arrangement.Center,verticalAlignment = Alignment.CenterVertically) {
            Image(
            painter = painterResource(Res.drawable.logo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
            Spacer(modifier = Modifier.width(16.dp))
            Text("POCKET PLANET")
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(onClick = { logic.previous() }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Anterior")
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {


                    Image(
                        painter = painterResource(imageKeys[imageIndex]),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape)
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    Text(textStrings[textIndex])
                }

                IconButton(onClick = { logic.next() }) {
                    Icon(Icons.Default.ArrowForward, contentDescription = "Siguiente")
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row {
                Button(
                    onClick = { println("Navegar al login") },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF006B5D))
                ) {
                    Text("Iniciar Sesión")
                }

                Spacer(modifier = Modifier.width(8.dp))

                Button(
                    onClick = {onNavigateToRegistro()},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF006B5D))
                ) {
                    Text("Registrarse")
                }
            }
        }

    }
}
