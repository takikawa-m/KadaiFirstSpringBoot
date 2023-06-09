package com.techacademyd;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date) {
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd"));
        String dayOfWeek = localDate.getDayOfWeek().toString();
        return dayOfWeek;
    }

    // ----演算子ここから
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
    	int res = 0;
    	res = val1 + val2;
    	return "実行結果：" + res;
    }

    @GetMapping("/minius/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
    	int res = 0;
    	res = val1 - val2;
    	return "実行結果:" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
    	int res = 0;
    	res = val1 * val2;
    	return "実行結果:" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
    	int res = 0;
    	res = val1 / val2;
    	return "実行結果:" + res;
    }


}