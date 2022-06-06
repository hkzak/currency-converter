package com.sks.currency.exchange.currencyexchange.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyExchangeRate {

    @Id
    private long id;

    @Column(name = "from_currency")
    private String from;

    @Column(name = "to_currency")
    private String to;
    private BigDecimal exchangeRate;

    public CurrencyExchangeRate() {
    }

    // constructor
    public CurrencyExchangeRate(long id, String from, String to, BigDecimal exchangeRate) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.exchangeRate = exchangeRate;
    }  

    // getters and setters
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "CurrencyExchangeRate [id=" + id + ", from=" + from + ", to=" + to + ", exchangeRate=" + exchangeRate + "]";
    }


}
