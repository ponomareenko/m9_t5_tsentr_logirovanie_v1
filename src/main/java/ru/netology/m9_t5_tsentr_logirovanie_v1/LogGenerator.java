package ru.netology.m9_t5_tsentr_logirovanie_v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.LongStream;

@Slf4j
@Service
public class LogGenerator {

    public void generate(int count) {
        log.info("Start generating logs");
        LongStream.range(0, count)
                .forEach(i -> log.info("Log {}", i));
    }
}
