package model.services;


import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentSerive;
	
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentSerive = paymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
				
		}
		
	}
	

