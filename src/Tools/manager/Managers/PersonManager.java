/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools.manager.Managers;

import Tools.manager.Savers.SaveToFile;
import java.util.List;
import java.util.Scanner;
import sptvr19.myschool.entity.Person;

/**
 *
 * @author user
 */
public class PersonManager {
    private Scanner input = new Scanner(System.in);
    public Person createPerson(String role) {
        System.out.println("<--- Добавление ученика --->");
        Person student = new Person();
        System.out.println("Имя студента: ");
        student.setName(input.nextLine());
        System.out.println("Фамилию студента: ");
        student.setLastName(input.nextLine());
        System.out.println("Телефон студента: ");
        student.setPhone(input.nextLine());
        student.setRole(role);
        return student;
    }

    public void addPersonToList(Person student, List<Person> listPersons) {
        listPersons.add(student);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveToFile(listPersons,  "ListPersons");
    }
    
}
