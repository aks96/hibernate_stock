package com.usecase;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tradeCompany")
public class TradeCompany {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyId;
	private String companyName;
	private String symbol;
	private int stockPrice;
	private String companyDetails;
	
	@OneToMany(mappedBy = "tradeCompany")
	private Set<StockTrade> stockTrade = new HashSet<StockTrade>();
	
	public TradeCompany(int companyId, String companyName, int stockPrice, String companyDetails) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.stockPrice = stockPrice;
		this.companyDetails = companyDetails;
	}
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	public String getCompanyDetails() {
		return companyDetails;
	}
	public void setCompanyDetails(String companyDetails) {
		this.companyDetails = companyDetails;
	}
	
	
}
