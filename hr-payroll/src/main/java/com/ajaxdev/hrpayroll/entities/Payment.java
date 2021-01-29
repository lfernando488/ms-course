package com.ajaxdev.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nome;
	private Double dailyIncome;
	private Integer days;
	
	public Payment() {}

	public Payment(String nome, Double dailyIncome, Integer days) {
		super();
		this.nome = nome;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public double getTotal() {
		return days * dailyIncome;
	}
	
	
}
