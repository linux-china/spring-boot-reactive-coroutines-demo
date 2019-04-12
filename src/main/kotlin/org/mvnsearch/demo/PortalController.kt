package org.mvnsearch.demo

import io.reactivex.Single
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
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
    suspend fun coroutines(): String {
        return "Hello Kotlin Coroutines!"
    }

    @FlowPreview
    @GetMapping("/coroutines/flow")
    fun coroutinesFlow(): Flow<String> {
        return flowOf("first", "second")
    }
}