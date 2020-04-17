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
	
	@Enumerated(EnumType.STRING)
	@Column(name="grade_ins", nullable=false)
	private Grade gradeIns;
	
	@Enumerated(EnumType.STRING)
	@Column(name="grade_out", nullable=false)
	private Grade gradeOut;
	
	@Enumerated(EnumType.STRING)
	@Column(name="grade_ply", nullable=false)
	private Grade gradePly;
	
	@Enumerated(EnumType.STRING)
	@Column(name="grade_ath", nullable=false)
	private Grade gradeAth;
	
	@Enumerated(EnumType.STRING)
	@Column(name="grade_def", nullable=false)
	private Grade gradeDef;
	
	@Enumerated(EnumType.STRING)
	@Column(name="grade_reb", nullable=false)
	private Grade gradeReb;
	
	@Column(name="salary", nullable=false)
	private int salary;
	
	public Player() {}
	
	public Player(String playerFirstName, String playerLastName, String positionPrimary, String positionSecondary, String gradeIns,
			String gradeOut, String gradePly, String gradeAth, String gradeDef, String gradeReb, int salary) {
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.positionPrimary = Position.valueOf(positionPrimary);
		if (!positionSecondary.isEmpty())
			this.positionSecondary = Position.valueOf(positionSecondary);
		this.gradeIns = Grade.valueOf(gradeIns);
		this.gradeOut = Grade.valueOf(gradeOut);
		this.gradePly = Grade.valueOf(gradePly);
		this.gradeAth = Grade.valueOf(gradeAth);
		this.gradeDef = Grade.valueOf(gradeDef);
		this.gradeReb = Grade.valueOf(gradeReb);
		this.salary = salary;
	}

	public Player(int playerId, String playerFirstName, String playerLastName, String positionPrimary, String positionSecondary, String gradeIns,
			String gradeOut, String gradePly, String gradeAth, String gradeDef, String gradeReb, int salary) {
		this.playerId = playerId;
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.positionPrimary = Position.valueOf(positionPrimary);
		if (!positionSecondary.isEmpty())
			this.positionSecondary = Position.valueOf(positionSecondary);
		this.gradeIns = Grade.valueOf(gradeIns);
		this.gradeOut = Grade.valueOf(gradeOut);
		this.gradePly = Grade.valueOf(gradePly);
		this.gradeAth = Grade.valueOf(gradeAth);
		this.gradeDef = Grade.valueOf(gradeDef);
		this.gradeReb = Grade.valueOf(gradeReb);
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

	public Grade getGradeIns() {
		return gradeIns;
	}

	public void setGradeIns(Grade gradeIns) {
		this.gradeIns = gradeIns;
	}

	public Grade getGradeOut() {
		return gradeOut;
	}

	public void setGradeOut(Grade gradeOut) {
		this.gradeOut = gradeOut;
	}

	public Grade getGradePly() {
		return gradePly;
	}

	public void setGradePly(Grade gradePly) {
		this.gradePly = gradePly;
	}

	public Grade getGradeAth() {
		return gradeAth;
	}

	public void setGradeAth(Grade gradeAth) {
		this.gradeAth = gradeAth;
	}

	public Grade getGradeDef() {
		return gradeDef;
	}

	public void setGradeDef(Grade gradeDef) {
		this.gradeDef = gradeDef;
	}

	public Grade getGradeReb() {
		return gradeReb;
	}

	public void setGradeReb(Grade gradeReb) {
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
