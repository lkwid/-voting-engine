package lkwid.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lkwid.model.Voter;

@Repository
public interface VoterDao extends CrudRepository<Voter, Long> {		
}
