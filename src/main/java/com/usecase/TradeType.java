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
@Table(name="tradeType")
public class TradeType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int typeId;
	private String typename;
	
	@OneToMany(mappedBy="tradeType")
	private Set<StockTrade> stockTrade = new HashSet<StockTrade>();
	
	public TradeType(String typename) {
		super();
		this.typename = typename;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	
	
}
