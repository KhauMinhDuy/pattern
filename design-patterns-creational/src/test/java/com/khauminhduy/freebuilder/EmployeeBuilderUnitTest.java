package com.khauminhduy.freebuilder;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeBuilderUnitTest {

	private static final int PIN_CODE = 223344;
	public static final String CITY_NAME = "New York";
	public static final int INPUT_SALARY_EUROS = 10000;
	public static final double EUROS_TO_USD_RATIO = 0.6;
	
	@Test
	public void whenBuildEmployeeWithAddress_thenReturnEmployeeWithValidAddress() {
		Address.Builder addressBuilder = new Address.Builder();
		Address address = addressBuilder.setCity(CITY_NAME).build();
		
		Employee.Builder employeeBuilder = new Employee.Builder();
		Employee employee = employeeBuilder.setName("DuyKhau")
			.setAge(23)
			.setDesignation("author")
			.setEmail("abc@xyz.com")
			.setSupervisorName("admin")
			.setPhoneNumber(123456789)
			.setPermanent(true)
			.setRole("Developer")
			.setAddress(address)
			.build();

		Assertions.assertTrue(employee.getAddress().getCity().equalsIgnoreCase(CITY_NAME));
	}
	
	@Test
	public void whenMapSalary_thenReturnEmployeeWithSalaryInUSD() {
		Address.Builder addressBuilder = new Address.Builder();
		Address address = addressBuilder.setCity(CITY_NAME).setPinCode(PIN_CODE).build();
		
		long salaryInEuros = INPUT_SALARY_EUROS;
		Employee.Builder employeeBuilder = new Employee.Builder();
		Employee employee = employeeBuilder.setName("DuyKhau")
			.setAge(23)
			.setDesignation("author")
			.setEmail("abc@xyz.com")
			.setSupervisorName("Admin")
			.setPhoneNumber(123456789)
			.setPermanent(true)
			.setRole("developer")
			.setAddress(address)
			.mapSalaryInUSD(sal -> salaryInEuros * EUROS_TO_USD_RATIO)
			.build();
		
		assertTrue(employee.getAddress().getPinCode().get() == PIN_CODE);
		
	}

}
