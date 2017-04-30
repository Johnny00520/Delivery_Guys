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
public interface OwnerDao extends CrudRepository<Owner, Long> {
    public Owner findByUsername(String username);
    public ArrayList<Owner> findAll();
}
