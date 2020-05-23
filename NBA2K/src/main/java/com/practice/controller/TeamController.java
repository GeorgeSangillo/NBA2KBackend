package com.practice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Player;
import com.practice.model.Team;
import com.practice.service.PlayerServices;
import com.practice.service.TeamServices;

@RestController
@RequestMapping("/nba2kapi/team")
@CrossOrigin(origins="*")
public class TeamController {

	private TeamServices teamServ;
	private PlayerServices playServ;
	
	@Autowired
	public TeamController(TeamServices teamServ, PlayerServices playServ) {
		this.teamServ = teamServ;
		this.playServ = playServ;
	}
	
	@GetMapping("/getAllTeams")
	public List<Team> getAllTeams() {
		System.out.println("in getAllTeams()");
		return teamServ.retrieveAllTeams();
	}
	
	@GetMapping("/getTeam")
	public Team getTeam(String teamName) {
		System.out.println("in getTeam(): " + teamName);
		return teamServ.retrieveTeam(teamName);
	}
	
	@PostMapping("/createTeam")
	public Team createTeam(@RequestBody Map<String, String> reqBody) {
		System.out.println("in createTeam(): " + reqBody);
		List<Player> playerList = playServ.retrievePlayers(Integer.parseInt(reqBody.get("playerOneId")), Integer.parseInt(reqBody.get("playerTwoId")), Integer.parseInt(reqBody.get("playerThreeId")), Integer.parseInt(reqBody.get("playerFourId")), Integer.parseInt(reqBody.get("playerFiveId")));
		return teamServ.createTeam(reqBody.get("teamName"), playerList);
	}
	
	@PutMapping("/updateTeam")
	public Team updateTeam(int teamId, int playerOneId, int playerTwoId, int playerThreeId, int playerFourId, int playerFiveId) {
		List<Player> playerList = playServ.retrievePlayers(playerOneId, playerTwoId, playerThreeId, playerFourId, playerFiveId);
		return teamServ.updateTeam(teamId, playerList);
	}
	
	@GetMapping("/{teamName1}vs{teamName2}")
	public String[] compete(@PathVariable("teamName1") String teamName1, @PathVariable("teamName2") String teamName2) {
		String[] output;
		output = teamServ.competeTeam(teamName1, teamName2);
		return output;
	}
}
