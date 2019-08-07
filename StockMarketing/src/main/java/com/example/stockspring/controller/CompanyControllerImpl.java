package com.example.stockspring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.CompanyServiceImpl;

@Controller
public class CompanyControllerImpl implements CompanyController{

	
	@Autowired
	private CompanyService service;
	
	public void insertCompany(Company company) throws SQLException
	{
		service.insertCompany(company);
	}
	/*public List<Company> getCompanyList() throws SQLException
	{
		return service.getCompanyList();
		
	}*/
	public boolean updateCompamy(int companyCode,String ceo) throws SQLException{
		boolean result;
		result=service.updateCompamy(companyCode, ceo);
		return result;
	}
	public boolean removeCompanyDetails(int companycode) throws SQLException {
		boolean result=service.removeCompanyDetails(companycode);
		return result;
		
	}
	

	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("listCompany");
		mv.addObject("companyList",service.getCompanyList());
		return mv;
	}

	
	
	


	
}
