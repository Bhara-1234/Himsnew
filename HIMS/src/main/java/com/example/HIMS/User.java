package com.example.HIMS;

import java.sql.Date;

public class User {
 int user_id;
 String user_name;
 Date user_cdate;
  String user_pwd;
  String user_type;

public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int user_id, String user_name, Date user_cdate, String user_pwd,String user_type) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.user_cdate = user_cdate;
	this.user_pwd = user_pwd;
	this.user_type = user_type;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public Date getUser_cdate() {
	return user_cdate;
}
public void setUser_cdate(String user_cdate) throws Exception {
	
	this.user_cdate = Date.valueOf(user_cdate);
}
public String getUser_pwd() {
	return user_pwd;
}
public void setUser_pwd(String user_pwd) {
	this.user_pwd = user_pwd;
}
public String getUser_type() {
	return user_type;
}
public void setUser_type(String user_type) {
	this.user_type = user_type;
}

}
