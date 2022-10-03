package com.example.SpringAPIJPA.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringAPIJPA.entity.NhanVien;
@Service
public interface NhanVienService {
//	3
	
	List<NhanVien> findNVLuongNhoHon10000();
//	8
	
	int totalLuong();
//	9
	
	List<String> phiCongLaiBoeing(String ma);
//  10
	
	List<NhanVien> phiCongMayBay747();
//	12
	
	List<String> phiCongLai2MB(String mb1, String mb2);
	
//	15
	
	List<String> findNameByMB(String loai);

}
