package com.vieracode.payment.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.vieracode.payment.common.CodeResponseEnum;
import com.vieracode.payment.exception.PaymentServiceException;
import com.vieracode.payment.model.NotificationModel;
import com.vieracode.payment.model.ResponseApiJson;
import com.vieracode.payment.service.PaymentService;

@Component
public class PaymentComponent {

	@Autowired
	@Qualifier("paymentServices")
	PaymentService service;
	
	@Autowired
	@Qualifier("paymentServicesAsync")
	PaymentService serviceAsync;

	public ResponseApiJson callApiJson(NotificationModel notificationModel) {
		try {
			//Validaciones
			service.validateAccount(notificationModel.getAccount());
			service.validateAmount(notificationModel.getAmount());
			service.validateCustomer(notificationModel.getCustomer());
			//Call API
			service.callApi(notificationModel);
			return new ResponseApiJson(CodeResponseEnum.OK.getCode(), CodeResponseEnum.OK.getDetail());
		} catch (PaymentServiceException pse) {
			return new ResponseApiJson(pse.getErrorEnum().getCode(), pse.getErrorEnum().getDetail());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			return new ResponseApiJson("Internal Server Error",e.getMessage());
		}		
	}
	
	public ResponseApiJson callApiJsonAsync(NotificationModel notificationModel) {
		try {
			//Validaciones
			serviceAsync.validateAccount(notificationModel.getAccount());
			serviceAsync.validateAmount(notificationModel.getAmount());
			serviceAsync.validateCustomer(notificationModel.getCustomer());
			//Call API
			serviceAsync.callApi(notificationModel);
			return new ResponseApiJson(CodeResponseEnum.OK.getCode(), CodeResponseEnum.OK.getDetail());
		} catch (PaymentServiceException pse) {
			return new ResponseApiJson(pse.getErrorEnum().getCode(), pse.getErrorEnum().getDetail());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			return new ResponseApiJson("Internal Server Error",e.getMessage());
		}		
	}
}
