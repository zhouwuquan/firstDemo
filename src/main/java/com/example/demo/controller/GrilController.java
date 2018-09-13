package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GrilRepository;
import com.example.demo.entity.Gril;
import com.example.demo.service.GrilService;

@RestController
public class GrilController {
	
	@Autowired
	private GrilRepository grilRepository;
	
	@Autowired
	private GrilService grilService;//测试事务
	
	/**
	 * 查询女生列表
	 * @return
	 */
	@GetMapping(value="/grils")
	public List<Gril> getGrilsList(){
		return grilRepository.findAll();
	}
	
	/**
	 * 添加一个女生
	 * @param cupSize
	 * @param age
	 */
	@RequestMapping(value="/grils",method=RequestMethod.POST)
	public Gril addGril(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age) {
		Gril gril = new Gril();
			gril.setCupSize(cupSize);
			gril.setAge(age);
		return grilRepository.save(gril);
	}
	
	/**
	 * 通过Id查询一个女生
	 * @param id
	 * @return
	 */
	@GetMapping(value="/grils/{id}")
	public Gril getGrilById(@PathVariable("id") Integer id) {
		return grilRepository.findById(id).get();
	}
	
	/**
	 * 通过Id更新一个女生信息
	 * @param id
	 * @param cupSize
	 * @param age
	 * @return
	 */
	@RequestMapping(value="/grils/{id}",method=RequestMethod.POST)
	public Gril updateGrilById(@PathVariable("id") Integer id,
								@RequestParam("cupSize") String cupSize,
								@RequestParam("age") Integer age) {
		Gril gril = new Gril();
		gril.setId(id);
		gril.setAge(age);
		gril.setCupSize(cupSize);
		return grilRepository.save(gril);
	}
	
	/**
	 * 通过一个id删除一个女生
	 * @param id
	 */
	@DeleteMapping(value="/grils/{id}")
	public void deleteGrilById(@PathVariable("id") Integer id) {
		
		grilRepository.deleteById(id);
	}
	
	/**
	 * 通过年龄查询女生
	 * @param age
	 * @return
	 */
	@RequestMapping(value="/grils/age/{age}")
	public List<Gril> findAllByAge(@PathVariable("age") Integer age){
		
		return grilRepository.findAllByAge(age);
	}
	
	@RequestMapping(value="/grils/twoGrils")
	public void addTwoGrils() {
		grilService.addTwoGrils();
	}
}
