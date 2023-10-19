package com.lulu.MiniProjectSportsProduct.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="SportsProduct")
public class SportsProduct {
	@Id
	int SportsProductid;
	String SportsProductname;
	int SportsProductcost;
	long phonenumber;
	public int getSportsProductid() {
		return SportsProductid;
	}
	public void setSportsProductid(int sportsProductid) {
		SportsProductid = sportsProductid;
	}
	public String getSportsProductname() {
		return SportsProductname;
	}
	public void setSportsProductname(String sportsProductname) {
		SportsProductname = sportsProductname;
	}
	public int getSportsProductcost() {
		return SportsProductcost;
	}
	public void setSportsProductcost(int sportsProductcost) {
		SportsProductcost = sportsProductcost;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "SportsProduct [SportsProductid=" + SportsProductid + ", SportsProductname=" + SportsProductname
				+ ", SportsProductcost=" + SportsProductcost + ", phonenumber=" + phonenumber + "]";
	}
	public SportsProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
