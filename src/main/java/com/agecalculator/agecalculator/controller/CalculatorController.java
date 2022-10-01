package com.agecalculator.agecalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class CalculatorController {

    @GetMapping("/calcularedad/{day}/{month}/{year}")
    public Period calcToPressent(
            @PathVariable int day,
            @PathVariable int month,
            @PathVariable int year
    ){
        LocalDate inputDate = LocalDate.of(year, month, day);
        LocalDate pressentDate = LocalDate.now();
        return Period.between(pressentDate, inputDate);
    }

    @GetMapping("/calculate/{day}/{month}/{year}/to/{mday}/{mmonth}/{myear}")
    public Period calcCustomTime(
            @PathVariable int day,
            @PathVariable int month,
            @PathVariable int year,
            @PathVariable int mday,
            @PathVariable int mmonth,
            @PathVariable int myear
    ){
        LocalDate fromDate = LocalDate.of(year, month, day);
        LocalDate toDate = LocalDate.of(myear, mmonth, mday);

        return Period.between(toDate, fromDate);
    }

}
