package com.telus.shipping.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The city bean.
 *
 * @author John Dexter Reyes
 */
@AllArgsConstructor
@Data
@Entity
public class City {

	@Id
	private Long uuid;

	private String code;

	private String city;

	private String name;

	private String region;

	private Double latitude;

	private Double longitude;

}
