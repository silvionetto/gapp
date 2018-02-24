package com.ing.gapp.entity;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseEntity {

    private String name;
    private String password;
    private List<Role> roles = new ArrayList<>();

    public User() { }

    public User(int id, String name, String password, int version) {
        setId(id);
        setName(name);
        setPassword(password);
        setVersion(version);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                ", version='" + getVersion() + '\'' +
                '}';
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}
