package com.telus.shipping.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.telus.shipping.domain.City;
import com.telus.shipping.domain.Ship;
import com.telus.shipping.util.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * The {@link CalculateShippingController} tests.
 *
 * @author Jan O'Neil Vida
 */
@ExtendWith(MockitoExtension.class)
class CalculateShippingControllerTests {

	@InjectMocks
	private CalculateShippingController controller;

	@Mock
	private Calculator calculator;

	@Test
	void shouldReturnShippingInfo() {
		City city = new City(3396054L, "ca", "abbey", "Abbey", "11", 50.7333330, -108.7500000);
		given(this.calculator.getDistance(city)).willReturn(7174L);
		assertThat(this.controller.post(city)).isEqualTo(new Ship(7174L, 358.7));
	}

}
