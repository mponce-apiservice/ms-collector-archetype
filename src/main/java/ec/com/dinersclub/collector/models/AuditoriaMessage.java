package ec.com.dinersclub.collector.models;

import io.vertx.core.json.JsonObject;

public class AuditoriaMessage {
	
	private String microservice;
	private String method;
	private String date;
	private String request;
	private String response;
	
	public AuditoriaMessage() {
    }

    public AuditoriaMessage(JsonObject json) {
    	this.microservice = json.getString("microservice");
    	this.method = json.getString("method");
    	this.date = json.getString("date");
    	this.request = json.getString("request");
    	this.response = json.getString("response");
    }
	
	public String getMicroservice() {
		return microservice;
	}
	
	public String getMethod() {
		return method;
	}
	
	public String getDate() {
		return date;
	}

	public String getRequest() {
		return request;
	}

	public String getResponse() {
		return response;
	}
	
}
