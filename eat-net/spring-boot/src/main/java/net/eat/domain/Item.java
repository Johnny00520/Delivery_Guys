package net.eat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "items")
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private float price;

    @ManyToOne(optional=false)
    @JoinColumn(name="restaurant")
    private Restaurant restaurant;

    public Item(){}

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }
}
