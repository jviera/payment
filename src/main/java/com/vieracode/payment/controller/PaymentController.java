package com.vieracode.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vieracode.payment.component.PaymentComponent;
import com.vieracode.payment.model.NotificationModel;
import com.vieracode.payment.model.ResponseApiJson;

@RestController
@RequestMapping("payment")
public class PaymentController {
	
	@Autowired
	PaymentComponent component;

	@GetMapping("/ping")
	public String ping(@RequestParam String name) {
		return "Hello "+name;
	}	
	
	@PostMapping("/notification")
    public ResponseApiJson paymentNotification(@RequestBody NotificationModel notificationModel) {
    	return component.callApiJson(notificationModel);
    }
	
	@PostMapping("/v2/notification")
    public ResponseApiJson paymentNotificationAsync(@RequestBody NotificationModel notificationModel) {
    	return component.callApiJsonAsync(notificationModel);
    }
}
