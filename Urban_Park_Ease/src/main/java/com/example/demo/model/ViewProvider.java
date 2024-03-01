package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ViewProvider {
	@Id
	String providerName;
	String address;
	int slotCapacity;
	String mobile;
	
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSlotCapacity() {
		return slotCapacity;
	}
	public void setSlotCapacity(int slotCapacity) {
		this.slotCapacity = slotCapacity;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
