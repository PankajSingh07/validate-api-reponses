package com.assignment.core;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

import com.assignment.data.Config;



public class TestBase {

	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = Config.BASE_URI;
	}
}
