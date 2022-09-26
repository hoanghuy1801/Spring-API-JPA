package com.example.SpringAPIJPA.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.SpringAPIJPA.entity.MayBay;
@Service
public interface MayBayService {
	List<MayBay> findMayBayLon(int tambay);
//	7
	int countLoaiBoeing();
//	13

	List<MayBay> findMayBayByCB(String maCB);
	
//	16
	List<Object> findMayBayDuocLai();

}
