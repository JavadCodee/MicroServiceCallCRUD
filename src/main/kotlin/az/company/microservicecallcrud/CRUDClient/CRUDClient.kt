package az.company.microservicecallcrud.CRUDClient

import az.company.microservicecallcrud.model.ExternalUser
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.*

@FeignClient(name = "FeignClient", url = "feign")
interface CRUDClient {
    @PostMapping("/user")
    fun create(@RequestBody externalUser: ExternalUser):ExternalUser
    @GetMapping("/user/{id}")
    fun get(@PathVariable id:Long):ExternalUser
    @PutMapping("user/{id}")
    fun update(@PathVariable id:Long,@RequestBody externalUser: ExternalUser):ExternalUser
    @DeleteMapping("user/{id}")
    fun delete(@PathVariable id:Long)
    @GetMapping("users")
    fun users():List<ExternalUser>
}
