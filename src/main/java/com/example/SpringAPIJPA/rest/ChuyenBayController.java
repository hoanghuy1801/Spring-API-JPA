package com.example.SpringAPIJPA.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAPIJPA.entity.ChungNhan;
import com.example.SpringAPIJPA.entity.ChuyenBay;
import com.example.SpringAPIJPA.entity.MayBay;
import com.example.SpringAPIJPA.service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	private ChuyenBayService chuyenBayService;
	
	public ChuyenBayController(ChuyenBayService theChuyenBayService) {
		chuyenBayService=theChuyenBayService;
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/MayBay/{gaDen}")
	public List<ChuyenBay> findAllByGaDen(@PathVariable String gaDen) {
		
		 return   chuyenBayService.findAllByGaDen(gaDen);
		
	}

}
