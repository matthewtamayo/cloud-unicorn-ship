package com.telus.shipping;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.SpringApplication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;

/**
 * The {@link ShippingApplication} tests.
 *
 * @author John Dexter Reyes
 */
@ExtendWith(MockitoExtension.class)
class ShippingApplicationTests {

	@Mock
	private MockedStatic<SpringApplication> springApplication;

	private final ShippingApplication shippingApplication = new ShippingApplication();

	@Test
	void shouldBootstrapApplication() {
		ShippingApplication.main(null);
		this.springApplication.verify(() -> SpringApplication.run(eq(ShippingApplication.class), isNull()));
	}

	@Test
	void shouldReturnOpenApiInfo() {
		assertThat(this.shippingApplication.openApi()).isNotNull();
	}

}
