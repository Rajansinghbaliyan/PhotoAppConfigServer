package io.cherrytechnologies.photoappconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PhotoAppConfigServerApplication

fun main(args: Array<String>) {
	runApplication<PhotoAppConfigServerApplication>(*args)
}
