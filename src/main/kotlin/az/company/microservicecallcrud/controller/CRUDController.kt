package az.company.microservicecallcrud.controller

import az.company.microservicecallcrud.model.ExternalUser
import az.company.microservicecallcrud.service.CRUDService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/crud")
class CRUDController(private val crudService: CRUDService) {
    @PostMapping("/")
    fun createUser(@RequestBody externalUser: ExternalUser):ExternalUser {
        return crudService.createUser(externalUser)
    }
    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") id:Long):ExternalUser {
        return crudService.getUserId(id)
    }
    @PutMapping("/{id}")
    fun updateUser(@PathVariable("id") id:Long,@RequestBody externalUser: ExternalUser):ExternalUser {
        return crudService.updateUser(id, externalUser)
    }
    @DeleteMapping("/{id}")
    fun deleteUserById(@PathVariable("id") id:Long){
        return crudService.deleteUser(id)

    }

}