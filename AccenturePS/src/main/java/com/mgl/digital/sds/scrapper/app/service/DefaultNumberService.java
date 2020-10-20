package com.mgl.digital.sds.scrapper.app.service;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("MyNumberService")
public class DefaultNumberService implements NumberService {
    /**
     * Write a method in Java8+, such that the method generates a sequence of numbers
     * between 1 and 1000 inclusive.
     * It then keeps only the ones which are multiples of 3 or 5 and then squares them.
     * It returns the first 10 numbers from the series.
     */
    @Override
    public Map<String, Object> getNumbers() {
        Instant startTime = Instant.now();
        //TODO create the list discussed above
       Stream<Integer> numList = IntStream.rangeClosed(1, 1000).boxed();
       List<Integer> result = numList.filter(i->i%3==0 ||i%5==0).map(i->i*i).limit(10).collect(Collectors.toList());
       

        Map<String, Object> response = new HashMap<>();
        response.put("data", result);
        Instant endtime =Instant.now();
        //TODO calculate the time(nanosecs) it took to run this service.
        response.put("time_taken", Duration.between(startTime, endtime).toNanos());
        return response;
    }
}