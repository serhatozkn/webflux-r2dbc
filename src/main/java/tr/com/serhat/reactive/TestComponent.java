package tr.com.serhat.reactive;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import tr.com.serhat.reactive.model.Player;
import tr.com.serhat.reactive.repository.PlayerRepository;

import javax.annotation.PostConstruct;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author serhat.ozkan
 */
@Component
@RequiredArgsConstructor
public class TestComponent {

    private final PlayerRepository playerRepository;
    @PostConstruct
    public void onPostConstruct() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                runTest();
            }
        };
        new Timer().schedule(timerTask, 2_000);
    }

    private void runTest() {
        System.out.println("Sending request to endpoint...");
        WebClient client = WebClient.create("http://localhost:8080");
        Flux<Player> response = client.get().uri("/players").retrieve().bodyToFlux(Player.class);
        System.out.println("Results...");
        response.subscribe(System.out::println);
    }
}
