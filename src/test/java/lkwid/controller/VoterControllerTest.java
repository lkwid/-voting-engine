package lkwid.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lkwid.dao.ProjectDao;
import lkwid.model.Project;

@SpringBootTest
@RunWith(SpringRunner.class)
public class VoterControllerTest {

	@Autowired
	private ProjectDao projectDao;

	@Test
	public void fetchAll() {
		List<Project> projects = new ArrayList<>();
		for (Project p : projectDao.findAll()) {
			projects.add(p);
		}
		System.out.println(projects.get(0).getName());
		Assert.assertEquals(4, projects.size());
	}
	
	@Test
	public void getOpen() {
		List<Project> openProjects = projectDao.getOpen();
		Assert.assertEquals(3, openProjects.size());	}	

}
