package net.eat.restaurant;

public class Restaurant {
    private int id;
	private String name;

    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }
}
