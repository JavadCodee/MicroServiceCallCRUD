package az.company.microservicecallcrud.service
import az.company.microservicecallcrud.CRUDClient.CRUDClient
import az.company.microservicecallcrud.model.ExternalUser
import org.springframework.stereotype.Service

@Service
class CRUDService(private val crudClient: CRUDClient) {

    fun createUser(externalUser: ExternalUser):ExternalUser{
        return crudClient.create(externalUser)
    }
    fun getUserId(id:Long):ExternalUser{
        return crudClient.get(id)
    }
    fun updateUser(id:Long,externalUser: ExternalUser):ExternalUser{
        return crudClient.update(id, externalUser)
    }
    fun deleteUser(id:Long){
        return crudClient.delete(id)

    }
    fun getAllUsers():List<ExternalUser>{
        return crudClient.users()
    }
}