package com.example.SpringAPIJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringAPIJPA.entity.MayBay;
import com.example.SpringAPIJPA.repository.MayBayRepository;
@Service
public class MayBayServiceImp implements MayBayService {
	private MayBayRepository mayBayRepository;
	@Autowired
	public MayBayServiceImp(MayBayRepository theMayBayRepository) {
		mayBayRepository = theMayBayRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<MayBay> findMayBayLon(int tambay) {
		// TODO Auto-generated method stub
		return mayBayRepository.findMayBayLon(tambay);
	}

	@Override
	public int countLoaiBoeing() {
		// TODO Auto-generated method stub
		return mayBayRepository.countLoaiBoeing();
	}

	@Override
	public List<MayBay> findMayBayByCB(String maCB) {
		// TODO Auto-generated method stub
		return mayBayRepository.findMayBayByCB(maCB);
	}

	@Override
	public List<Object> findMayBayDuocLai() {
		// TODO Auto-generated method stub
		return mayBayRepository.findMayBayDuocLai();
	}

}
