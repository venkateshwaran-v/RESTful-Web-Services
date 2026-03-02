package com.venkatesh.rest.webservices.restful_web_services.user;

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private LocalDate birthDate;

    public User(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthData() {
        return birthDate;
    }

    public void setBirthData(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }
}
