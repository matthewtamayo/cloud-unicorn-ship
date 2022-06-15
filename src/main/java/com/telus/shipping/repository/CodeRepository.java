package com.telus.shipping.repository;

import com.telus.shipping.domain.Code;

/**
 * The {@link Code} repository.
 *
 * @author John Dexter Reyes
 */
public interface CodeRepository {

	Iterable<Code> findAll();

}
