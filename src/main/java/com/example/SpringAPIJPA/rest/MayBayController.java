package com.example.SpringAPIJPA.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAPIJPA.entity.ChuyenBay;
import com.example.SpringAPIJPA.entity.MayBay;
import com.example.SpringAPIJPA.service.MayBayService;

@RestController
@RequestMapping("/api")
public class MayBayController {
	private MayBayService mayBayService;
	 @Autowired
	public MayBayController(MayBayService theMayBayService) {
		mayBayService=theMayBayService;
		// TODO Auto-generated constructor stub
	}
	//cau 2
	@GetMapping("/findMayBayLon")
	public List<MayBay> findMayBayLon() {
		
		 return   mayBayService.findMayBayLon(10000);
		
	}
	//cau7
	@GetMapping("/countLoaiBoeing")
	public int countLoaiBoeing() {
		// TODO Auto-generated method stub
		return mayBayService.countLoaiBoeing();
	}

}
