package com.vieracode.payment.service.impl;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.vieracode.payment.common.CodeResponseEnum;
import com.vieracode.payment.exception.PaymentServiceException;
import com.vieracode.payment.model.NotificationModel;
import com.vieracode.payment.service.PaymentService;

@Service
@Qualifier("paymentServicesAsync")
public class PaymentServicesAsync implements PaymentService {
	Logger logger = LoggerFactory.getLogger(PaymentServicesAsync.class);

	/**
	 * account > 0 and <999999999
	 * 
	 * @param account
	 * @return true:ok, false:error
	 */
	public boolean validateAccount(int account) throws PaymentServiceException {
		if (account > 0 && account < 999999999)
			return true;
		throw new PaymentServiceException(CodeResponseEnum.ERROR_ACCOUNT);
	}
	/**
	 * Customer not null and not Empty
	 * 
	 * @param Customer
	 * @return
	 */
	public boolean validateCustomer(String customer) throws PaymentServiceException {
		if (null != customer && !customer.trim().isEmpty())
			return true;
		throw new PaymentServiceException(CodeResponseEnum.ERROR_CUSTOMER);
	}
	/**
	 * Amount >= 100.00 and < 30000
	 * 
	 * @param Amount
	 * @return
	 */
	public boolean validateAmount(float amount) throws PaymentServiceException {
		if (amount >= 100 && amount < 30000)
			return true;
		throw new PaymentServiceException(CodeResponseEnum.ERROR_AMOUNT);
	}
	/**
	 * Simulamos el llamado al API con un sleep de 50ms
	 * 
	 * @param notificationModel
	 * @return
	 * @throws InterruptedException
	 */
	@Async
	public String callApi(NotificationModel notificationModel) throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(50);
		logger.info("callApi Success with Async");
		return "Success";		
	}

	
}
