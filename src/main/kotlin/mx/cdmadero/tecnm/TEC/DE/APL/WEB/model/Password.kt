package mx.cdmadero.tecnm.TEC.DE.APL.WEB.model

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(schema="person",name="person")
data class Password(
    @Id
    @Column(name = "businessEntityID")
    var businessEntityID: Int? = 0,
    @Column(name="passwordHash")
    var passwordHash: String="",
    @Column(name="PasswordSalt")
    var passwordSalt: String="",
    var rowguid: UUID? = UUID.randomUUID(),
    @Column(name="ModifiedDate")
    var modifiedDate: LocalDateTime = LocalDateTime.now(),


    )
