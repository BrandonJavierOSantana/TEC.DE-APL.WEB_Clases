package mx.cdmadero.tecnm.TEC.DE.APL.WEB.services

import mx.cdmadero.tecnm.TEC.DE.APL.WEB.model.EmailAddress
import mx.cdmadero.tecnm.TEC.DE.APL.WEB.repository.EmailAddressRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class EmailAddresssService ( val emailAddressRepository: EmailAddressRepository) {
    fun getByEmailAddress(id: Int): EmailAddress? {
        return emailAddressRepository.findByIdOrNull(id)
    }
}