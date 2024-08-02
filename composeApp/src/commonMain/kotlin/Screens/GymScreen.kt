package Screens

import Componenets.GymCard
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable


@Composable
fun GymScreen() {
    LazyColumn() {
        items(listOfGyms) { gym ->
            GymCard(gym)
        }
    }
}