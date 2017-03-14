package lkwid.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lkwid.ClosedProjectException;
import lkwid.entity.Project;
import lkwid.entity.User;
import lkwid.entity.Vote;


@RunWith(SpringRunner.class)
@SpringBootTest
public class VoteServiceTest {		
	private User user;
	private Project openProject;
	private Project closedProject;
		
	@Autowired
	private UserService userService;
	@Autowired
	private ProjectService projectService;
	@Autowired
	private VoteService voteService;	
	
	@Before
	public void setUp() {		
		user = userService.getUser(1L);				
		openProject = projectService.getProject(1L);
		closedProject = projectService.getProject(4L);
	}
	
	@Test
	public void saveVote() throws ClosedProjectException {
		Vote vote = new Vote();
		vote.setProject(openProject);
		vote.setUser(user);
		vote.setVoting(true);
		voteService.vote(vote);
	}
	
	@Test
	public void shouldReturnNotNull() throws ClosedProjectException {
		Vote vote = new Vote();
		vote.setProject(openProject);
		vote.setUser(user);
		vote.setVoting(true);
		voteService.vote(vote);
		Assert.assertNotNull(voteService.getAllVotes());
	}
	
	@Test(expected = ClosedProjectException.class)
	public void shouldReturnClosedProjectException() throws ClosedProjectException {
		Vote vote = new Vote();
		vote.setProject(closedProject);
		vote.setUser(user);
		vote.setVoting(true);
		voteService.vote(vote);
	}

}
