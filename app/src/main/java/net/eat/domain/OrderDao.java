package net.eat.domain;

import java.util.List;
import java.util.ArrayList;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import net.eat.domain.Restaurant;

@Transactional
public interface OrderDao extends CrudRepository<Order, Long> {
    public ArrayList<Order> findAllByPurchaser(String purchaser);
    public ArrayList<Order> findAllByRestaurant(Restaurant restaurant);
}
