package net.eat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import net.eat.domain.Item;
import net.eat.domain.Restaurant;
import net.eat.domain.ShoppingCart;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(optional=false)
    @JoinColumn(name="item")
    private Item item;

    @ManyToOne(optional=false)
    @JoinColumn(name="restaurant")
    private Restaurant restaurant;

    @NotNull
    private String purchaser;

    @NotNull
    private Integer count;

    public Order(){}

    public Order(String purchaser, Item item, Integer count, Restaurant restaurant) {
        this.purchaser = purchaser;
        this.item = item;
        this.count = count;
        this.restaurant = restaurant;
    }

    public long getId() {
        return this.id;
    }

    public Item getItem() {
        return this.item;
    }

    public String getPurchaser() {
        return this.purchaser;
    }

    public String string() {
        return String.format("%s purchased %d %s's", this.purchaser, this.count, this.item.getName());
    }

    public static ArrayList<Order> listFromCart(String purchaser, ShoppingCart cart) {
        ArrayList<Order> newOrders = new ArrayList();
        for (Map.Entry<Item, Integer> entry: cart.getItems().entrySet()) {
            Item item = entry.getKey();
            newOrders.add(new Order(purchaser, item, entry.getValue(), item.getRestaurant()));
        }
        return newOrders;
    }
}
