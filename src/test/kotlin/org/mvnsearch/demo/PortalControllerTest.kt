package org.mvnsearch.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.test.web.reactive.server.WebTestClient

/**
 * PortalController test
 *
 * @author linux_china
 */
@WebFluxTest(PortalController::class)
class PortalControllerTest {
    @Autowired
    lateinit var webTestClient: WebTestClient

    @Test
    fun testPortalController() {
        webTestClient.get()
            .uri("/coroutines")
            .exchange()
            .expectStatus().isOk
            .expectBody()
    }
}