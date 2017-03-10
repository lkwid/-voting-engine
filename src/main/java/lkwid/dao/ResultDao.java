package lkwid.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import lkwid.model.Project;
import lkwid.model.Result;

public class ResultDao {
	private Map<Long, Result> results;	
	
	@Autowired
	public ProjectDao projectDao;
	
//	public Collection<Result> getResults() {
//		results = new HashMap<>();
//		List<Project> projects = (List<Project>) projectDao.findAll();
//		
//	}

}
