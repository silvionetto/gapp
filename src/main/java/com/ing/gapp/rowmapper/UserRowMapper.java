package com.ing.gapp.rowmapper;

import com.ing.gapp.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User>{

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("user_name"));
        user.setPassword(resultSet.getString("user_password"));
        user.setVersion(resultSet.getInt("version"));
        return user;
    }
}
