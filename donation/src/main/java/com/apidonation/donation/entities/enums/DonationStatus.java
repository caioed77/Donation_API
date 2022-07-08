package com.apidonation.donation.entities.enums;

public enum DonationStatus {

	ENTREGUE(1),
	PENDENTE(2),
	EM_ABERTO(3);

	
	private int code;
	
	private DonationStatus(int code) {
		this.code = code;
	}
	
	
	public int getCode() {
		return code;
	}
	
	public static DonationStatus valueof(int code) {
		for (DonationStatus value : DonationStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código da doação invalida");
	}
	
}
