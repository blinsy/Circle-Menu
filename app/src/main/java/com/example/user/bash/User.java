package com.example.user.bash;

public class User {
    private String names,email,age;

    public User(String names, String email, String age) {
        this.names = names;
        this.email = email;
        this.age = age;
}
    // generate another empty const

    public User() {
    }
    //generate getter and setter
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
