package com.demo.JACKSONINJECT;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JacksonInject;

public class CurrencyRate {
	/*
	 * @JacksonInject annotation is used to indicate that value of annotated
	 * property will be injected during deserialization. This is useful if we want
	 * to add additional information which is not included in the source JSON
	 */
	private String pair;
    private double rate;
    @JacksonInject("lastUpdated")
    private LocalDateTime lastUpdated;
	public CurrencyRate() {
	}
	public String getPair() {
		return pair;
	}
	public void setPair(String pair) {
		this.pair = pair;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	@Override
	public String toString() {
		return "CurrencyRate {pair=" + pair + ", rate=" + rate + ", lastUpdated=" + lastUpdated + "}";
	}
    
}
