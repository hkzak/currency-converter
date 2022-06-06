package com.sks.currency.exchange.currencyexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sks.currency.exchange.currencyexchange.entity.CurrencyExchangeRate;
import com.sks.currency.exchange.currencyexchange.repo.ExchangeRepository;

@RestController
public class CurrencyExchangeController {

    // autowire exchange repository
    @Autowired  
    private  ExchangeRepository exchangeRepository;

    @GetMapping("/currency-service/from/{from}/to/{to}")
    public CurrencyExchangeRate getCurrencyExchangeRate( @PathVariable String from, @PathVariable
    String to) {

        // find the exchange rate
        CurrencyExchangeRate exchangeRate = exchangeRepository.findByFromAndTo(from, to);

        // print the exchange rate
        System.out.println("Exchange Rate: " + exchangeRate);

        // return the exchange rate if found
        if (exchangeRate != null) {
            return exchangeRate;
        }
        else {
            // return null if not found
            return null;
        }
    }
}
