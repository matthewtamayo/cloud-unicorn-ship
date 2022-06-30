package com.telus.shipping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telus.shipping.domain.City;
import com.telus.shipping.domain.Ship;
import com.telus.shipping.util.Calculator;

/**
 * The calculate shipping task REST controller.
 *
 * @author Jan O'Neil Vida
 */
@RequestMapping("/calculateShipping")
@RestController
public class CalculateShippingController {

	@Autowired
	private Calculator calculator;

	@PostMapping
	public Ship post(@RequestBody City city) {
		long distance = this.calculator.getDistance(city);
		return new Ship(distance, (double) (distance * 5) / 100);
	}

}
