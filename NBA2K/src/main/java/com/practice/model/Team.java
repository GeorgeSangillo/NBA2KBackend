package com.practice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="teams")
public class Team {

	@Id
	@Column(name="team_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teamId;
	
	@Column(name="team_name", unique=true, nullable=false)
	private String teamName;
	
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Player> players;
	
	public Team() {}
	
	public Team(String teamName, List<Player> players) {
		this.teamName = teamName;
		this.players = players;
	}

	public Team(int teamId, String teamName, List<Player> players) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.players = players;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", players=" + players + "]";
	}
}
