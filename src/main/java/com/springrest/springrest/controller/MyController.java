package com.springrest.springrest.controller;

import java.util.List;



//import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Data;
import com.springrest.springrest.service.DataService;

@RestController
public class MyController {

	@Autowired
	private DataService dataService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	//get the value
	@GetMapping("/data")
	public List<com.springrest.springrest.entity.Data> getData() 
	{
		return this.dataService.getData();
	}
	
	@GetMapping("/data/{barcode}")
    public Data getData(@PathVariable String barcode) {
		return this.dataService.getData(barcode);
	}
	
	@PostMapping(path="/data", consumes="application/json")
	public Data addData(@RequestBody Data data) 
	{
		return this.dataService.addData(data);
	}
}
