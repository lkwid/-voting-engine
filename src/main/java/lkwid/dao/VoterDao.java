package lkwid.dao;

import org.springframework.data.repository.CrudRepository;

import lkwid.model.Voter;

public interface VoterDao extends CrudRepository<Voter, Long> {
}
