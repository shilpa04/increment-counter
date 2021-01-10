package com.example.incrementcounter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.incrementcounter.entity.Number;
import com.example.incrementcounter.repository.NumberRepo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author DeLLpc
 *
 */
@Service
@Slf4j
public class IncrementService {

	@Autowired
	NumberRepo numberRepo;

	/**
	 * @param id
	 */
	public synchronized void increment(int id) {
		Number num = numberRepo.findById(id).orElse(new Number(id, 0));
		num.setNum(num.getNum() + 1);
		log.info("Number=" + num);
		numberRepo.save(num);
	}
}
