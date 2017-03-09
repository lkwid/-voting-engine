package lkwid.model;

import javax.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String surname;
	@OneToOne
	private Project project;
	
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

}
