package pl.lotto.numberreceiver;

import pl.lotto.numberreceiver.repository.UserInput;
import pl.lotto.numberreceiver.repository.UserInputRepository;

import java.time.Clock;
import java.util.List;

public class UserInputRepositoryTest implements UserInputRepository {
    @Override
    public UserInput save(UserInput userInput) {
        return null;
    }

    @Override
    public List<UserInput> findAllByDate(Clock date) {
        return null;
    }
}
