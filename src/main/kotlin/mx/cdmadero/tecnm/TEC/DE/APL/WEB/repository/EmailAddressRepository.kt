package mx.cdmadero.tecnm.TEC.DE.APL.WEB.repository

import mx.cdmadero.tecnm.TEC.DE.APL.WEB.model.EmailAddress
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface EmailAddressRepository : JpaRepository <EmailAddress, Int> {
}