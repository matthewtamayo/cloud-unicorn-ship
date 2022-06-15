package com.telus.shipping.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The city bean.
 *
 * @author John Dexter Reyes
 */
@AllArgsConstructor
@Data
public class City {

	private Long uuid;

	private String code;

	private String city;

	private String name;

	private String region;

	private Double latitude;

	private Double longitude;

}
