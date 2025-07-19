package Utilities;

import java.util.Random;
import com.github.javafaker.Address;
import com.github.javafaker.Faker;

public class FakerUtility {
	
	public static int randomNumberGenerator() {
		Random random = new Random();                // java cls - Random's obj
		int randomNumber = random.nextInt(10000);    // random int nums in btw 10000
		return randomNumber;
	}
			
	public static String getFakeFirstName() {
		Faker faker = new Faker();
		Address address = faker.address();
		String text = address.firstName();
		return text;
	}
	
	public static String getFakeLastName() {
		Faker faker = new Faker();
		Address address = faker.address();
		String text = address.lastName();
		return text;
	}
	
	public  static String getFakeCityName() {
		Faker faker = new Faker();
		Address address = faker.address();
		String text = address.cityName();
		return text;
	}


}
