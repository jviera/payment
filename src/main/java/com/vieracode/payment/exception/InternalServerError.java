package com.vieracode.payment.exception;

import java.nio.charset.Charset;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

public class InternalServerError extends HttpServerErrorException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InternalServerError(HttpStatus statusCode, String statusText, byte[] body, Charset charset) {
		super(statusCode, statusText, body, charset);
		// TODO Auto-generated constructor stub
	}

	public InternalServerError(HttpStatus statusCode, String statusText, HttpHeaders headers, byte[] body,
			Charset charset) {
		super(statusCode, statusText, headers, body, charset);
		// TODO Auto-generated constructor stub
	}

	public InternalServerError(HttpStatus statusCode, String statusText) {
		super(statusCode, statusText);
		// TODO Auto-generated constructor stub
	}

	public InternalServerError(HttpStatus statusCode) {
		super(statusCode);
		// TODO Auto-generated constructor stub
	}

	public InternalServerError(String message, HttpStatus statusCode, String statusText, HttpHeaders headers,
			byte[] body, Charset charset) {
		super(message, statusCode, statusText, headers, body, charset);
		// TODO Auto-generated constructor stub
	}

	
}
