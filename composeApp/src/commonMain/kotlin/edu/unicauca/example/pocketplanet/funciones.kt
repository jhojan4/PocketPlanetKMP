package edu.unicauca.example.pocketplanet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun EndScreen(modifier: Modifier = Modifier) {
    val secondaryContainerPo = Color(0xFFB4F48F)
    val onSecondaryContainerPo = Color(0xFF3A711D)
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp)
            .clip(RoundedCornerShape(topEnd = 100.dp))
            .background(secondaryContainerPo.copy(alpha = 0.5f))
            .border(0.3.dp, onSecondaryContainerPo, RoundedCornerShape(topEnd = 100.dp))
    )
}

@Composable
fun TopScreen(modifier: Modifier = Modifier) {
    val secondaryContainerPo = Color(0xFFB4F48F)
    val onSecondaryContainerPo = Color(0xFF3A711D)

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp)
            .clip(RoundedCornerShape(bottomStart = 100.dp))
            .background(secondaryContainerPo.copy(alpha = 0.5f))
            .border(0.3.dp, onSecondaryContainerPo, RoundedCornerShape(bottomStart = 100.dp))
    )
}

@Composable
fun BackGroundPocketPlanetInicial() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopScreen()
        Spacer(modifier = Modifier.weight(8f))
        EndScreen()
    }
}

@Composable
fun TitleIcon(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(40.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = modifier.padding(30.dp)
        ) {
            // Aquí puedes agregar logo o texto si lo deseas
        }
    }
}

