/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19.myschool.entity;

import java.io.Serializable;

/**
 *
 * @author Jegor Bakunin
 */
public class Person implements Serializable {
    String Name; 
    String LastName;
    String Phone;
    String Role;

    public Person() {
    }

    public Person(String Name, String LastName, String Phone, String Role) {
        this.Name = Name;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Role = Role;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", LastName=" + LastName + ", Phone=" + Phone + ", Role=" + Role + '}';
    }
}
