package com.example.SpringAPIJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringAPIJPA.repository.ChungNhanRepository;
@Service
public class ChungNhanServiecImp  implements ChungNhanService{
	private ChungNhanRepository chungNhanRepository;
	
	@Autowired
	public ChungNhanServiecImp(ChungNhanRepository theChungNhanRepository) {
		chungNhanRepository= theChungNhanRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> maMBVoiNVHoNguyen(String name) {
		// TODO Auto-generated method stub
		return chungNhanRepository.maMBVoiNVHoNguyen(name);
	}

}
