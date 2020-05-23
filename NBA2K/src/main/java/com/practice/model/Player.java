package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player {

	@Id
	@Column(name="player_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int playerId;
	
	@Column(name="player_first_name", nullable=false)
	private String playerFirstName;
	
	@Column(name="player_last_name", nullable=false)
	private String playerLastName;
	
	@Enumerated(EnumType.STRING)
	@Column(name="position_primary", nullable=false)
	private Position positionPrimary;
	
	@Enumerated(EnumType.STRING)
	@Column(name="position_secondary")
	private Position positionSecondary;
	
	@Column(name="grade_ins", nullable=false)
	private int gradeIns;
	
	@Column(name="grade_out", nullable=false)
	private int gradeOut;
	
	@Column(name="grade_ply", nullable=false)
	private int gradePly;
	
	@Column(name="grade_ath", nullable=false)
	private int gradeAth;
	
	@Column(name="grade_def", nullable=false)
	private int gradeDef;
	
	@Column(name="grade_reb", nullable=false)
	private int gradeReb;
	
	@Column(name="salary", nullable=false)
	private int salary;
	
	public Player() {}
	
	public Player(String playerFirstName, String playerLastName, String positionPrimary, String positionSecondary, int gradeIns,
			int gradeOut, int gradePly, int gradeAth, int gradeDef, int gradeReb, int salary) {
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.positionPrimary = Position.valueOf(positionPrimary);
		if (!positionSecondary.isEmpty())
			this.positionSecondary = Position.valueOf(positionSecondary);
		this.gradeIns = gradeIns;
		this.gradeOut = gradeOut;
		this.gradePly = gradePly;
		this.gradeAth = gradeAth;
		this.gradeDef = gradeDef;
		this.gradeReb = gradeReb;
		this.salary = salary;
	}

	public Player(int playerId, String playerFirstName, String playerLastName, String positionPrimary, String positionSecondary, int gradeIns,
			int gradeOut, int gradePly, int gradeAth, int gradeDef, int gradeReb, int salary) {
		this.playerId = playerId;
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.positionPrimary = Position.valueOf(positionPrimary);
		if (!positionSecondary.isEmpty())
			this.positionSecondary = Position.valueOf(positionSecondary);
		this.gradeIns = gradeIns;
		this.gradeOut = gradeOut;
		this.gradePly = gradePly;
		this.gradeAth = gradeAth;
		this.gradeDef = gradeDef;
		this.gradeReb = gradeReb;
		this.salary = salary;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}
	
	public String getPlayerLastName() {
		return playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}

	public Position getPositionPrimary() {
		return positionPrimary;
	}

	public void setPositionPrimary(Position positionPrimary) {
		this.positionPrimary = positionPrimary;
	}

	public Position getPositionSecondary() {
		return positionSecondary;
	}

	public void setPositionSecondary(Position positionSecondary) {
		this.positionSecondary = positionSecondary;
	}
	
	public int getGradeIns() {
		return gradeIns;
	}

	public void setGradeIns(int gradeIns) {
		this.gradeIns = gradeIns;
	}

	public int getGradeOut() {
		return gradeOut;
	}

	public void setGradeOut(int gradeOut) {
		this.gradeOut = gradeOut;
	}

	public int getGradePly() {
		return gradePly;
	}

	public void setGradePly(int gradePly) {
		this.gradePly = gradePly;
	}

	public int getGradeAth() {
		return gradeAth;
	}

	public void setGradeAth(int gradeAth) {
		this.gradeAth = gradeAth;
	}

	public int getGradeDef() {
		return gradeDef;
	}

	public void setGradeDef(int gradeDef) {
		this.gradeDef = gradeDef;
	}

	public int getGradeReb() {
		return gradeReb;
	}

	public void setGradeReb(int gradeReb) {
		this.gradeReb = gradeReb;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerFirstName=" + playerFirstName + ", playerLastName=" + playerLastName + ", positionPrimary=" + positionPrimary
				+ ", positionSecondary=" + positionSecondary + ", gradeIns=" + gradeIns + ", gradeOut=" + gradeOut
				+ ", gradePly=" + gradePly + ", gradeAth=" + gradeAth + ", gradeDef=" + gradeDef + ", gradeReb="
				+ gradeReb + ", salary=" + salary + "]";
	}
}
