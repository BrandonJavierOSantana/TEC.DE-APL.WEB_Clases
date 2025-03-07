package mx.cdmadero.tecnm.TEC.DE.APL.WEB.services

import mx.cdmadero.tecnm.TEC.DE.APL.WEB.model.User
import mx.cdmadero.tecnm.TEC.DE.APL.WEB.repository.EmailAddressRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import java.util.*

@Controller
@RequestMapping("/")
class IndexController (val emailAddresssService: EmailAddresssService){

    @GetMapping("")
    fun getIndex(model: Model) : String {
        val emailAddress=emailAddresssService.getByEmailAddress(10)
        model.addAttribute("welcome", "Bienvenidos")
        model.addAttribute("emailAddress", emailAddress)
        return "index"
    }
    @PostMapping("/register")
    fun x(@ModelAttribute user: User) : String {
        return "index"
    }

}
