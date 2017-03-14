package lkwid.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Vote {	
	@Id
	@GeneratedValue
	private long id;
	@NotNull
	private boolean voting;
		
	@OneToOne
	@NotNull
	private User user;
	
	@OneToOne
	@NotNull
	private Project project;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isVoting() {
		return voting;
	}
	public void setVoting(boolean voting) {
		this.voting = voting;
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
