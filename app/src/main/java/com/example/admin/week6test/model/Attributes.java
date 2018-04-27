package com.example.admin.week6test.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Attributes implements Serializable {

	@SerializedName("color")
	private String color;

	@SerializedName("size")
	private String size;

	@SerializedName("canonicalUrl")
	private String canonicalUrl;

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setCanonicalUrl(String canonicalUrl){
		this.canonicalUrl = canonicalUrl;
	}

	public String getCanonicalUrl(){
		return canonicalUrl;
	}

	@Override
 	public String toString(){
		return 
			"Attributes{" + 
			"color = '" + color + '\'' + 
			",size = '" + size + '\'' + 
			",canonicalUrl = '" + canonicalUrl + '\'' + 
			"}";
		}
}