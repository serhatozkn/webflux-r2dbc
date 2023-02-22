package tr.com.serhat.reactive.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tr.com.serhat.reactive.model.Player;
import tr.com.serhat.reactive.repository.PlayerRepository;

/**
 * @author serhat.ozkan
 */
@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    public Mono<Player> getWithId(final int id) {
        return playerRepository.findById(id);
    }

    public Flux<Player> getAll() {
        return playerRepository.findAll();
    }
}
