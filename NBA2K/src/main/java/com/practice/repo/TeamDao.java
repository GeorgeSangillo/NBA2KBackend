package com.practice.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.practice.model.Team;

@Repository("teamDao")
@Transactional
public interface TeamDao extends CrudRepository<Team, Integer> {

	List<Team> findAll();
	
	Team findByTeamId(int teamId);
	Team findByTeamName(String teamName);
}
