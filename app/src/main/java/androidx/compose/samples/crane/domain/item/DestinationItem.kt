package androidx.compose.samples.crane.domain.item

import androidx.compose.samples.crane.data.model.DestinationModel


data class DestinationItem(
    val id: Int,
    val city: String,
    val description: String,
    val imageUrl: String
)

fun DestinationModel.toDestinationItem() = DestinationItem(id, city, description, imageUrl)
