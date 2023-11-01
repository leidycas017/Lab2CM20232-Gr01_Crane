package androidx.compose.samples.crane.repo

import androidx.compose.samples.crane.data.model.DestinationService
import androidx.compose.samples.crane.domain.item.DestinationItem
import androidx.compose.samples.crane.domain.item.toDestinationItem
import javax.inject.Inject

class DestinationRepository @Inject constructor(private val destinationService: DestinationService) {
    suspend fun getDestination():List<DestinationItem>{
        return destinationService.getDestination().map{
            it.toDestinationItem()
        }
    }
}