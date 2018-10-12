package com.gamer.bean;

import javax.persistence.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PlayerBean {

	@Id
	@GeneratedValue
	private Integer PlayerId;
	private String PlayerName;
	private String PlayerType;
	private String PlayerLevel;
	private String PlayerRole;
	
	
	public PlayerBean() {
		
	}
	public Integer getPlayerId() {
		return PlayerId;
	}
	public void setPlayerId(Integer playerId) {
		PlayerId = playerId;
	}
	
	
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}


	public String getPlayerType() {
		return PlayerType;
	}
	public void setPlayerType(String playerType) {
		PlayerType = playerType;
	}


	public String getPlayerLevel() {
		return PlayerLevel;
	}
	public void setPlayerLevel(String playerLevel) {
		PlayerLevel = playerLevel;
	}


	public String getPlayerRole() {
		return PlayerRole;
	}
	public void setPlayerRole(String playerRole) {
		PlayerRole = playerRole;
	}

	
	public PlayerBean(Integer playerId, String playerName, String playerType,
			String playerLevel, String playerRole) {
		super();
		PlayerId = playerId;
		PlayerName = playerName;
		PlayerType = playerType;
		PlayerLevel = playerLevel;
		PlayerRole = playerRole;
	}
	
	
	public PlayerBean(String playerName, String playerType,
			String playerLevel, String playerRole) {
		super();
		PlayerName = playerName;
		PlayerType = playerType;
		PlayerLevel = playerLevel;
		PlayerRole = playerRole;
	}
	
	

	
	
}
