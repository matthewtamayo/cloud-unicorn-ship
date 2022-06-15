package com.telus.shipping.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The code bean.
 *
 * @author John Dexter Reyes
 */
@AllArgsConstructor
@Data
public class Code {

	private Long uuid;

	private String code;

	private String name;

}
