package Componenets

import Screens.Gym
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import trainingforme.composeapp.generated.resources.Res
import trainingforme.composeapp.generated.resources.compose_multiplatform

@Composable
fun GymCard(gym: Gym) {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            gymImage(
                painter = painterResource(Res.drawable.compose_multiplatform),
                modifier = Modifier.width(80.dp).height(80.dp)
            )
            gymDetails(gym, Modifier.weight(0.85f))
        }
    }
}

@Composable
fun gymImage(painter: Painter, modifier: Modifier) {
    Image(
        painter = painter,
        contentDescription = null,
        modifier = modifier
    )
}


@Composable
fun gymDetails(gym: Gym, modifier: Modifier) {
    Column(modifier = Modifier) {

        Text(
            gym.name,
            fontSize = 18.sp,
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.primary
        )

        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.medium
        ) {
            Text(
                text = gym.location,
                fontSize = 12.sp,
                style = MaterialTheme.typography.body2,
                maxLines = 2
            )
        }
    }
}