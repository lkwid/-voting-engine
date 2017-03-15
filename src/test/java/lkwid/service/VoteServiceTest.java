package lkwid.service;

import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import lkwid.entity.Project;
import lkwid.entity.User;
import lkwid.entity.Vote;
import lkwid.exception.ClosedProjectException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class VoteServiceTest {		
	private User newUser;
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
		newUser = new User("Test", "Testowy");			
		openProject = projectService.getProject(1L);
		closedProject = projectService.getProject(4L);
	}
	
	@Test	
	@Rollback(true)
	public void createNewVote() throws ClosedProjectException {
		Vote vote = new Vote();
		userService.createUser(newUser);
		vote.setUser(newUser);
		vote.setProject(openProject);
		vote.setVotingResult(true);
		voteService.vote(vote);
		Assert.assertNotNull(vote);
	}
	
	@Test(expected = ClosedProjectException.class)
	@Rollback(true)
	public void shouldReturnClosedProjectException() throws ClosedProjectException {
		Vote vote = new Vote();		
		userService.createUser(newUser);
		vote.setProject(closedProject);
		vote.setUser(newUser);
		vote.setVotingResult(true);
		voteService.vote(vote);
	}
	
	@Test(expected = ConstraintViolationException.class)
	@Rollback(true)
	public void missingVotingShouldReturnNull() throws ClosedProjectException {
		Vote vote = new Vote();	
		userService.createUser(newUser);
		vote.setUser(newUser);
		vote.setProject(openProject);		
		voteService.vote(vote);
		Assert.assertNull(vote);		
	}

}
