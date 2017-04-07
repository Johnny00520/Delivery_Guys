package net.eat.restaurant;

import java.util.Arrays;
import java.util.ArrayList;

public class RestaurantStore {
	public static void insert(Restaurant r) {
		System.out.println("inserted restaurant");
		throw new UnsupportedOperationException();
	}

	public static void remove(int restaurantId) {
		System.out.println("removed restaurant");
		throw new UnsupportedOperationException();
	}

	public static int get(String restaurantName) {
		System.out.println("found restaurant");
		throw new UnsupportedOperationException();
	}

	public static ArrayList<String> names() {
		return new ArrayList<String>(
			Arrays.asList("zebra xylophones",
						  "hamburger hamstrings",
						  "taco tools")
		);
	}
}
