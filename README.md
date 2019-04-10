Spring Boot Reactive & Kotlin Coroutines Demo
=============================================

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

* Kotlin Coroutines

```
    @GetMapping("/coroutines")
    suspend fun coroutine(): String {
        return "Hello Kotlin Coroutines!"
    }
```





