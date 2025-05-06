package edu.unicauca.example.pocketplanet

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.PasswordVisualTransformation
import kotlinpocketplanet.composeapp.generated.resources.Res
import kotlinpocketplanet.composeapp.generated.resources.logo

import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun RegistroScreen(viewModel: RegistroViewModel = remember { RegistroViewModel() }, onNavigateToLogin: () -> Unit) {
    val nombre by viewModel.nombre.collectAsState()
    val correo by viewModel.correo.collectAsState()
    val password by viewModel.password.collectAsState()
    val country by viewModel.country.collectAsState()
    val phone by viewModel.phone.collectAsState()
    val repeatpassword by viewModel.repeatpassword.collectAsState()
    Box(modifier = Modifier.fillMaxSize()) {
        BackGroundPocketPlanetInicial()
    Card(
        modifier = Modifier
        .fillMaxWidth()
        .height(800.dp)
        .padding(30.dp)
        .border(0.8.dp, Color(0xFF000000).copy(0.5f), RoundedCornerShape(30.dp)),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFD5DDCB).copy(0.3f)
        )) {
        Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Image(
                painter = painterResource(Res.drawable.logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .align(alignment = Alignment.CenterHorizontally)
            )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = nombre,
            onValueChange = viewModel::onNombreChanged,
            label = { Text("Nombre") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = correo,
            onValueChange = viewModel::onCorreoChanged,
            label = { Text("Correo electrónico") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = country,
            onValueChange = viewModel::onCountryChanged,
            label = { Text("Pais") }
        )
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = phone,
                onValueChange = viewModel::onPhoneChanged,
                label = { Text("Celular") },

            )
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = password,
                onValueChange = viewModel::onPasswordChanged,
                label = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = repeatpassword,
                onValueChange = viewModel::onRepeatPasswordChanged,
                label = { Text("Repetir Contraseña") },
                visualTransformation = PasswordVisualTransformation()
            )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = viewModel::registrar,
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF006B5D))
        ) {
            Text("Registrarse")
        }

    }
    }
    }
}
/*@Preview
@Composable
fun RegistroScreenPreview() {
    RegistroScreen(viewModel = RegistroViewModel(), onNavigateToLogin = {})
}
*/