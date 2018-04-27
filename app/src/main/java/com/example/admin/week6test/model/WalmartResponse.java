package com.example.admin.week6test.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class WalmartResponse{

	@SerializedName("nextPage")
	private String nextPage;

	@SerializedName("format")
	private String format;

	@SerializedName("items")
	private List<ItemsItem> items;

	public void setNextPage(String nextPage){
		this.nextPage = nextPage;
	}

	public String getNextPage(){
		return nextPage;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"WalmartResponse{" + 
			"nextPage = '" + nextPage + '\'' + 
			",format = '" + format + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}