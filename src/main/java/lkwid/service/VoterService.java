package lkwid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lkwid.dao.VoterDao;
import lkwid.model.Voter;

@Service
public class VoterService {

	@Autowired
	private VoterDao voterDao;
	
	public void createVoter(Voter voter) {
		voterDao.save(voter);
	}
	
}
