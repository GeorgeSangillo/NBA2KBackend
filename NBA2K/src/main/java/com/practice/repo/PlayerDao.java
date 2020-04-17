package com.practice.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.practice.model.Player;
import com.practice.model.Position;

@Repository("playerDao")
@Transactional
public interface PlayerDao extends CrudRepository<Player, Integer>{

	List<Player> findAll();
	List<Player> findByPositionPrimary(Position position);
	List<Player> findBySalary(int salary);
	
	Player findByPlayerId(int playerId);
}
