package lkwid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lkwid.model.Voter;
import lkwid.service.VoterService;

@RestController
@RequestMapping("/voter")
public class VoterController {
	
	@Autowired
	private VoterService voterService;
	
	@PostMapping
	public void newVoter(@RequestBody Voter voter) {
		voterService.createVoter(voter);
		
	}		

}
