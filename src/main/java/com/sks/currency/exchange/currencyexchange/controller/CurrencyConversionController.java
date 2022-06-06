package com.sks.currency.exchange.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sks.currency.exchange.currencyexchange.entity.CurrencyConversionResponse;
import com.sks.currency.exchange.currencyexchange.entity.CurrencyExchangeRate;
import com.sks.currency.exchange.currencyexchange.repo.ExchangeRepository;

@RestController
public class CurrencyConversionController {

    // autowire exchange repository
    @Autowired  
    private  ExchangeRepository exchangeRepository;

    @GetMapping("/currency-conversion/from/{from}/to/{to}/{quantity}")
    public CurrencyConversionResponse getCurrencyConversion( @PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
            
        // calculate the total calculated amount
        CurrencyExchangeRate exchangeRate = exchangeRepository.findByFromAndTo(from, to);

        return new CurrencyConversionResponse(exchangeRate.getId(), exchangeRate.getFrom(), exchangeRate.getTo(), exchangeRate.getExchangeRate(), quantity, exchangeRate.getExchangeRate().multiply(quantity));
       
    }

    
}
