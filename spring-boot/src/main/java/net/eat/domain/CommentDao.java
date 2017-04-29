package net.eat.domain;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CommentDao extends CrudRepository<Comment, Long> {
    public Comment findByName(String name);
}
