package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculadora;

class CalculadoraTest {

	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE")
	@CsvSource({ "2,3,5", "-1,5,4", "0,0,0" })
	void testSumaParameterizedCsvSource(int a, int b, int res) {
		assertEquals(Calculadora.suma(a, b), res);
	}

	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE FILE")
	@CsvFileSource(resources = "datos.csv")
	void testSumaParameterizedCsvFileSource(int a, int b, int res) {
		assertEquals(Calculadora.suma(a, b), res);
	}

	@Test
	@DisplayName("Comprobar division entre 0")
	void testDivisionCero() {
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
			Calculadora.divide(5, 0);
		});
	}

	@Test
	@DisplayName("Test tiempo ejecucion")
	void asercionTimeout() {

		assertTimeout(Duration.ofMillis(1), () -> {
			Calculadora.suma(1, 2);
		});

	}
}
