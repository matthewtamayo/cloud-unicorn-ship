package com.telus.shipping.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telus.shipping.domain.City;
import com.telus.shipping.repository.CityRepository;

/**
 * The {@link City} REST controller.
 *
 * @author John Dexter Reyes
 */
@RequestMapping("/city")
@RestController
@Tag(name = "city")
public class CityController {

	@Autowired
	private CityRepository repository;

	@GetMapping
	public Iterable<City> get(@RequestParam String code) {
		return this.repository.findByCode(code);
	}

}
