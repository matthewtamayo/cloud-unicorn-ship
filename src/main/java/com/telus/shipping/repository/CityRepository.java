package com.telus.shipping.repository;

import com.telus.shipping.domain.City;

/**
 * The {@link City} repository.
 *
 * @author John Dexter Reyes
 */
public interface CityRepository {

	Iterable<City> findAll();

}
