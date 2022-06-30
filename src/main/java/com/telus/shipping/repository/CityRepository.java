package com.telus.shipping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telus.shipping.domain.City;

/**
 * The {@link City} repository.
 *
 * @author John Dexter Reyes
 */
@Repository
public interface CityRepository extends CrudRepository<City, Long> {

	Iterable<City> findByCode(String code);

}
