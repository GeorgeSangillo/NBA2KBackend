package com.practice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Player;
import com.practice.model.Position;
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
	
	@GetMapping("/getAllPlayers")
	public Map<Position, List<Player>> getAllPlayers() {
		return playServ.retrieveAllPlayers();
	}
	
	@PostMapping("/createPlayer")
	public Player createPlayer(String playerFirstName, String playerLastName, String positionPrimary, String positionSecondary, int gradeIns, int gradeOut, int gradePly, int gradeAth, int gradeDef, int gradeReb, int salary) {
		return playServ.createPlayer(playerFirstName, playerLastName, positionPrimary, positionSecondary, gradeIns, gradeOut, gradePly, gradeAth, gradeDef, gradeReb, salary);
	}
	
	@PostMapping("/initialPlayerDump")
	public List<Player> initialPlayerDump() {
		List<Player> playerList = new ArrayList<>();
		
		playerList.add(playServ.createPlayer("LeBron",			"James",			"SMALL_FORWARD",	"POINT_GUARD",		89, 86, 92, 92, 75, 60, 5));
		playerList.add(playServ.createPlayer("Giannis",			"Antetokounmpo",	"POWER_FORWARD",	"CENTER",			89, 84, 84, 88, 82, 89, 5));
		playerList.add(playServ.createPlayer("James",			"Harden",			"SHOOTING_GUARD",	"POINT_GUARD",		79, 91, 89, 90, 67, 52, 5));
		playerList.add(playServ.createPlayer("Kevin",			"Durant",			"SMALL_FORWARD",	"POWER_FORWARD",	80, 94, 78, 80, 74, 51, 5));
		playerList.add(playServ.createPlayer("Kawhi",			"Leonard",			"SMALL_FORWARD",	"POWER_FORWARD",	79, 89, 80, 83, 89, 59, 5));
		playerList.add(playServ.createPlayer("Luka",			"Doncic",			"SHOOTING_GUARD",	"POINT_GUARD",		78, 91, 90, 84, 63, 78, 5));
		playerList.add(playServ.createPlayer("Anthony",			"Davis",			"POWER_FORWARD",	"CENTER",			92, 85, 65, 86, 83, 78, 5));
		playerList.add(playServ.createPlayer("Stephen",			"Curry",			"POINT_GUARD",		"SHOOTING_GUARD",	58, 95, 92, 83, 67, 54, 5));
		playerList.add(playServ.createPlayer("Damian",			"Lillard",			"POINT_GUARD",		"",					63, 92, 90, 88, 58, 42, 5));
		
		playerList.add(playServ.createPlayer("Nikola",			"Jokic",			"CENTER",			"",					88, 89, 76, 78, 60, 84, 4));
		playerList.add(playServ.createPlayer("Kyrie",			"Irving",			"POINT_GUARD",		"",					63, 91, 89, 80, 65, 49, 4));
		playerList.add(playServ.createPlayer("Trae",			"Young",			"POINT_GUARD",		"",					54, 90, 91, 79, 48, 44, 4));
		playerList.add(playServ.createPlayer("Karl-Anthony",	"Towns",			"CENTER",			"",					88, 88, 68, 83, 62, 81, 4));
		playerList.add(playServ.createPlayer("Paul",			"George",			"SHOOTING_GUARD",	"SMALL_FORWARD",	74, 84, 78, 83, 82, 54, 4));
		playerList.add(playServ.createPlayer("Russell",			"Westbrook",		"POINT_GUARD",		"SHOOTING_GUARD",	74, 78, 87, 92, 70, 60, 4));
		playerList.add(playServ.createPlayer("Bradley",			"Beal",				"SHOOTING_GUARD",	"SMALL_FORWARD",	66, 89, 80, 80, 61, 46, 4));
		playerList.add(playServ.createPlayer("Klay",			"Thompson",			"SHOOTING_GUARD",	"SMALL_FORWARD",	66, 89, 69, 78, 77, 42, 4));
		playerList.add(playServ.createPlayer("Ben",				"Simmons",			"POINT_GUARD",		"SMALL_FORWARD",	86, 72, 83, 88, 81, 62, 4));
		playerList.add(playServ.createPlayer("Jayson",			"Tatum",			"POWER_FORWARD",	"SMALL_FORWARD",	73, 88, 73, 80, 73, 56, 4));
		playerList.add(playServ.createPlayer("Jimmy",			"Butler",			"SMALL_FORWARD",	"SHOOTING_GUARD",	69, 78, 81, 80, 82, 61, 4));
		playerList.add(playServ.createPlayer("Donovan",			"Mitchell",			"SHOOTING_GUARD",	"SMALL_FORWARD",	63, 90, 79, 86, 69, 44, 4));
		playerList.add(playServ.createPlayer("Chris",			"Paul",				"POINT_GUARD",		"",					57, 90, 85, 77, 77, 48, 4));
		playerList.add(playServ.createPlayer("Rudy",			"Gobert",			"CENTER",			"",					75, 66, 35, 67, 76, 88, 4));
		playerList.add(playServ.createPlayer("Kemba",			"Walker",			"POINT_GUARD",		"",					54, 86, 87, 82, 62, 44, 4));
		playerList.add(playServ.createPlayer("Hassan",			"Whiteside",		"CENTER",			"",					73, 74, 41, 69, 66, 92, 4));
		playerList.add(playServ.createPlayer("Khris",			"Middleton",		"SMALL_FORWARD",	"SHOOTING_GUARD",	62, 92, 73, 74, 68, 53, 4));
		
		playerList.add(playServ.createPlayer("Zion",			"Williamson",		"POWER_FORWARD",	"CENTER",			82, 76, 68, 87, 62, 77, 3));
		playerList.add(playServ.createPlayer("Kristaps",		"Porzingis",		"CENTER",			"POWER_FORWARD",	85, 84, 49, 77, 66, 79, 3));
		playerList.add(playServ.createPlayer("Devin",			"Booker",			"SHOOTING_GUARD",	"POINT_GUARD",		54, 90, 80, 73, 55, 43, 3));
		playerList.add(playServ.createPlayer("Brandon",			"Ingram",			"SMALL_FORWARD",	"POWER_FORWARD",	71, 88, 73, 75, 60, 58, 3));
		playerList.add(playServ.createPlayer("DeMar",			"DeRozan",			"SMALL_FORWARD",	"SHOOTING_GUARD",	76, 84, 78, 84, 64, 50, 3));
		playerList.add(playServ.createPlayer("John",			"Wall",				"POINT_GUARD",		"",					63, 80, 90, 86, 74, 41, 3));
		
		playerList.add(playServ.createPlayer("Mitchell",		"Robinson",			"CENTER",			"",					70, 69, 38, 69, 73, 82, 2));
		playerList.add(playServ.createPlayer("Malcolm",			"Brogdon",			"POINT_GUARD",		"SHOOTING_GUARD",	62, 86, 85, 79, 65, 50, 2));
		playerList.add(playServ.createPlayer("Victor",			"Oladipo",			"SHOOTING_GUARD",	"POINT_GUARD",		60, 79, 75, 81, 74, 50, 2));
		playerList.add(playServ.createPlayer("Jrue",			"Holiday",			"SHOOTING_GUARD",	"POINT_GUARD",		52, 69, 78, 76, 78, 47, 2));
		playerList.add(playServ.createPlayer("Eric",			"Bledsoe",			"POINT_GUARD",		"",					52, 77, 82, 81, 76, 49, 2));
		playerList.add(playServ.createPlayer("Jusuf",			"Nurkic",			"CENTER",			"",					76, 77, 47, 66, 64, 90, 2));
		playerList.add(playServ.createPlayer("Spencer",			"Dinwiddie",		"POINT_GUARD",		"SHOOTING_GUARD",	59, 81, 87, 70, 59, 41, 2));
		playerList.add(playServ.createPlayer("Jonas",			"Valanciunas",		"CENTER",			"",					76, 81, 42, 73, 60, 85, 2));
		playerList.add(playServ.createPlayer("Jaren",			"Jackson Jr.",		"POWER_FORWARD",	"CENTER",			75, 82, 38, 77, 74, 53, 2));
		playerList.add(playServ.createPlayer("Blake",			"Griffin",			"POWER_FORWARD",	"CENTER",			84, 68, 71, 86, 62, 53, 2));
		playerList.add(playServ.createPlayer("Marvin",			"Bagley III",		"CENTER",			"POWER_FORWARD",	81, 81, 53, 82, 60, 81, 2));
		playerList.add(playServ.createPlayer("Al",				"Horford",			"POWER_FORWARD",	"CENTER",			73, 77, 62, 74, 72, 59, 2));
		playerList.add(playServ.createPlayer("Buddy",			"Hield",			"SHOOTING_GUARD",	"SMALL_FORWARD",	54, 86, 73, 72, 55, 51, 2));
		playerList.add(playServ.createPlayer("Kevin",			"Love",				"POWER_FORWARD",	"CENTER",			78, 87, 57, 74, 55, 77, 2));
		playerList.add(playServ.createPlayer("Gordon",			"Hayward",			"SMALL_FORWARD",	"POWER_FORWARD",	62, 88, 75, 77, 61, 56, 2));
		
		return playerList;
	}
}
