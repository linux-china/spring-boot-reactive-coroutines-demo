package org.mvnsearch.demo

import io.reactivex.Single
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.util.concurrent.CompletableFuture

/**
 * Portal controller
 *
 * @author linux_china
 */
@RestController
class PortalController {
    @RequestMapping("/")
    fun index(): String {
        return "Hello World!!!"
    }

    @RequestMapping("/reactor")
    fun reactor(): Mono<String> {
        return Mono.just("Hello Reactor!")
    }

    @RequestMapping("/rxjava")
    fun rxjava(): Single<String> {
        return Single.just("Hello RxJava!")
    }

    @RequestMapping("/future")
    fun future(): CompletableFuture<String> {
        return CompletableFuture.supplyAsync {
            "Hello CompletableFuture!"
        }
    }

    @GetMapping("/coroutines")
    suspend fun coroutine(): String {
        return "Hello Kotlin Coroutines!"
    }
}