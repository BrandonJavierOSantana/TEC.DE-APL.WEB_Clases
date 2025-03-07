package mx.cdmadero.tecnm.TEC.DE.APL.WEB.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(schema="Person", name = "EmailAddress")
data class EmailAddress(
    @Column(name = "businessEntityId")
    var businessEntityId: Int=0,
    @Id
    @Column (name = "emailAddressID")
    var emailAddressID: Int = 0,
    @Column(name = "emailAddress")
    var emailAddress: String = "",
    var rowguid : UUID = UUID.randomUUID(),
    @Column(name = "modifiedDate")
    var modifiedDate : LocalDateTime = LocalDateTime.now()
)
