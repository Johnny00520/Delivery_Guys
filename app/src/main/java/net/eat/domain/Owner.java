package net.eat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import net.eat.domain.Restaurant;
import java.io.Serializable;

@Entity
@Table(name = "owners")
public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String username;

    @Column(length=60)
    @NotNull
    private String password;

    @OneToOne
    @JoinColumn(name="restaurant")
    private Restaurant restaurant;

    @NotNull
    private String name;

    public Owner(){}

    public Owner(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Owner(String username, String password, String name, Restaurant restaurant) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.restaurant = restaurant;
    }

    public long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }
}
