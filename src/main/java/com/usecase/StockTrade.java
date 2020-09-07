package com.usecase;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Stock_trade")
public class StockTrade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tradeId;
	
	@ManyToOne
	@JoinColumn(name="typeId")
	private TradeType tradeType;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private UserData userData;
	
	@ManyToOne
	@JoinColumn(name="symbol")
	private TradeCompany tradeCompany;
	
	private int shares;
	private int price;
	private LocalDateTime timeStamp;
	
	public StockTrade(int tradeId, TradeType tradeType, UserData userData, TradeCompany tradeCompany, int shares,
			int price, LocalDateTime timeStamp) {
		super();
		this.tradeId = tradeId;
		this.tradeType = tradeType;
		this.userData = userData;
		this.tradeCompany = tradeCompany;
		this.shares = shares;
		this.price = price;
		this.timeStamp = timeStamp;
	}
	public int getTradeId() {
		return tradeId;
	}
	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}
	public TradeType getTradeType() {
		return tradeType;
	}
	public void setTradeType(TradeType tradeType) {
		this.tradeType = tradeType;
	}
	public UserData getUserData() {
		return userData;
	}
	public void setUserData(UserData userData) {
		this.userData = userData;
	}
	public TradeCompany getTradeCompany() {
		return tradeCompany;
	}
	public void setTradeCompany(TradeCompany tradeCompany) {
		this.tradeCompany = tradeCompany;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
	
}
