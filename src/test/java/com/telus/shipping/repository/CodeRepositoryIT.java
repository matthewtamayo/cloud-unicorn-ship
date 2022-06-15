package com.telus.shipping.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.telus.shipping.domain.Code;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The {@link CodeRepository} integration tests.
 *
 * @author John Dexter Reyes
 */
@DataJpaTest
class CodeRepositoryIT {

	@Autowired
	private CodeRepository repository;

	@Autowired
	private TestEntityManager entityManager;

	@Test
	void shouldReturnAllCodes() {
		Code code = new Code(30L, "ca", "Canada");
		this.entityManager.persist(code);
		assertThat(this.repository.findAll()).containsOnly(code);
	}

}
