package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entity.Data;

public interface DataService {

	public List<Data> getData();
	
	public Data getData(String barcode);
	
	public Data addData(Data data);
	
}
