package org.mvnsearch.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveCoroutinesDemoApp

fun main(args: Array<String>) {
	runApplication<ReactiveCoroutinesDemoApp>(*args)
}
