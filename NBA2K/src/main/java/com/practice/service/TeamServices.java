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
	
	public List<Team> retrieveAllTeams() {
		return teamDao.findAll();
	}
	
	public Team retrieveTeam(String teamName) {
		return teamDao.findByTeamName(teamName);
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
	
	public String[] competeTeam(String teamName1, String teamName2) {
		String[] output = new String[1];
		List<Player> team1 = teamDao.findByTeamName(teamName1).getPlayers();
		List<Player> team2 = teamDao.findByTeamName(teamName2).getPlayers();
		
		int team1Score = 0;
		int team2Score = 0;
		
		for (int i = 0; i < 5; i++) {
			team1Score += team1.get(i).getGradeIns() + team1.get(i).getGradeOut() + team1.get(i).getGradePly() + team1.get(i).getGradeAth() + team1.get(i).getGradeDef() + team1.get(i).getGradeReb() + (Math.random() * 100);
			team2Score += team2.get(i).getGradeIns() + team2.get(i).getGradeOut() + team2.get(i).getGradePly() + team2.get(i).getGradeAth() + team2.get(i).getGradeDef() + team2.get(i).getGradeReb() + (Math.random() * 100);
		}
		
		if (team1Score > team2Score)
			output[0] = teamName1 + " Wins!";
		else if (team1Score == team2Score)
			output[0] = teamName1 + " Must Go Into Overtime";
		else
			output[0] = teamName1 + " Loses :(";
		
		return output;
	}
}
