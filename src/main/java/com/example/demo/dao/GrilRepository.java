package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Gril;

public interface GrilRepository extends JpaRepository<Gril,Integer>{
	
	/**
	 * 可扩展
	 * @param age
	 * @return
	 */
	public List<Gril> findAllByAge(Integer age);
}