/*
val primaryLight = Color(0xFF2A6C00)
val onPrimaryLight = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFF4EBD00)
val onPrimaryContainerLight = Color(0xFF184500)
val secondaryLight = Color(0xFF346B17)
val onSecondaryLight = Color(0xFFFFFFFF)
val secondaryContainerLight = Color(0xFFB4F48F)
val onSecondaryContainerLight = Color(0xFF3A711D)
val tertiaryLight = Color(0xFF006B5D)
val onTertiaryLight = Color(0xFFFFFFFF)
val tertiaryContainerLight = Color(0xFF00BBA4)
val onTertiaryContainerLight = Color(0xFF00443B)
val errorLight = Color(0xFFBA1A1A)
val onErrorLight = Color(0xFFFFFFFF)
val errorContainerLight = Color(0xFFFFDAD6)
val onErrorContainerLight = Color(0xFF93000A)
val backgroundLight = Color(0xFFF4FCE9)
val onBackgroundLight = Color(0xFF171D12)
val surfaceLight = Color(0xFFF4FCE9)
val onSurfaceLight = Color(0xFF171D12)
val surfaceVariantLight = Color(0xFFDAE7CD)
val onSurfaceVariantLight = Color(0xFF3F4A37)
val outlineLight = Color(0xFF6F7B65)
val outlineVariantLight = Color(0xFFBECBB2)
val scrimLight = Color(0xFF000000)
val inverseSurfaceLight = Color(0xFF2B3326)
val inverseOnSurfaceLight = Color(0xFFECF3E1)
val inversePrimaryLight = Color(0xFF6FE033)
val surfaceDimLight = Color(0xFFD5DDCB)
val surfaceBrightLight = Color(0xFFF4FCE9)
val surfaceContainerLowestLight = Color(0xFFFFFFFF)
val surfaceContainerLowLight = Color(0xFFEFF6E4)
val surfaceContainerLight = Color(0xFFE9F1DE)
val surfaceContainerHighLight = Color(0xFFE3EBD8)
val surfaceContainerHighestLight = Color(0xFFDEE5D3)

val primaryLightMediumContrast = Color(0xFF153F00)
val onPrimaryLightMediumContrast = Color(0xFFFFFFFF)
val primaryContainerLightMediumContrast = Color(0xFF317D00)
val onPrimaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val secondaryLightMediumContrast = Color(0xFF153F00)
val onSecondaryLightMediumContrast = Color(0xFFFFFFFF)
val secondaryContainerLightMediumContrast = Color(0xFF427A25)
val onSecondaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val tertiaryLightMediumContrast = Color(0xFF003E35)
val onTertiaryLightMediumContrast = Color(0xFFFFFFFF)
val tertiaryContainerLightMediumContrast = Color(0xFF007B6B)
val onTertiaryContainerLightMediumContrast = Color(0xFFFFFFFF)
val errorLightMediumContrast = Color(0xFF740006)
val onErrorLightMediumContrast = Color(0xFFFFFFFF)
val errorContainerLightMediumContrast = Color(0xFFCF2C27)
val onErrorContainerLightMediumContrast = Color(0xFFFFFFFF)
val backgroundLightMediumContrast = Color(0xFFF4FCE9)
val onBackgroundLightMediumContrast = Color(0xFF171D12)
val surfaceLightMediumContrast = Color(0xFFF4FCE9)
val onSurfaceLightMediumContrast = Color(0xFF0C1308)
val surfaceVariantLightMediumContrast = Color(0xFFDAE7CD)
val onSurfaceVariantLightMediumContrast = Color(0xFF2F3927)
val outlineLightMediumContrast = Color(0xFF4B5642)
val outlineVariantLightMediumContrast = Color(0xFF65715C)
val scrimLightMediumContrast = Color(0xFF000000)
val inverseSurfaceLightMediumContrast = Color(0xFF2B3326)
val inverseOnSurfaceLightMediumContrast = Color(0xFFECF3E1)
val inversePrimaryLightMediumContrast = Color(0xFF6FE033)
val surfaceDimLightMediumContrast = Color(0xFFC1C9B7)
val surfaceBrightLightMediumContrast = Color(0xFFF4FCE9)
val surfaceContainerLowestLightMediumContrast = Color(0xFFFFFFFF)
val surfaceContainerLowLightMediumContrast = Color(0xFFEFF6E4)
val surfaceContainerLightMediumContrast = Color(0xFFE3EBD8)
val surfaceContainerHighLightMediumContrast = Color(0xFFD8E0CD)
val surfaceContainerHighestLightMediumContrast = Color(0xFFCDD4C2)

val primaryLightHighContrast = Color(0xFF103300)
val onPrimaryLightHighContrast = Color(0xFFFFFFFF)
val primaryContainerLightHighContrast = Color(0xFF1F5400)
val onPrimaryContainerLightHighContrast = Color(0xFFFFFFFF)
val secondaryLightHighContrast = Color(0xFF103300)
val onSecondaryLightHighContrast = Color(0xFFFFFFFF)
val secondaryContainerLightHighContrast = Color(0xFF1F5400)
val onSecondaryContainerLightHighContrast = Color(0xFFFFFFFF)
val tertiaryLightHighContrast = Color(0xFF00332B)
val onTertiaryLightHighContrast = Color(0xFFFFFFFF)
val tertiaryContainerLightHighContrast = Color(0xFF005348)
val onTertiaryContainerLightHighContrast = Color(0xFFFFFFFF)
val errorLightHighContrast = Color(0xFF600004)
val onErrorLightHighContrast = Color(0xFFFFFFFF)
val errorContainerLightHighContrast = Color(0xFF98000A)
val onErrorContainerLightHighContrast = Color(0xFFFFFFFF)
val backgroundLightHighContrast = Color(0xFFF4FCE9)
val onBackgroundLightHighContrast = Color(0xFF171D12)
val surfaceLightHighContrast = Color(0xFFF4FCE9)
val onSurfaceLightHighContrast = Color(0xFF000000)
val surfaceVariantLightHighContrast = Color(0xFFDAE7CD)
val onSurfaceVariantLightHighContrast = Color(0xFF000000)
val outlineLightHighContrast = Color(0xFF252F1E)
val outlineVariantLightHighContrast = Color(0xFF414C39)
val scrimLightHighContrast = Color(0xFF000000)
val inverseSurfaceLightHighContrast = Color(0xFF2B3326)
val inverseOnSurfaceLightHighContrast = Color(0xFFFFFFFF)
val inversePrimaryLightHighContrast = Color(0xFF6FE033)
val surfaceDimLightHighContrast = Color(0xFFB4BBAA)
val surfaceBrightLightHighContrast = Color(0xFFF4FCE9)
val surfaceContainerLowestLightHighContrast = Color(0xFFFFFFFF)
val surfaceContainerLowLightHighContrast = Color(0xFFECF3E1)
val surfaceContainerLightHighContrast = Color(0xFFDEE5D3)
val surfaceContainerHighLightHighContrast = Color(0xFFCFD7C5)
val surfaceContainerHighestLightHighContrast = Color(0xFFC1C9B7)

val primaryDark = Color(0xFF6FE033)
val onPrimaryDark = Color(0xFF123800)
val primaryContainerDark = Color(0xFF4EBD00)
val onPrimaryContainerDark = Color(0xFF184500)
val secondaryDark = Color(0xFF99D776)
val onSecondaryDark = Color(0xFF123800)
val secondaryContainerDark = Color(0xFF215701)
val onSecondaryContainerDark = Color(0xFF8FCC6C)
val tertiaryDark = Color(0xFF48DCC4)
val onTertiaryDark = Color(0xFF003730)
val tertiaryContainerDark = Color(0xFF00BBA4)
val onTertiaryContainerDark = Color(0xFF00443B)
val errorDark = Color(0xFFFFB4AB)
val onErrorDark = Color(0xFF690005)
val errorContainerDark = Color(0xFF93000A)
val onErrorContainerDark = Color(0xFFFFDAD6)
val backgroundDark = Color(0xFF0F150B)
val onBackgroundDark = Color(0xFFDEE5D3)
val surfaceDark = Color(0xFF0F150B)
val onSurfaceDark = Color(0xFFDEE5D3)
val surfaceVariantDark = Color(0xFF3F4A37)
val onSurfaceVariantDark = Color(0xFFBECBB2)
val outlineDark = Color(0xFF88957E)
val outlineVariantDark = Color(0xFF3F4A37)
val scrimDark = Color(0xFF000000)
val inverseSurfaceDark = Color(0xFFDEE5D3)
val inverseOnSurfaceDark = Color(0xFF2B3326)
val inversePrimaryDark = Color(0xFF2A6C00)
val surfaceDimDark = Color(0xFF0F150B)
val surfaceBrightDark = Color(0xFF343B2F)
val surfaceContainerLowestDark = Color(0xFF0A1006)
val surfaceContainerLowDark = Color(0xFF171D12)
val surfaceContainerDark = Color(0xFF1B2216)
val surfaceContainerHighDark = Color(0xFF252C20)
val surfaceContainerHighestDark = Color(0xFF30372A)

 */