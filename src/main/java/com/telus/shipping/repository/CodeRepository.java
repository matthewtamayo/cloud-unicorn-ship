package com.telus.shipping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telus.shipping.domain.Code;

/**
 * The {@link Code} repository.
 *
 * @author John Dexter Reyes
 */
@Repository
public interface CodeRepository extends CrudRepository<Code, Long> {

}
