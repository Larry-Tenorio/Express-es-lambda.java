package model.services;


import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentSerive;
	 
	
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentSerive = paymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
					LocalDate dueDate = contract.getDate().plusMonths(i);
					
					double interest =  paymentSerive.interest(basicQuota, i);
					double fee = paymentSerive.paymentFee(basicQuota + interest);		
					double quota = basicQuota + interest + fee;
					
					contract.getListInstaliment().add(new Installment(dueDate, quota));
				}
		}
		
	}
	

