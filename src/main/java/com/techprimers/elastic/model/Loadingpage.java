package com.techprimers.elastic.model;

public class Loadingpage {

	private String attribute1;
	private String attribute2;
	private String value;
	private String option;
	public String getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}
	public String getAttribute2() {
		return attribute2;
	}
	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	
	public Loadingpage(String attribute1, String attribute2, String value, String option) {
		
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
		this.value = value;
		this.option = option;
	}
	
	public Loadingpage(){}
	@Override
	public String toString() {
		return "Loadingpage [attribute1=" + attribute1 + ", attribute2=" + attribute2 + ", value=" + value + ", option="
				+ option + "]";
	}
	
	
	
	
	
}
