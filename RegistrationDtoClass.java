package com.bismi.lc.api;

import java.util.Arrays;

public class RegistrationDtoClass {

	private String username;
	private String name;
	private char[] password;
	private String countryName;
	private String[] hobbbies;
	private String gender;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "RegistrationDtoClass [username=" + username + ", name=" + name + ", password="
				+ Arrays.toString(password) + "]";
	}

	public String[] getHobbbies() {
		return hobbbies;
	}

	public void setHobbbies(String[] hobbbies) {
		this.hobbbies = hobbbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
