package in.rahul.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import in.rahul.service.EvenOddService;

public class TestEvenOddService {

	private static EvenOddService service;

	@BeforeAll
	public static void setUpOnce() {
		service = new EvenOddService();
	}


	@ParameterizedTest
	@ValueSource(ints = { 10, 21, 24, 15, 7, 8, 12, 35 })
	@Disabled
	public void testIsOdd(int data) {
		System.out.println("TestCensusService.testIsOdd() :: " + data);
		boolean result = service.isOdd(data);
		assertTrue(result);
	}

	@ParameterizedTest
	@ValueSource(strings = { "rahul", "mohan", "neel" })
	public void testSayHello(String name) {
		String actualOutput = service.sayHello(name);
		String exepctedOutput = "Hello: " + name;
		assertEquals(exepctedOutput, actualOutput);
	}



	@AfterAll
	public static void cleanUpOnce() {
		service = null;
	}
}
