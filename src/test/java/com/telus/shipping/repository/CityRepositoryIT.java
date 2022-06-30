package com.telus.shipping.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.telus.shipping.domain.City;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The {@link CityRepository} integration tests.
 *
 * @author John Dexter Reyes
 */
@DataJpaTest
class CityRepositoryIT {

	@Autowired
	private CityRepository repository;

	@Autowired
	private TestEntityManager entityManager;

	@Test
	void shouldReturnCitiesByCode() {
		City city = new City(3396054L, "ca", "abbey", "Abbey", "11", 50.7333330, -108.7500000);
		this.entityManager.persist(city);
		assertThat(this.repository.findByCode("ca")).containsOnly(city);
	}

}
