package pl.lotto.numberreceiver;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class DuplicateChecker implements Conditionable {

    @Override
    public ValidateMessage validateCondition(List<Integer> list) {
        int listLength = list.size();
        int numbersCount = countNumbersFromUser(list);
        return listLength == numbersCount ? ValidateMessage.CORRECT_MESSAGE : ValidateMessage.CONTAINS_DUPLICATES;
    }

    private static int countNumbersFromUser(List<Integer> list) {
        return Arrays.stream(list.toArray())
                .collect(Collectors.toSet())
                .size();
    }
}
