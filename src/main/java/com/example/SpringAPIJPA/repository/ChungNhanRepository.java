package com.example.SpringAPIJPA.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringAPIJPA.entity.ChungNhan;



@Repository
@Transactional
public interface ChungNhanRepository extends JpaRepository<ChungNhan, String> {
//	11
	@Query(nativeQuery =  true, value="select c.mamb from chungnhan c join nhanvien nv ON c.manv = nv.manv where nv.ten like 'Nguyen%'")
	List<String> maMBVoiNVHoNguyen();
}
