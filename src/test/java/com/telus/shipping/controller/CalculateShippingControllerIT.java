package com.telus.shipping.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.telus.shipping.domain.City;
import com.telus.shipping.domain.Ship;
import com.telus.shipping.util.Calculator;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The {@link CalculateShippingController} integration tests.
 *
 * @author Jan O'Neil Vida
 */
@WebMvcTest(CalculateShippingController.class)
class CalculateShippingControllerIT {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper mapper;

	@MockBean
	private Calculator calculator;

	@Test
	void shouldReturnShippingInfo() throws Exception {
		City city = new City(3396054L, "ca", "abbey", "Abbey", "11", 50.7333330, -108.7500000);
		given(this.calculator.getDistance(any(city.getClass()))).willReturn(7174L);
		Ship ship = new Ship(7174L, 358.7);
		this.mockMvc
				.perform(post("/calculateShipping").contentType(MediaType.APPLICATION_JSON_VALUE)
						.content(this.mapper.writeValueAsString(city)))
				.andExpect(status().isOk()).andExpect(jsonPath("$.distance").value(ship.getDistance()))
				.andExpect(jsonPath("$.cost").value(ship.getCost()));
	}

}
