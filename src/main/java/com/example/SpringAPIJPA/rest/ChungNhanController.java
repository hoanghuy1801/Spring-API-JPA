package com.example.SpringAPIJPA.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAPIJPA.entity.ChungNhan;
import com.example.SpringAPIJPA.service.ChungNhanService;

@RestController
@RequestMapping("/api")
public class ChungNhanController {
	private  ChungNhanService  chungNhanService;
	 
	@Autowired
	public ChungNhanController(ChungNhanService theChungNhanService) {
		chungNhanService=theChungNhanService;
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/maMBVoiNVHoNguyen")
	public ChungNhan maMBVoiNVHoNguyen() {
		
		 return (ChungNhan) chungNhanService.maMBVoiNVHoNguyen();
		
	}
	

}
