package androidx.compose.samples.crane.data.model

import com.google.gson.annotations.SerializedName

data class DestinationModel(
    //@SerializedName("id")
    val id: Int,
    //@SerializedName("title")
    val city: String,
    //@SerializedName("short_description")
    val description: String,
    //@SerializedName("thumbnail")
    val imageUrl: String
)