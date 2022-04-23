package io.cherrytechnologies.photoappconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class PhotoAppConfigServerApplication

fun main(args: Array<String>) {
    runApplication<PhotoAppConfigServerApplication>(*args)
}
