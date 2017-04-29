package net.eat.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String text;

    public Comment(){}

    public Comment(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public long getId() {
        return this.id;
    }

    /*
    public String getEmail() {
        return this.email;
    }
    */

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }
}   
