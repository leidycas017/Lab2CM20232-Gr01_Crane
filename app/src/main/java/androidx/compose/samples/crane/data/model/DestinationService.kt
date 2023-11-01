package androidx.compose.samples.crane.data.model

import androidx.compose.samples.crane.data.DestinationApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DestinationService @Inject constructor(private val destinationApi: DestinationApi){

    suspend fun getDestination(): List<DestinationModel>{
        return  withContext(Dispatchers.IO){
            val destination = destinationApi.getDestination()
            destination.body()?: emptyList()
        }
    }
}