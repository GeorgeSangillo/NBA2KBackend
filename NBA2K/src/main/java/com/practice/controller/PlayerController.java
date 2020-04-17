package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Player;
import com.practice.service.PlayerServices;

@RestController
@RequestMapping("/nba2kapi/player")
@CrossOrigin(origins="*")
public class PlayerController {

	private PlayerServices playServ;
	
	@Autowired
	public PlayerController(PlayerServices playServ) {
		this.playServ = playServ;
	}
	
	@PostMapping("/createPlayer")
	public Player createPlayer(String playerFirstName, String playerLastName, String positionPrimary, String positionSecondary, String gradeIns, String gradeOut, String gradePly, String gradeAth, String gradeDef, String gradeReb, int salary) {
		return playServ.createPlayer(playerFirstName, playerLastName, positionPrimary, positionSecondary, gradeIns, gradeOut, gradePly, gradeAth, gradeDef, gradeReb, salary);
	}
}
