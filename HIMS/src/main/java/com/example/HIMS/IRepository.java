package com.example.HIMS;

import java.util.ArrayList;
import java.util.List;

public interface IRepository {

	List<NetworkHospitals> getHospitals();

	void createUser(User user);

	ArrayList<Insurance> getInsurances();

	void updateInsurance(Insurance ins);

}
