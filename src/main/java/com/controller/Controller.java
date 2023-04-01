package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Employee;
import com.Service.EmpService;



@RestController
public class Controller {

	@Autowired
	private EmpService empservice;
		
	@PostMapping("/")
	public ResponseEntity<?> adddata(@RequestBody Employee ss) {
		Employee aa = (Employee)this.empservice.addEmp(ss);
		return new ResponseEntity<Employee>(aa,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getdata(){
		List<Employee> aa = this.empservice.getEmp();
		return new ResponseEntity<List<Employee>>(aa,HttpStatus.OK);
	}
	
}
