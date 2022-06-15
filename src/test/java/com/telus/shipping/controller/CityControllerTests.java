package com.telus.shipping.controller;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.telus.shipping.domain.City;
import com.telus.shipping.repository.CityRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * The {@link CityController} tests.
 *
 * @author John Dexter Reyes
 */
@ExtendWith(MockitoExtension.class)
class CityControllerTests {

	@InjectMocks
	private CityController controller;

	@Mock
	private CityRepository repository;

	@Test
	void shouldReturnAllCities() {
		City city = new City(3396054L, "ca", "abbey", "Abbey", "11", 50.7333330, -108.7500000);
		given(this.repository.findAll()).willReturn(Arrays.asList(city));
		assertThat(this.controller.get()).containsOnly(city);
	}

}
