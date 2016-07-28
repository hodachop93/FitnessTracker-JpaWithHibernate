package com.pluralsight.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Hop Dac Ho on 28/07/2016.
 */
@Entity
public class Permission {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String target;

    @NotNull
    private String permission;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
