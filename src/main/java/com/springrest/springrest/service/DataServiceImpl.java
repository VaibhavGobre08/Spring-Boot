package com.springrest.springrest.service;
 
//import java.util.ArrayList; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.DataDao;
import com.springrest.springrest.entity.Data;

@Service
public class DataServiceImpl implements DataService {

@Autowired
private DataDao dataDao;
	
//	   List<Data> list;
public DataServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Data("first", "08/02/23", "right", "123456", "ok", "ok", 225,
//				3, 5, 1, 123, "ok", 32, 33,
//				"ok", 226, "ok", 456, "ok",
//				"ok", "ok", "yes",789));
//		list.add(new Data("second", "10/02/23", "left", "9850669912", "ok", "ok", 296,
//				5, 8, 8, 456, "ok", 42, 38,
//				"ok", 226, "ok", 145, "ok",
//				"yes", "ok", "no",856));
		
	}
	
	@Override
	public List<Data> getData() {
		
		return dataDao.findAll();
	}
	
	@Override
	public Data getData(String barcode) {
		
		return dataDao.getOne(barcode);
	}

	@Override
	public Data addData(Data data) {
//	list.add(data);
		dataDao.save(data);
	return data;
	}

}
