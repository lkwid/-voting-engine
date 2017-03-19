package lkwid.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Vote {	
	@Id
	@GeneratedValue
	private long id;
	@NotNull
	private Boolean votingResult;
		
	@OneToOne
	private User user;	
	@ManyToOne	
	private Project project;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Boolean getVotingResult() {
		return votingResult;
	}
	public void setVotingResult(Boolean votingResult) {
		this.votingResult = votingResult;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
}
