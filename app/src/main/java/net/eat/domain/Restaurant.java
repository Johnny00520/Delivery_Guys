package net.eat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.validation.constraints.NotNull;

import java.util.Set;
import java.io.Serializable;

import net.eat.domain.Owner;

@Entity
@Table(name = "restaurants")
public class Restaurant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="restaurant", fetch=FetchType.LAZY)
    private Set<Item> items;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="restaurant", fetch=FetchType.LAZY)
    private Set<Order> orders;

    @OneToOne(cascade=CascadeType.ALL, mappedBy="restaurant")
    private Owner owner;

    public Restaurant(){}

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant(String name, Set<Item> items, Owner owner) {
        this.name = name;
        this.items = items;
        this.owner = owner;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
