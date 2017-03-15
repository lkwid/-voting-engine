package lkwid.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lkwid.entity.Vote;
import lkwid.exception.ClosedProjectException;
import lkwid.service.VoteService;

@RestController
@RequestMapping("/vote")
public class VoteController {
	
	@Autowired
	private VoteService voteService;
	
	@GetMapping
	public Collection<Vote> showAllVotes() {
		return voteService.getAllVotes();
	}
	
	@PostMapping
	public void vote(@RequestBody Vote vote) throws ClosedProjectException {
		voteService.vote(vote);
	}

}
