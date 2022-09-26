package com.example.SpringAPIJPA.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringAPIJPA.entity.ChuyenBay;
@Service
public interface ChuyenBayService {
//	4
	List<ChuyenBay> findAllByGaDen(String gaDen);
	List<ChuyenBay> chuyenBay8kDen10k();
//	5
	List<ChuyenBay> chuyenBaySaiGonMeThuoc(String from, String to);
//	6
	int chuyenBayTuSaiGon();
// 	14
	List<ChuyenBay> chuyenBayCuaAirbusA320 ();

}
