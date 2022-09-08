package com.khauminhduy.freebuilder.builder;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EmployeeBuilderUnitTest {

	private static final String NAME = "DUYKHAU";
	
	@Test
	public void whenBuildEmployee_thenReturnValidEmployee() {
		Employee.Builder builder = new Employee.Builder();
		Employee employee = builder.setName(NAME)
					.setAge(23)
					.setDepartment("Builder Pattern")
					.build();
		
		assertTrue(employee.getName().equals(NAME));
	}
	
}
