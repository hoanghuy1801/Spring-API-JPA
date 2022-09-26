package com.example.SpringAPIJPA.service;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ChungNhanService {
	List<String> maMBVoiNVHoNguyen(String name);

}
