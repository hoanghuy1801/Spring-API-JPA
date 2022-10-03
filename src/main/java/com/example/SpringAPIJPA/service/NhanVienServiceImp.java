package com.example.SpringAPIJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringAPIJPA.entity.NhanVien;
import com.example.SpringAPIJPA.repository.NhanVienRepository;
@Service
public class NhanVienServiceImp implements NhanVienService{
	private NhanVienRepository nhanVienRepository;
	@Autowired
	public NhanVienServiceImp(NhanVienRepository theNhanVienRepository) {
		nhanVienRepository=theNhanVienRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<NhanVien> findNVLuongNhoHon10000() {
		// TODO Auto-generated method stub
		return nhanVienRepository.findNVLuongNhoHon10000();
	}

	@Override
	public int totalLuong() {
		// TODO Auto-generated method stub
		return nhanVienRepository.totalLuong();
	}

	@Override
	public List<String> phiCongLaiBoeing(String ma) {
		// TODO Auto-generated method stub
		return nhanVienRepository.phiCongLaiBoeing(ma);
	}

	@Override
	public List<NhanVien> phiCongMayBay747() {
		// TODO Auto-generated method stub
		return nhanVienRepository.phiCongMayBay747();
	}

	@Override
	public List<String> phiCongLai2MB(String mb1, String mb2) {
		// TODO Auto-generated method stub
		return nhanVienRepository.phiCongLai2MB(mb1, mb2);
	}

	@Override
	public List<String> findNameByMB(String loai) {
		// TODO Auto-generated method stub
		return nhanVienRepository.findNameByMB(loai);
	}

	

}
