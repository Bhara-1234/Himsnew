package com.example.HIMS;

import java.util.List;

public interface HimsDao {

	List<NetworkHospitals> getHospitals();

	void createUser(User user);

	List<Insurance> getInsurances();

	void updateInsurance(Insurance ins);

}
