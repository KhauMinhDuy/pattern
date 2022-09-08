package com.khauminhduy.freebuilder;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface Employee {

	String getName();

	int getAge();

	String getDepartment();

	String getEmail();

	String getRole();

	String getSupervisorName();

	String getDesignation();
	
	long getPhoneNumber();

  Optional<Boolean> getPermanent();

  Optional<String> getDateOfJoining();
  
  Address getAddress();

  List<Long> getAccessTokens();

  Map<String, Long> getAssetsSerialIdMapping();

  Optional<Double> getSalaryInUSD();

	class Builder extends Employee_Builder {
		public Builder() {
			setDepartment("Builder Pattern");
		}

		@Override
		public Builder setEmail(String email) {
			if (isCheckEmail(email)) {
				return super.setEmail(email);
			} else {
				throw new IllegalArgumentException("Invalid email");
			}
		}

		private boolean isCheckEmail(String email) {
			return email.contains("@");
		}
	}

}
