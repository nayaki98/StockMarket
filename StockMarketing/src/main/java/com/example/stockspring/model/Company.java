package com.example.stockspring.model;

import java.util.List;

public class Company {
	private int companyCode;
	private String companyName;
	private double turnOver;
	private String ceo;
	private String boardOfDirectors;
	private List<String> stockExchanges;
	private int sectorId;
	private String briefWriteup;
	private int stockCode;
	public String getCompanyName() {
		return companyName;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public List<String> getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(List<String> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}
	public int getSectorOd() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		
		return "companyCode=" + companyCode + " companyName=" + companyName + " turnOver=" + turnOver
				+ " ceo=" + ceo + " boardOfDirectors=" + boardOfDirectors + " stockExchanges=" + stockExchanges
				+ " sectorId=" + sectorId + " briefWriteup=" + briefWriteup + " stockCode=" + stockCode + "\n";
	}

	
}
