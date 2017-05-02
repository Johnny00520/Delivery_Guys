package net.eat.domain;

import java.util.List;
import java.util.ArrayList;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ItemDao extends CrudRepository<Item, Long> {
    public Item findByName(String name);
    public ArrayList<Item> findAllByRestaurant(Restaurant restaurant);
    public ArrayList<Item> findAll();
}
