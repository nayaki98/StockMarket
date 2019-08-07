package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyDao {
	public void insertCompany(Company company);
	public List<Company> getCompanyList() throws SQLException;
	public boolean updateCompamy(int companyCode,String ceo) throws SQLException;
	public boolean removeCompanyDetails(int companycode) throws SQLException;

}
