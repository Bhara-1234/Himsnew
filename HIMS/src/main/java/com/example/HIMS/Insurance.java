package com.example.HIMS;

import java.sql.Date;

public class Insurance {
	int insr_id,insr_cust_id,insr_sum_assured,insr_insp_id,insr_yrly_prem_amount;
	public int getInsr_id() {
		return insr_id;
	}
	public int getInsr_cust_id() {
		return insr_cust_id;
	}
	public int getInsr_sum_assured() {
		return insr_sum_assured;
	}
	public int getInsr_insp_id() {
		return insr_insp_id;
	}
	public int getInsr_yrly_prem_amount() {
		return insr_yrly_prem_amount;
	}
	public Date getInsr_cdate() {
		return insr_cdate;
	}
	public Date getInsr_stdate() {
		return insr_stdate;
	}
	public void setInsr_id(int insr_id) {
		this.insr_id = insr_id;
	}
	public void setInsr_cust_id(int insr_cust_id) {
		this.insr_cust_id = insr_cust_id;
	}
	public void setInsr_sum_assured(int insr_sum_assured) {
		this.insr_sum_assured = insr_sum_assured;
	}
	public void setInsr_insp_id(int insr_insp_id) {
		this.insr_insp_id = insr_insp_id;
	}
	public void setInsr_yrly_prem_amount(int insr_yrly_prem_amount) {
		this.insr_yrly_prem_amount = insr_yrly_prem_amount;
	}
	public void setInsr_cdate(Date insr_cdate) {
		
		
		this.insr_cdate = insr_cdate;
	}
	public void setInsr_stdate(Date insr_stdate) {
		this.insr_stdate = insr_stdate;
	}
	public Insurance(int insr_id, int insr_cust_id, int insr_sum_assured, int insr_insp_id, int insr_yrly_prem_amount,
			Date insr_cdate, Date insr_stdate) {
		super();
		this.insr_id = insr_id;
		this.insr_cust_id = insr_cust_id;
		this.insr_sum_assured = insr_sum_assured;
		this.insr_insp_id = insr_insp_id;
		this.insr_yrly_prem_amount = insr_yrly_prem_amount;
		this.insr_cdate = insr_cdate;
		this.insr_stdate = insr_stdate;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	Date insr_cdate,insr_stdate;
	
}
