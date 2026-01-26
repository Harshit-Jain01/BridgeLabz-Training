package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestingTemperatureConvertor {

	@Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConvertor.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, TemperatureConvertor.celsiusToFahrenheit(100), 0.01);
        assertEquals(77.0, TemperatureConvertor.celsiusToFahrenheit(25), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConvertor.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, TemperatureConvertor.fahrenheitToCelsius(212), 0.01);
        assertEquals(25.0, TemperatureConvertor.fahrenheitToCelsius(77), 0.01);
    }
}