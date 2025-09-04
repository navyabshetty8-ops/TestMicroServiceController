package com.lulu.test;

import java.util.ArrayList;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
 
 
@RestController

@RequestMapping("api/test")

public class TestMicroServicecontroller 
{

	List<Integer> intVal=new ArrayList<Integer>();

	@Autowired
 
	

	@RequestMapping("/welcome")  // url pattern 

	public List<Integer> welcome()

	{

		intVal.add(10);

		intVal.add(20);

		return intVal;

	}
}


 
