package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.model.Player;
import com.practice.model.Team;
import com.practice.repo.TeamDao;

@Service
public class TeamServices {

	private TeamDao teamDao;
	
	@Autowired
	public TeamServices(TeamDao teamDao) {
		this.teamDao = teamDao;
	}
	
	public Team createTeam(String teamName, List<Player> players) {
		Team newTeam = new Team(teamName, players);
		return teamDao.save(newTeam);
	}
	
	public Team updateTeam(int teamId, List<Player> players) {
		Team team = teamDao.findByTeamId(teamId);
		team.setPlayers(players);
		return teamDao.save(team);
	}
	
	public Team retrieveTeam(String teamName) {
		return teamDao.findByTeamName(teamName);
	}
}
