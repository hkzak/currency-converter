package com.sks.currency.exchange.currencyexchange.entity;

import java.math.BigDecimal;

import org.bouncycastle.pqc.jcajce.provider.qtesla.SignatureSpi.qTESLA;

public class CurrencyConversionResponse {

    private long id;
    private String from;
    private String to;
    private BigDecimal exchangeRate;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;

    public CurrencyConversionResponse() {
    }

    public CurrencyConversionResponse(long id, String from, String to, BigDecimal exchangeRate, BigDecimal quantity, BigDecimal totalCalculatedAmount) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.exchangeRate = exchangeRate;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public long getId() {
        return id;
    }
    
    public void setId(long id) {
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    @Override
    public String toString() {
        return "CurrencyConversionResponse [id=" + id + ", from=" + from + ", to=" + to + ", exchangeRate=" + exchangeRate + ", quantity=" + quantity + ", totalCalculatedAmount=" + totalCalculatedAmount + "]";
    }
    
}
