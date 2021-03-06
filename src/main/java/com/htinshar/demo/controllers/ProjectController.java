package com.htinshar.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.htinshar.demo.dao.ProjectRepository;
import com.htinshar.demo.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	@Autowired
	ProjectRepository projectRepo;

	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		model.addAttribute("project", new Project());
		return "new-project";
	}

	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		projectRepo.save(project);
		return "redirect:/projects/new";
	}
}
