package tr.com.serhat.reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import tr.com.serhat.reactive.model.Player;

/**
 * @author serhat.ozkan
 */
@Repository
public interface PlayerRepository extends ReactiveCrudRepository<Player, Integer> {

}

