package lkwid.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Project {
	@Id
	@GeneratedValue	
	private long id;
	private String name;
	private String description;	
	private boolean closed;
	
	@OneToOne
	private Vote vote;	

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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean status) {
		this.closed = status;
	}	
	
	public Vote getVoting() {
		return vote;
	}
	public void setVoting(Vote vote) {
		this.vote = vote;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
		

}
