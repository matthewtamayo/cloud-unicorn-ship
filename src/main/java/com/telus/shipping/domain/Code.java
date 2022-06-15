package com.telus.shipping.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The code bean.
 *
 * @author John Dexter Reyes
 */
@AllArgsConstructor
@Data
@Entity
public class Code {

	@Id
	private Long uuid;

	private String code;

	private String name;

}
