package com.Duplicate.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	public void vijay()
	{
		System.out.println("Vijay's code!!");
	}
	public void mrunal()
	{
		System.out.println("mrunal this side");
	}
	
	public static void main(String[] args) {
		
		Controller c=new Controller();
		c.mrunal();
				
		 
		
		System.out.println("Git demo");
	}
  

	
}
