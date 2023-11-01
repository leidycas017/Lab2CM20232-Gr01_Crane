package androidx.compose.samples.crane.domain

import androidx.compose.samples.crane.repo.DestinationRepository
import androidx.compose.samples.crane.domain.item.DestinationItem
import javax.inject.Inject

class GetDestinationUseCase @Inject constructor(private val destinationRepository: DestinationRepository){

    suspend operator fun invoke(): List<DestinationItem>{
        return destinationRepository.getDestination().shuffled()
    }

}