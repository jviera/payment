package com.vieracode.payment.service;

import com.vieracode.payment.exception.PaymentServiceException;
import com.vieracode.payment.model.NotificationModel;
import com.vieracode.payment.model.ResponseApiJson;

public interface PaymentService {
	/**
	 * account > 0 and <999999999
	 * 
	 * @param account
	 * @return true:ok, false:error
	 */
	public boolean validateAccount(int account) throws PaymentServiceException;
	/**
	 * Customer not null and not Empty
	 * @param Customer
	 * @return
	 */
	public boolean validateCustomer(String customer) throws PaymentServiceException;
	/**
	 * Amount >= 100.00 and < 30000
	 * @param Amount
	 * @return
	 */
	public boolean validateAmount(float amount) throws PaymentServiceException;
	/**
	 * Simulamos el llamado al API con un sleep de 50ms
	 * @param notificationModel
	 * @return
	 * @throws InterruptedException 
	 */
	public String callApi(NotificationModel notificationModel) throws InterruptedException;

}
