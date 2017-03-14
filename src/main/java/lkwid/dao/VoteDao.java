package lkwid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lkwid.entity.Vote;

@Repository
public interface VoteDao extends JpaRepository<Vote, Long>{
}
