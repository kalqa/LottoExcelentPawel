package pl.lotto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.time.Clock;


@SpringBootApplication
@EnableMongoRepositories
public class LottoApplication {

    Clock clock = Clock.systemDefaultZone();

    public static void main(String[] args) {
        SpringApplication.run(LottoApplication.class, args);
    }

}
