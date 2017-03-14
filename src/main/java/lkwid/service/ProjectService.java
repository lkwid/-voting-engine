package lkwid.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lkwid.dao.ProjectDao;
import lkwid.model.Project;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectDao projectDao;
	
	public Collection<Project> getAll() {
		List<Project> projects = (List<Project>) projectDao.findAll();
		projects.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
		return projects;
	}
	
	public List<Project> getOpen() {
		List<Project> openProjects = new ArrayList<>();
		for (Project p : projectDao.findAll()) {
			if (!p.isClosed())
				openProjects.add(p);
		}
		return openProjects;
	}

}
