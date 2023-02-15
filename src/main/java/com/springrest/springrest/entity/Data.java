package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Data {
	
	@Id
	private String barcode;
	
	private String shift;
	private String date;
	private String side;
	
	
	private String fitment;
	private String siming;
	private double torque;
	private double perload;
	private double simqty;
	private double pertable;
	private long token1;
	
	private String surfaceCleaning;
	private double spindle;
	private double hub;
	private String threadlock;
	private double hubspindlelock;
	private String oringfigment;
	private long token2;
	
	private String fitmentposition;
	private String checkperload;
	private String checkreading;
	private String checkring;
	private long token3;
	public Data(String shift, String date, String side, String barcode, String fitment, String siming, double torque,
			double perload, double simqty, double pertable, long token1, String surfaceCleaning, double spindle,
			double hub, String threadlock, double hubspindlelock, String oringfigment, long token2,
			String fitmentposition, String checkperload, String checkreading, String checkring, long token3) {
		super();
		this.shift = shift;
		this.date = date;
		this.side = side;
		this.barcode = barcode;
		this.fitment = fitment;
		this.siming = siming;
		this.torque = torque;
		this.perload = perload;
		this.simqty = simqty;
		this.pertable = pertable;
		this.token1 = token1;
		this.surfaceCleaning = surfaceCleaning;
		this.spindle = spindle;
		this.hub = hub;
		this.threadlock = threadlock;
		this.hubspindlelock = hubspindlelock;
		this.oringfigment = oringfigment;
		this.token2 = token2;
		this.fitmentposition = fitmentposition;
		this.checkperload = checkperload;
		this.checkreading = checkreading;
		this.checkring = checkring;
		this.token3 = token3;
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getFitment() {
		return fitment;
	}
	public void setFitment(String fitment) {
		this.fitment = fitment;
	}
	public String getSiming() {
		return siming;
	}
	public void setSiming(String siming) {
		this.siming = siming;
	}
	public double getTorque() {
		return torque;
	}
	public void setTorque(double torque) {
		this.torque = torque;
	}
	public double getPerload() {
		return perload;
	}
	public void setPerload(double perload) {
		this.perload = perload;
	}
	public double getSimqty() {
		return simqty;
	}
	public void setSimqty(double simqty) {
		this.simqty = simqty;
	}
	public double getPertable() {
		return pertable;
	}
	public void setPertable(double pertable) {
		this.pertable = pertable;
	}
	public long getToken1() {
		return token1;
	}
	public void setToken1(long token1) {
		this.token1 = token1;
	}
	public String getSurfaceCleaning() {
		return surfaceCleaning;
	}
	public void setSurfaceCleaning(String surfaceCleaning) {
		this.surfaceCleaning = surfaceCleaning;
	}
	public double getSpindle() {
		return spindle;
	}
	public void setSpindle(double spindle) {
		this.spindle = spindle;
	}
	public double getHub() {
		return hub;
	}
	public void setHub(double hub) {
		this.hub = hub;
	}
	public String getThreadlock() {
		return threadlock;
	}
	public void setThreadlock(String threadlock) {
		this.threadlock = threadlock;
	}
	public double getHubspindlelock() {
		return hubspindlelock;
	}
	public void setHubspindlelock(double hubspindlelock) {
		this.hubspindlelock = hubspindlelock;
	}
	public String getOringfigment() {
		return oringfigment;
	}
	public void setOringfigment(String oringfigment) {
		this.oringfigment = oringfigment;
	}
	public long getToken2() {
		return token2;
	}
	public void setToken2(long token2) {
		this.token2 = token2;
	}
	public String getFitmentposition() {
		return fitmentposition;
	}
	public void setFitmentposition(String fitmentposition) {
		this.fitmentposition = fitmentposition;
	}
	public String getCheckperload() {
		return checkperload;
	}
	public void setCheckperload(String checkperload) {
		this.checkperload = checkperload;
	}
	public String getCheckreading() {
		return checkreading;
	}
	public void setCheckreading(String checkreading) {
		this.checkreading = checkreading;
	}
	public String getCheckring() {
		return checkring;
	}
	public void setCheckring(String checkring) {
		this.checkring = checkring;
	}
	public long getToken3() {
		return token3;
	}
	public void setToken3(long token3) {
		this.token3 = token3;
	}
	@Override
	public String toString() {
		return "Data [shift=" + shift + ", date=" + date + ", side=" + side + ", barcode=" + barcode + ", fitment="
				+ fitment + ", siming=" + siming + ", torque=" + torque + ", perload=" + perload + ", simqty=" + simqty
				+ ", pertable=" + pertable + ", token1=" + token1 + ", surfaceCleaning=" + surfaceCleaning
				+ ", spindle=" + spindle + ", hub=" + hub + ", threadlock=" + threadlock + ", hubspindlelock="
				+ hubspindlelock + ", oringfigment=" + oringfigment + ", token2=" + token2 + ", fitmentposition="
				+ fitmentposition + ", checkperload=" + checkperload + ", checkreading=" + checkreading + ", checkring="
				+ checkring + ", token3=" + token3 + "]";
	}
	
	
	
}
