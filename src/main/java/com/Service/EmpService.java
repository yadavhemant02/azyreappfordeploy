package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Employee;
import com.Repository.WmpRepository;

@Service
public class EmpService {
    
	@Autowired
	private WmpRepository Emprepo;
	
	public Employee addEmp(Employee ss) {
		Employee aa = (Employee)this.Emprepo.save(ss);
		return aa;
	}
	
	public List<Employee> getEmp(){
		List<Employee> aa = (List<Employee>)this.Emprepo.findAll();
		return aa;
	}
}
