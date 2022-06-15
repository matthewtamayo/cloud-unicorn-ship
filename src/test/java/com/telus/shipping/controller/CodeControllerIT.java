package com.telus.shipping.controller;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.telus.shipping.domain.Code;
import com.telus.shipping.repository.CodeRepository;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The {@link CodeController} integration tests.
 *
 * @author John Dexter Reyes
 */
@WebMvcTest(CodeController.class)
class CodeControllerIT {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CodeRepository repository;

	@Test
	void shouldReturnAllCodes() throws Exception {
		Code code = new Code(30L, "ca", "Canada");
		given(this.repository.findAll()).willReturn(Arrays.asList(code));
		this.mockMvc.perform(get("/code")).andExpect(status().isOk()).andExpect(jsonPath("$[0].uuid").value(30L))
				.andExpect(jsonPath("$[0].code").value("ca")).andExpect(jsonPath("$[0].name").value("Canada"));
	}

}
