package com.telus.shipping.controller;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.telus.shipping.domain.Code;
import com.telus.shipping.repository.CodeRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * The {@link CodeController} tests.
 *
 * @author John Dexter Reyes
 */
@ExtendWith(MockitoExtension.class)
class CodeControllerTests {

	@InjectMocks
	private CodeController controller;

	@Mock
	private CodeRepository repository;

	@Test
	void shouldReturnAllCodes() {
		Code code = new Code(30L, "ca", "Canada");
		given(this.repository.findAll()).willReturn(Arrays.asList(code));
		assertThat(this.controller.get()).containsOnly(code);
	}

}
