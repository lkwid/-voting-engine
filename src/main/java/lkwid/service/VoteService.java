package lkwid.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lkwid.dao.VoteDao;
import lkwid.entity.Project;
import lkwid.entity.Vote;
import lkwid.exception.ClosedProjectException;

@Service
public class VoteService {

	@Autowired
	private VoteDao voteDao;
	@Autowired
	private ProjectService projectService;

	public Collection<Vote> getAllVotes() {
		return voteDao.findAll();
	}

	public Vote getVote(long id) {
		return voteDao.findOne(id);
	}

	public void vote(Vote vote) throws ClosedProjectException {
		Project project = projectService.getProject(vote.getProject().getId());		
		if (project.isClosed())
			throw new ClosedProjectException();		
		else
			voteDao.save(vote);		
	}
}
