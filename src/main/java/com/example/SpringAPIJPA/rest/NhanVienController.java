package com.example.SpringAPIJPA.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAPIJPA.entity.MayBay;
import com.example.SpringAPIJPA.entity.NhanVien;
import com.example.SpringAPIJPA.repository.NhanVienRepository;
import com.example.SpringAPIJPA.service.NhanVienService;

@RestController
@RequestMapping("/api")
public class NhanVienController {
	private NhanVienService nhanVienService;
	public NhanVienController(NhanVienService theNhanVienService) {
		nhanVienService=theNhanVienService;
		// TODO Auto-generated constructor stub
	}
	//cau 3
	@GetMapping("/findNVLuongNhoHon10000")
	public List<NhanVien> findNVLuongNhoHon10000() {
		
		 return   nhanVienService.findNVLuongNhoHon10000();
		
	}
	//cau8
	@GetMapping("/totalLuong")
	public int totalLuong() {
		// TODO Auto-generated method stub
		return nhanVienService.totalLuong();
	}


}
