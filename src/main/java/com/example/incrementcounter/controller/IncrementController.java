package com.example.incrementcounter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.incrementcounter.service.IncrementService;

/**
 * @author DeLLpc
 *
 */
@RestController
public class IncrementController {
	
	@Autowired 
	IncrementService incrementService;
	
	/**
	 * @param id
	 */
	@PutMapping("/increment")
	public void increment(@RequestParam int id) {
		incrementService.increment(id);
	}
}
