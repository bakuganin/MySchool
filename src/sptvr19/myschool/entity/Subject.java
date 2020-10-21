/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19.myschool.entity;

/**
 *
 * @author user
 */
public class Subject {
    String name;
    String duration;
    String PersonTeacher;

    public Subject() {
    }

    public Subject(String name, String duration, String PersonTeacher) {
        this.name = name;
        this.duration = duration;
        this.PersonTeacher = PersonTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPersonTeacher() {
        return PersonTeacher;
    }

    public void setPersonTeacher(String PersonTeacher) {
        this.PersonTeacher = PersonTeacher;
    }

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + ", duration=" + duration + ", PersonTeacher=" + PersonTeacher + '}';
    }
    
    
}
