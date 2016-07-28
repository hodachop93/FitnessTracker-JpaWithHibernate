package com.pluralsight.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Hop Dac Ho on 27/07/2016.
 */
@Entity
@Table(name = "authorities")
public class Authority {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String authority;

    @OneToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
