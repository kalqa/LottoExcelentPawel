package pl.lotto.winningnumbergenerator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.lotto.winningnumbergenerator.repository.WinningNumbersRepository;

import java.time.Clock;

@Configuration
public class WiningNumberGeneratorConfiguration {
    // to be changed in production due to lack of WinningNumbersRepostory

    @Bean
    public WiningNumbersGeneratorFacade winingNumbersGeneratorFacade(WinningNumbersRepository winningNumbersRepository, Clock clock) {
        return buildDefaultModule(clock, winningNumbersRepository);
    }


    public WiningNumbersGeneratorFacade buildDefaultModule(Clock clock, WinningNumbersRepository repository) {
        DrawTimer timer = new DrawTimer(clock);
        NumberGenerator generator = new NumberGenerator();
        return new WiningNumbersGeneratorFacade(repository, timer, generator);
    }

    public WiningNumbersGeneratorFacade buildModuleForTests(Clock clock, WinningNumbersRepository repository) {
        return buildDefaultModule(clock, repository);
    }
}
