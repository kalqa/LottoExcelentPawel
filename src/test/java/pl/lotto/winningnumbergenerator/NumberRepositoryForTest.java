package pl.lotto.winningnumbergenerator;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import pl.lotto.winningnumbergenerator.repository.WinningNumbersRepository;
import pl.lotto.winningnumbergenerator.winningnumbersdto.WinningNumbersDto;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class NumberRepositoryForTest implements WinningNumbersRepository {
    WinningNumbersTestConstants constants = new WinningNumbersTestConstants();
    HashMap<LocalDateTime, WinningNumbersDto> wonNumbers;

    public NumberRepositoryForTest() {
        wonNumbers = constants.map;
    }


    @Override
    public WinningNumbersDto save(WinningNumbersDto winningNumbersDto) {
        return wonNumbers.put(winningNumbersDto.drawDate(), winningNumbersDto);
    }

    @Override
    public Optional<WinningNumbersDto> findById(LocalDateTime dateTime) {
        return Optional.of(wonNumbers.get(dateTime));
    }

    @Override
    public boolean existsById(LocalDateTime dateTime) {
        return wonNumbers.containsKey(dateTime);
    }

    @Override
    public <S extends WinningNumbersDto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<WinningNumbersDto> findAll() {
        return null;
    }

    @Override
    public List<WinningNumbersDto> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends WinningNumbersDto> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends WinningNumbersDto> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends WinningNumbersDto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends WinningNumbersDto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<WinningNumbersDto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Iterable<WinningNumbersDto> findAllById(Iterable<LocalDateTime> localDateTimes) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(LocalDateTime dateTime) {

    }

    @Override
    public void delete(WinningNumbersDto entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends LocalDateTime> localDateTimes) {

    }

    @Override
    public void deleteAll(Iterable<? extends WinningNumbersDto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends WinningNumbersDto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends WinningNumbersDto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends WinningNumbersDto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends WinningNumbersDto> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends WinningNumbersDto, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
