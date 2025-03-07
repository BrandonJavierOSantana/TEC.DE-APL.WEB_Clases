package mx.cdmadero.tecnm.TEC.DE.APL.WEB.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(schema = "Person", name = "Person")
class Person {
    @Id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    var

}