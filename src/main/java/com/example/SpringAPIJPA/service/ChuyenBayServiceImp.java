package com.example.SpringAPIJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringAPIJPA.entity.ChuyenBay;
import com.example.SpringAPIJPA.repository.ChuyenBayRepository;
@Service
public class ChuyenBayServiceImp implements ChuyenBayService {
	private ChuyenBayRepository chuyenBayRepository;
	@Autowired
	public ChuyenBayServiceImp(ChuyenBayRepository theChuyenBayRepository) {
		chuyenBayRepository=theChuyenBayRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ChuyenBay> findAllByGaDen(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findAllByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> chuyenBay8kDen10k() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBay8kDen10k();
	}

	@Override
	public List<ChuyenBay> chuyenBaySaiGonMeThuoc(String from, String to) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBaySaiGonMeThuoc(from, to);
	}

	@Override
	public int chuyenBayTuSaiGon() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBayTuSaiGon();
	}

	@Override
	public List<ChuyenBay> chuyenBayCuaAirbusA320() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.chuyenBayCuaAirbusA320();
	}

}
