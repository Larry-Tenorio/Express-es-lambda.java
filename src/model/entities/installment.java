package model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {

	private LocalDate date;
	private Double amount;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

	public Installment() {
		
	}
	
	public Installment(LocalDate dueDate, Double amount) {
		this.date = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return date;
	}

	public void setDueDate(LocalDate dueDate) {
		this.date = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return date.format(fmt)
				+ " - " + String.format("%.2f", amount);
	}
}
