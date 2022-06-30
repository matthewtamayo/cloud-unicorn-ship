package com.telus.shipping.util;

import org.springframework.stereotype.Component;

import com.telus.shipping.domain.City;

/**
 * Distance calculator.
 *
 * @author Jan O'Neil Vida
 */
@Component
public class Calculator {

	private final double HOME_LATITUDE_R = Math.toRadians(51.164896);

	private final double HOME_LONGITUDE_R = Math.toRadians(7.068792);

	/**
	 * Calculates the distance of a given city from a fixed home city.
	 * @param city the given city
	 * @return the distance from a fixed home city
	 */
	public long getDistance(City city) {
		double targetLong = Math.toRadians(city.getLongitude());
		double targetLat = Math.toRadians(city.getLatitude());
		// Haversine formula
		double longDistance = this.HOME_LONGITUDE_R - targetLong;
		double latDistance = this.HOME_LATITUDE_R - targetLat;
		double a = Math.pow(Math.sin(latDistance / 2), 2)
				+ Math.cos(targetLat) * Math.cos(this.HOME_LATITUDE_R) * Math.pow(Math.sin(longDistance / 2), 2);
		double c = 2 * Math.asin(Math.sqrt(a));
		// Radius of Earth in kilometers
		final double earthRadius = 6371;
		return (long) (c * earthRadius);
	}

}
