package com.springbootfirst.springbootfirst.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfirst.springbootfirst.entity.FacebookUser;

@RestController
public class Facebookcontroller {
	//@RequestMapping(method=RequestMethod.GET,value="viewallprofile")
	@GetMapping("viewallprofile")  
	public List<FacebookUser> all() {
		List<FacebookUser> ll=new ArrayList<FacebookUser>();
		
		FacebookUser f1=new FacebookUser();
		f1.setName("Riyaz");
		f1.setEmail("syed@gmail.com");
		f1.setPasword("syed");
		f1.setAddress("kadapa ");
		
		FacebookUser f2=new FacebookUser();
		f2.setName("Riyaz12");
		f2.setEmail("syed@gmail.com22");
		f2.setPasword("syed22");
		f2.setAddress("kadapa22 ");
		ll.add(f1);
		ll.add(f2);
		
		
		
		return ll;
	}
	//@RequestMapping(method=RequestMethod.POST,value="createRecord")
	@PostMapping("createRecord")
	public String createprofile(@RequestBody FacebookUser fb) {
		return fb.getName()+" "+fb.getAddress();
	}
	@PutMapping("updateRecord")
	public String updateprofile() {
		return "profile updated";
	}
	@DeleteMapping("deleteRecord/{uid}")
	public String deleteprofile() {
		return "profile deleted";
	}
	

}
