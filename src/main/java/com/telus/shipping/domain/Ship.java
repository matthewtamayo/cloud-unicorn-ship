package com.telus.shipping.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The shipping information bean.
 *
 * @author Jan O'Neil Vida
 */
@AllArgsConstructor
@Data
public class Ship {

	private long distance;

	private double cost;

}
