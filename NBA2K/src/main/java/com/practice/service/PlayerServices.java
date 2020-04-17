package com.practice.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.model.Player;
import com.practice.model.Position;
import com.practice.repo.PlayerDao;

@Service
public class PlayerServices {

	private PlayerDao playDao;
	
	@Autowired
	public PlayerServices(PlayerDao playDao) {
		this.playDao = playDao;
	}
	
	public Player createPlayer(String playerFirstName, String playerLastName, String positionPrimary, String positionSecondary, String gradeIns, String gradeOut, String gradePly, String gradeAth, String gradeDef, String gradeReb, int salary) {
		Player newPlayer = new Player(playerFirstName, playerLastName, positionPrimary, positionSecondary, gradeIns, gradeOut, gradePly, gradeAth, gradeDef, gradeReb, salary);
		return playDao.save(newPlayer);
	}
	
	// Does it make more sense to set returned player to a new player obj based on given values? OR use setters to update all fields?
	public Player updatePlayer(String playerFirstName, String playerLastName, int positionPrimaryId, int positionSecondaryId, int gradeInsId, int gradeOutId, int gradePlyId, int gradeAthId, int gradeDefId, int gradeRebId, int salary) {
//		Player newPlayer = new Player(playerName, new Position(positionPrimaryId), new Position(positionSecondaryId), new Grade(gradeInsId), new Grade(gradeOutId), new Grade(gradePlyId), new Grade(gradeAthId), new Grade(gradeDefId), new Grade(gradeRebId), salary);
//		return playDao.save(newPlayer);
		return null;
	}
	
	public Map<Position, List<Player>> retrieveAllPlayers(){
		Map<Position, List<Player>> playerMap = new LinkedHashMap<>();
		Position[] positionArr = Position.values();
		for (Position pos: positionArr) {
			playerMap.put(pos, playDao.findByPositionPrimary(pos));
		}
		return playerMap;
	}
	
	public List<Player> retrievePlayers(int ... playerId) {
		List<Player> playerList = new ArrayList<>();
		for (int id: playerId) {
			playerList.add(playDao.findByPlayerId(id));
		}
		return playerList;
	}
}
