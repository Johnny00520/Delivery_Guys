package net.eat.domain;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.io.Serializable;
import java.lang.Long;

@Component
@Scope("session")
public class ShoppingCart implements Serializable {
    private HashMap<Item, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap();
    }

    public void addItem(Item item, Integer count) {
        Integer currentCount;
        if (this.items.containsKey(item)) {
            currentCount = this.items.get(item);
        } else {
            currentCount = 0;
        }
        Integer newCount = currentCount + count;
        this.items.put(item, newCount);
    }

    public void setItemCount(Item item, Integer count) {
        this.items.put(item, count);
    }

    public HashMap<Item, Integer> getItems() {
        return this.items;
    }
}
