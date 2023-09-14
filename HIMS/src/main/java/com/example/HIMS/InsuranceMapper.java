package com.example.HIMS;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class InsuranceMapper implements RowMapper<Insurance>  {


	@Override
	public Insurance mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Insurance i=new Insurance();
		i.setInsr_id(rs.getInt(1));
		i.setInsr_cust_id(rs.getInt(2));
		i.setInsr_insp_id(rs.getInt(5));
		//i.setInsr_cdate(rs.getDate(3));
		i.setInsr_sum_assured(rs.getInt(4));
		i.setInsr_yrly_prem_amount(rs.getInt(6));
		//i.setInsr_stdate(rs.getDate(6));
		return i;
	}
	

}
