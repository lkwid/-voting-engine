package lkwid.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lkwid.model.Project;

public interface ProjectDao extends CrudRepository<Project,Long> {
	
	default Collection<Project> getAll() {
		List<Project> projects = (List<Project>) findAll();
		projects.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
		return projects;
	}
	
	default List<Project> getOpen() {
		List<Project> openProjects = new ArrayList<>();
		for (Project p : findAll()) {
			if (!p.isClosed())
				openProjects.add(p);
		}
		return openProjects;
	}
	
}
