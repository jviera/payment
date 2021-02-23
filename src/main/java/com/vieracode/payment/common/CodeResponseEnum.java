package com.vieracode.payment.common;

public enum CodeResponseEnum {

	OK("1", "Success"),
	ERROR_ACCOUNT("-1", "Error al intentar validar la cuenta."),
	ERROR_CUSTOMER("-2", "Error al intentar validar al cliente."),
	ERROR_AMOUNT("-3", "Error al intentar validar el monto");

	private CodeResponseEnum(String code, String detail) {
		this.code = code;
		this.detail = detail;
	}	
	
	public String getCode() {
		return code;
	}
	public String getDetail() {
		return detail;
	}
	
	private final String code;
	private final String detail;
}
