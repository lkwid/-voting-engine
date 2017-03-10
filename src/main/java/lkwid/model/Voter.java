package lkwid.model;

import javax.persistence.*;

@Entity
public class Voter {
	@Id
	@GeneratedValue
	private long id;

	@OneToOne
	private Project project;
	
	private String name;	
	private String surname;
	private boolean vote;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public boolean isVote() {
		return vote;
	}
	public void setVote(boolean vote) {
		this.vote = vote;
	}	

}
