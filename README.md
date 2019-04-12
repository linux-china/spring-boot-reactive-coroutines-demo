Spring Boot Reactive & Kotlin Coroutines Demo
=============================================

### Requirements

* JDK 11
* Kotlin 1.3.30
* Spring Framework 5.2.0.M1
* Spring Boot 2.2.0.M1

### Non Blocking Features

* Reactor
```
    @RequestMapping("/reactor")
    fun reactor(): Mono<String> {
        return Mono.just("Hello Reactor!")
    }
```

* RxJava

```
    @RequestMapping("/rxjava")
    fun rxjava(): Single<String> {
        return Single.just("Hello RxJava!")
    }
```

* CompletableFuture

```
    @RequestMapping("/future")
    fun future(): CompletableFuture<String> {
        return CompletableFuture.supplyAsync {
            "Hello CompletableFuture!"
        }
    }
```

* Kotlin Coroutines with suspend keyword

```
    @GetMapping("/coroutines")
    suspend fun coroutine(): String {
        return "Hello Kotlin Coroutines!"
    }
```

* Kotlin Coroutines with Flow

```
    @GetMapping("/coroutines/flow")
    fun coroutineFlow(): Flow<String> {
        return flowOf("first", "second")
    }
```

### References

* Going Reactive with Spring, Coroutines and Kotlin Flow: https://spring.io/blog/2019/04/12/going-reactive-with-spring-coroutines-and-kotlin-flow
* Spring with Kotlin: https://docs.spring.io/spring-framework/docs/5.2.0.M1/spring-framework-reference/languages.html#kotlin
