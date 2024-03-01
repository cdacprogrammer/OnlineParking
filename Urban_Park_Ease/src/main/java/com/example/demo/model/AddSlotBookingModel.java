package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

	@Entity
	
public class AddSlotBookingModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String firstName;
    String lastName;
    String vehicleType;
    String vehicleNumber;
    String emailId;
    String phoneNumber;
    String parkingName;
    String selectSlot;
    LocalDate fromBookingDate;
    LocalDate toBookingDate;
    LocalTime fromTime;
    LocalTime toTime;
	Long providerId;

	public Long getProviderId() {
		return providerId;
	}
	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getParkingName() {
		return parkingName;
	}
	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}
	public String getSelectSlot() {
		return selectSlot;
	}
	public void setSelectSlot(String selectSlot) {
		this.selectSlot = selectSlot;
	}
	public LocalDate getFromBookingDate() {
		return fromBookingDate;
	}
	public void setFromBookingDate(LocalDate fromBookingDate) {
		this.fromBookingDate = fromBookingDate;
	}
	public LocalDate getToBookingDate() {
		return toBookingDate;
	}
	public void setToBookingDate(LocalDate toBookingDate) {
		this.toBookingDate = toBookingDate;
	}
	public LocalTime getFromTime() {
		return fromTime;
	}
	public void setFromTime(LocalTime fromTime) {
		this.fromTime = fromTime;
	}
	public LocalTime getToTime() {
		return toTime;
	}
	public void setToTime(LocalTime toTime) {
		this.toTime = toTime;
	}
	
	}