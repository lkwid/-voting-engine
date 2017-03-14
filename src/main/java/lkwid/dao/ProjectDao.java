package lkwid.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lkwid.model.Project;

@Repository
public interface ProjectDao extends CrudRepository<Project,Long> {	
}
