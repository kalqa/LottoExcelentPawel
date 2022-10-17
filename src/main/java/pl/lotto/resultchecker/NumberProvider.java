package pl.lotto.resultchecker;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.time.LocalDateTime;
import java.util.List;

public interface NumberProvider {

    List<Integer> getWinningNumbers(LocalDateTime localDateTime);
}
