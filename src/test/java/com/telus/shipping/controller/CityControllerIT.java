package com.telus.shipping.controller;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.telus.shipping.domain.City;
import com.telus.shipping.repository.CityRepository;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The {@link CityController} integration tests.
 *
 * @author John Dexter Reyes
 */
@WebMvcTest(CityController.class)
class CityControllerIT {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CityRepository repository;

	@Test
	void shouldReturnCitiesByCode() throws Exception {
		City city = new City(3396054L, "ca", "abbey", "Abbey", "11", 50.7333330, -108.7500000);
		given(this.repository.findByCode("ca")).willReturn(Arrays.asList(city));
		this.mockMvc.perform(get("/city").param("code", "ca")).andExpect(status().isOk())
				.andExpect(jsonPath("$[0].uuid").value(city.getUuid()))
				.andExpect(jsonPath("$[0].code").value(city.getCode()))
				.andExpect(jsonPath("$[0].city").value(city.getCity()))
				.andExpect(jsonPath("$[0].name").value(city.getName()))
				.andExpect(jsonPath("$[0].region").value(city.getRegion()))
				.andExpect(jsonPath("$[0].latitude").value(city.getLatitude()))
				.andExpect(jsonPath("$[0].longitude").value(city.getLongitude()));
	}

}
