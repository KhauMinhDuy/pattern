package com.khauminhduy.currying;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Letter {

	private String returningAddress;
	private String insideAddress;
	private LocalDate dateOfLetter;
	private String salutation;
	private String body;
	private String closing;

	public Letter(String returningAddress, String insideAddress, LocalDate dateOfLetter, String salutation, String body,
			String closing) {
		this.returningAddress = returningAddress;
		this.insideAddress = insideAddress;
		this.dateOfLetter = dateOfLetter;
		this.salutation = salutation;
		this.body = body;
		this.closing = closing;
	}

	public Letter(String salutation, String body) {
		this(null, null, LocalDate.now(), salutation, body, null);
	}

	@Override
	public int hashCode() {
		return Objects.hash(body, closing, dateOfLetter, insideAddress, returningAddress, salutation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter other = (Letter) obj;
		return Objects.equals(body, other.body) && Objects.equals(closing, other.closing)
				&& Objects.equals(dateOfLetter, other.dateOfLetter) && Objects.equals(insideAddress, other.insideAddress)
				&& Objects.equals(returningAddress, other.returningAddress) && Objects.equals(salutation, other.salutation);
	}

	@Override
	public String toString() {
		return "Letter [returningAddress=" + returningAddress + ", insideAddress=" + insideAddress + ", dateOfLetter="
				+ dateOfLetter + ", salutation=" + salutation + ", body=" + body + ", closing=" + closing + "]";
	}

	public static Letter createLetter(String salutation, String body) {
		return new Letter(salutation, body);
	}

	public static BiFunction<String, String, Letter> SIMPLE_LETTER_CREATOR = Letter::new;

	public static Function<String, Function<String, Letter>> SIMPLE_CURRIED_LETTER_CREATOR = //
			saluation -> body -> new Letter(saluation, body);

	static Function<String, Function<String, Function<LocalDate, Function<String, Function<String, Function<String, Letter>>>>>> LETTER_CREATOR = //
			returnAddress -> closing -> dateOfLetter -> insideAddress -> salutation -> body -> new Letter(returnAddress,
					insideAddress, dateOfLetter, salutation, body, closing);

	static AddReturnAddress builder() {
		return returnAddress -> closing -> dateOfLetter -> insideAddress -> salutation -> body -> new Letter(returnAddress,
				insideAddress, dateOfLetter, salutation, body, closing);
	}

	interface AddReturnAddress {
		Letter.AddClosing withReturnAddress(String returnAddress);
	}

	interface AddClosing {
		Letter.AddDateOfLetter withClosing(String closing);
	}

	interface AddDateOfLetter {
		Letter.AddInsideAddress withDateOfLetter(LocalDate dateOfLetter);
	}

	interface AddInsideAddress {
		Letter.AddSalutation withInsideAddress(String insideAddress);
	}

	interface AddSalutation {
		Letter.AddBody withSalutation(String salutation);
	}

	interface AddBody {
		Letter withBody(String body);
	}
}
