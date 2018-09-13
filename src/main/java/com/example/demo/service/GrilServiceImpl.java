package com.example.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.GrilRepository;
import com.example.demo.entity.Gril;

@Service
public class GrilServiceImpl implements GrilService{
	
	@Resource
	private GrilRepository grilRepository;//注入dao中

	@Transactional
	@Override
	public void addTwoGrils() {
		// TODO Auto-generated method stub
		Gril gril1 = new Gril();
		gril1.setAge(18);
		gril1.setCupSize("w");
		grilRepository.save(gril1);
		
		//模拟异常
		//int a = 1/0;
		
		Gril gril2 = new Gril();
		gril2.setAge(18);
		gril2.setCupSize("w");
		grilRepository.save(gril2);
	}
	
}
