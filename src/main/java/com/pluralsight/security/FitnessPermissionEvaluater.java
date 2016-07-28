package com.pluralsight.security;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;
import java.io.Serializable;

/**
 * Created by Hop Dac Ho on 28/07/2016.
 */
public class FitnessPermissionEvaluater implements PermissionEvaluator {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        Object[] args = {((User) authentication.getPrincipal()).getUsername(),
                targetDomainObject.getClass().getName(),
                permission.toString()};
        int count = jdbcTemplate.queryForObject("select count(*) from permissions p where " +
                "p.username = ? and p.target = ? and p.permission = ?", args, Integer.class);
        if (count == 1)
            return true;
        else
            return false;
    }

    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        return false;
    }
}
