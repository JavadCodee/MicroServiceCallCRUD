package az.company.microservicecallcrud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class MicroServiceCallCrudApplication

fun main(args: Array<String>) {
	runApplication<MicroServiceCallCrudApplication>(*args)
}
