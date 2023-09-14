package com.example.HIMS;
import java.util.ArrayList;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HimsController {

	@Autowired
	IRepository irip;
	
	@GetMapping(value="/networkhospitals")
	public ArrayList<NetworkHospitals> getHospitals(){
		ArrayList<NetworkHospitals> li = (ArrayList<NetworkHospitals>) irip.getHospitals();
		return li;
		
	}
	@RequestMapping(value="/createuser" ,method=RequestMethod.POST)
	public void createUser(User user) {
		irip.createUser(user);
	}
	
	@RequestMapping(value="/insurances",method=RequestMethod.GET)
	public ArrayList<Insurance> getInsurances(){
		System.out.println("satish");
		ArrayList<Insurance> li = (ArrayList<Insurance>) irip.getInsurances();
		return li;
		
	}
	
	@RequestMapping(value="/save",method=RequestMethod.PUT)
	public void save(@RequestBody Insurance ins) {
		System.out.println(1);
		irip.updateInsurance(ins);
	}
}
