package com.vieracode.payment.exception;

import com.vieracode.payment.common.CodeResponseEnum;

public class PaymentServiceException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private CodeResponseEnum errorEnum;

	public PaymentServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PaymentServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PaymentServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public PaymentServiceException(CodeResponseEnum errorEnum) {
		super(errorEnum.getCode()+": "+errorEnum.getDetail());
		this.errorEnum = errorEnum;
	}

	public CodeResponseEnum getErrorEnum() {
		return errorEnum;
	}	

	public PaymentServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
