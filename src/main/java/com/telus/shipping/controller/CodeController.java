package com.telus.shipping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telus.shipping.domain.Code;
import com.telus.shipping.repository.CodeRepository;

/**
 * The {@link Code} REST controller.
 *
 * @author John Dexter Reyes
 */
@RequestMapping("/code")
@RestController
public class CodeController {

	@Autowired
	private CodeRepository repository;

	@GetMapping
	public Iterable<Code> get() {
		return this.repository.findAll();
	}

}
