package com.bit.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlAccessorType (XmlAccessType.NONE)
public class TicketUtils {
	public String cusName;
	public String duration;
	public float fare;
	public String from;
	public String to;
	public int trainNo;
 
	
	
	
}
