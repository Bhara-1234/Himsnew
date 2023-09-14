package com.example.HIMS;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class HimsDaoImpl implements HimsDao {

	JdbcTemplate jdbcTemplate;
	LocalDate currentDate = LocalDate.now();

	private String SQL_GET_HOSPITALS = "select * from  ims_networkhospitals";
	private String SQL_CREATE_USER = "insert into ims_users(user_name ,user_cdate, user_pwd ,user_type)values(?,?,?,?)";
	private String SQL_GET_INSURANCES = "select * from  ims_INSURANCE";
	private String SQL_UPDATE_INSURANCES="update ims_insurance set insr_sum_assured=?,insr_yrly_prem_amount=? where insr_id=?";
	
	
	@Autowired
	public HimsDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<NetworkHospitals> getHospitals() {

		return jdbcTemplate.query(SQL_GET_HOSPITALS, new NetworkHospitalsMapper());
	}

	@Override
	public void createUser(User user) {
		jdbcTemplate.update(SQL_CREATE_USER, user.getUser_name(),Date.valueOf(currentDate), user.getUser_pwd(),user.getUser_type());

	}

	@Override
	public List<Insurance> getInsurances() {
		return jdbcTemplate.query(SQL_GET_INSURANCES, new InsuranceMapper());
	}

	@Override
	public void updateInsurance(Insurance ins) {
		System.out.println(ins.getInsr_sum_assured()+""+ins.getInsr_yrly_prem_amount()+""+ins.getInsr_id());
		jdbcTemplate.update(SQL_UPDATE_INSURANCES,ins.getInsr_sum_assured(),ins.getInsr_yrly_prem_amount(),ins.getInsr_id());
		
	}
	

}
