package tr.com.serhat.reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tr.com.serhat.reactive.model.Player;
import tr.com.serhat.reactive.service.PlayerService;


/**
 * @author serhat.ozkan
 */
@RestController
@RequiredArgsConstructor
public class PlayerRestController {

    private final PlayerService playerService;

    @GetMapping("/players/{id}")
    public Mono<Player> getWithId(final int id) {
        return playerService.getWithId(id);
    }

    @GetMapping("/players")
    public Flux<Player> getAll() {
        return playerService.getAll();
    }
}
