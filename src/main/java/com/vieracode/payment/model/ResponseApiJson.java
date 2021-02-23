package com.vieracode.payment.model;

public class ResponseApiJson {

	private String codeResponse;	
	private String detail;
	
	public ResponseApiJson() {
		super();
	}

	public ResponseApiJson(String codeResponse, String detail) {
		super();
		this.codeResponse = codeResponse;
		this.detail = detail;
	}

	public String getCodeResponse() {
		return codeResponse;
	}

	public void setCodeResponse(String codeResponse) {
		this.codeResponse = codeResponse;
	}
	
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeResponse == null) ? 0 : codeResponse.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseApiJson other = (ResponseApiJson) obj;
		if (codeResponse == null) {
			if (other.codeResponse != null)
				return false;
		} else if (!codeResponse.equals(other.codeResponse))
			return false;
		return true;
	}
	
	
}
