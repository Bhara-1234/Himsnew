package com.example.HIMS;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HRepository implements IRepository {
	@Autowired
	HimsDao hdao;

	@Override
	public List<NetworkHospitals> getHospitals() {
		List<NetworkHospitals> lis = hdao.getHospitals();
		return lis;
	}

	@Override
	public void createUser(User user) {
		hdao.createUser(user);
		
	}

	@Override
	public ArrayList<Insurance> getInsurances() {
		List<Insurance> lis = hdao.getInsurances();
		return (ArrayList<Insurance>)lis;
	}

	@Override
	public void updateInsurance(Insurance ins) {
		System.out.println(2);
		hdao.updateInsurance(ins);
		
	}

	


}
