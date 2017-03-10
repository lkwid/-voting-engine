package lkwid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lkwid.dao.ProjectDao;
import lkwid.dao.VoterDao;
import lkwid.model.Voter;

@Controller
public class VoterController {
	
	@Autowired
	ProjectDao projectDao;
	@Autowired
	VoterDao voterDao;
	
	@GetMapping("/")
	public String newUser(ModelMap modelMap) {
		modelMap.addAttribute("voter", new Voter());
		modelMap.addAttribute("projects", projectDao.getOpen());
		return "voter";
	}
		
	@PostMapping("/")
	public String saveUser(@ModelAttribute Voter voter, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "voter";
		voterDao.save(voter);
		return "success";
	}
}
