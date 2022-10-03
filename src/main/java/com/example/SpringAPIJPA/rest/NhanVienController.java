package com.example.SpringAPIJPA.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAPIJPA.entity.ChuyenBay;
import com.example.SpringAPIJPA.entity.MayBay;
import com.example.SpringAPIJPA.entity.NhanVien;
import com.example.SpringAPIJPA.repository.NhanVienRepository;
import com.example.SpringAPIJPA.service.NhanVienService;

@RestController
@RequestMapping("/api")
public class NhanVienController {
	private NhanVienService nhanVienService;
	@Autowired
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
	//cau9 
	@GetMapping("/phiCongLaiBoeing")
	public List<String> phiCongLaiBoeing() {
		 return   nhanVienService.phiCongLaiBoeing("Boeing");
		
	}
	//cau 10
	@GetMapping("/phiCongMayBay747")
	public List<NhanVien> phiCongMayBay747() {
		// TODO Auto-generated method stub
		return nhanVienService.phiCongMayBay747();
	}

}
