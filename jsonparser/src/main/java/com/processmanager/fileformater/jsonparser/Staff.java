package com.processmanager.fileformater.jsonparser;

public class Staff {
	private String name;
	private Boolean status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", status=" + status + "]";
	}
	
}
