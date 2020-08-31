package com.bit.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;


@XmlRootElement
@XmlAccessorType (XmlAccessType.NONE)
public class passengerUtils {

	 public int age;
	 public String firstName;
	 public String from;
	 public String to;
	 public String lastName;
	public int getAge() {
		return age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	 

}
