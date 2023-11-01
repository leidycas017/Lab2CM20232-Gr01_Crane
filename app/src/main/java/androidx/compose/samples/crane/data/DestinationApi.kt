package androidx.compose.samples.crane.data

import androidx.compose.samples.crane.data.model.DestinationModel
import androidx.compose.samples.crane.util.Constants.Companion.DESTINATION_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface DestinationApi {

    @GET(DESTINATION_ENDPOINT)
    suspend fun getDestination(): Response<List<DestinationModel>>
}