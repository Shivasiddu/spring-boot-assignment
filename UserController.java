package com.zensarspringbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensarspringbootdemo.entity.Address;
import com.zensarspringbootdemo.entity.Details;
import com.zensarspringbootdemo.entity.PC;
import com.zensarspringbootdemo.entity.Status;

@RestController("/run")
public class UserController {

	@GetMapping("/run")
	public PC getPC() {
		PC pc = new PC();
		Status status = new Status(1, "Request successfully processed");
		pc.setStatus(status);
//		Address address = new Address("Jai Nagar", "Ram colony", "pune");

		Details details = new Details(46186, "Ashish");

		pc.setDetails(details);

		return pc;
		/*
		 * List<Status> status = new ArrayList<Status>(); List<Details> user = new
		 * ArrayList<Details>(); List<Address> address = new ArrayList<Address>();
		 * user.add(new Details(46186, "Ashish"));
		 * 
		 * address.add(new Address("Jai Nagar", "Ram colony", "pune"));
		 * 
		 * Details details = new Details(46186, "Ashish");
		 * 
		 * 
		 * status.add(new Status("status", 1, "Request successfully processed" + "  " +
		 * details + address)); return status;
		 */
	}
}
