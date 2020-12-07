package com.htinshar.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.htinshar.demo.dao.EmployeeRepository;
import com.htinshar.demo.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepo;

	@GetMapping("/new")
	public String requestEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "new-employee";
	}

	@PostMapping("/save")
	public String saveEmployee(Employee employee) {
		employeeRepo.save(employee);
		return "redirect:/employees/new";
	}
}
