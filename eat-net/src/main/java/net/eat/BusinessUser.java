package net.eat;

public class BusinessUser {
    private int id;
    private String username;
    private String password;
    private String name;
    private int restaurant;
    // TODO Add remaining fields (address, etc)
    
    public BusinessUser(int id,
                        String username,
                        String password,
                        String name,
                        int restaurant) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.restaurant = restaurant;
    }
}
