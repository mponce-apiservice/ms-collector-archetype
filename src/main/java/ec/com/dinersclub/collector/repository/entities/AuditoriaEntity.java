package ec.com.dinersclub.collector.repository.entities;

import ec.com.dinersclub.collector.models.AuditoriaMessage;

public class AuditoriaEntity {
	
	private String microservice;
	private String method;
	private String date;
	private String request;
	private String response;
	
	public AuditoriaEntity() {
    }
    
    public AuditoriaEntity(String microservice, String method, String date, String request, String response) {
    	this.setMicroservice(microservice);
        this.setMethod(method);
        this.setDate(date);
        this.setRequest(request);
        this.setResponse(response);
    }

    public AuditoriaEntity(AuditoriaMessage Auditoria) {
    	this.setMicroservice(Auditoria.getMicroservice());
        this.setMethod(Auditoria.getMethod());
        this.setDate(Auditoria.getDate());
        this.setRequest(Auditoria.getRequest());
        this.setResponse(Auditoria.getResponse());
    }

	public String getMicroservice() {
		return microservice;
	}

	public void setMicroservice(String microservice) {
		this.microservice = microservice;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
}