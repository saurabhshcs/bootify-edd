package com.techsharezone.bootify.edd.producer.model;

/*
 * @created 13/11/2020 -03:34
 * @project bootify-edd
 * @author  saurabhshcs
 */

public class Student {

    public final int id;
    public final String name;
    public final int age;
    public final String dateOfBith;
    public final String email;

    public Student(final int id, final String name, final int age,
                   final String dateOfBith, final String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBith = dateOfBith;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBith() {
        return dateOfBith;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dateOfBith=" + dateOfBith + ", email="
                + email + "]";
    }
}
