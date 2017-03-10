package lkwid.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lkwid.dao.ProjectDao;
import lkwid.dao.VoterDao;
import lkwid.model.Project;
import lkwid.model.Voter;

@RestController
public class ResultController {
	@Autowired
	private VoterDao voterDao;
	@Autowired
	private ProjectDao projectDao;

	@RequestMapping("/results")
	public Map<Long, Map<Long, Boolean>> votingResults() {
		Map<Long, Map<Long, Boolean>> results = new HashMap<>();
		Map<Long, Boolean> voters;
		Collection<Project> projects = (Collection<Project>) projectDao.findAll();
		List<Voter> votersPerProject;
		for (Project p : projects) {
			votersPerProject = p.getVoters();
			voters = new HashMap<>();
			for (Voter v : votersPerProject) {				
				voters.put(v.getId(), v.isVote());
			}
			results.put(p.getId(), voters);		
		}
		return results;
	}
}
