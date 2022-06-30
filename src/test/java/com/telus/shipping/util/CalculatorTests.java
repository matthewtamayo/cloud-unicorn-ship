package com.telus.shipping.util;

import org.junit.jupiter.api.Test;

import com.telus.shipping.domain.City;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The {@link Calculator} unit tests.
 *
 * @author Jan O'Neil Vida
 */
class CalculatorTests {

	private final Calculator calculator = new Calculator();

	@Test
	void shouldReturnDistance() {
		assertThat(
				this.calculator.getDistance(new City(3396054L, "ca", "abbey", "Abbey", "11", 50.7333330, -108.7500000)))
						.isEqualTo(7174L);
	}

}
