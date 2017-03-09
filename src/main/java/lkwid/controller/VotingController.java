package lkwid.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lkwid.dao.VotingDao;
import lkwid.model.Project;

@RestController
public class VotingController {
	
	@Autowired
	public VotingDao votingDao;
	
	@RequestMapping("/vote")
	public Collection<Project> showProjects() {
		return votingDao.getAll();
	}

}
