/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19.myschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sptvr19.myschool.entity.Person;
import Tools.manager.Managers.PersonManager;
import Tools.manager.Savers.SaveToFile;

/**
 *
 * @author Jegor Bakunin
 */
class App {
    private Scanner input = new Scanner(System.in);
    private List<Person> listPersons = new ArrayList<>();
    private PersonManager personManager = new PersonManager();
    
    public App () {
        SaveToFile saveToFile = new SaveToFile();
        this.listPersons = saveToFile.loadFromFile("ListPersons");
    }
    public void run() {
        boolean repeat = true;
        System.out.println("<--- Моя школа --->");
        do{
            System.out.println("\u001B[35mСписок задач:");
            System.out.println("\u001B[36m(\u001B[35m0\u001B[36m) - Выход из программы");
            System.out.println("\u001B[36m(\u001B[35m1\u001B[36m) - Добавить ученика");
            System.out.println("\u001B[36m(\u001B[35m2\u001B[36m) - Список учеников");
            System.out.println("\u001B[36m(\u001B[35m3\u001B[36m) - Добавить учителя");
            System.out.println("\u001B[36m(\u001B[35m4\u001B[36m) - Список учителей");
            System.out.println("\u001B[36m(\u001B[35m5\u001B[36m) - Добавить предмет");
            System.out.println("\u001B[36m(\u001B[35m6\u001B[36m) - Список предметов");
            System.out.println("\u001B[36m(\u001B[35m7\u001B[36m) - Выставить оценку");
            System.out.println("\u001B[36m(\u001B[35m8\u001B[36m) - Посмотреть оценки ученика");
            System.out.println("\u001B[36m(\u001B[35m9\u001B[36m) - Посмотреть оценки по предмету");
            System.out.println("\u001B[36m(\u001B[35m9\u001B[36m) - Изменить оценку");
            System.out.println("\u001B[35mВыберите задачу:\u001B[32m");
            String Task = input.nextLine();
            switch(Task){
                case "0":
                    System.out.println("\033[4;32mВыход из программы...");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("");
                    
                    Person student = personManager.createPerson("STUDENT");
                    personManager.addPersonToList(student, listPersons);
                    break;
                case "2":
                    System.out.println("");
                    for(int i = 0; i < listPersons.size(); i++){
                        String role = listPersons.get(i).getRole();
                        if("STUDENT".equals(role)){
                            System.out.println(listPersons.get(i).getName() + " " + listPersons.get(i).getLastName());
                        }
                    }
                    break;
                case "3":
                    System.out.println("");
                    break;
                case "4":
                    System.out.println("");
                    break;
                case "5":
                    System.out.println("");
                    break;
                case "6":
                    System.out.println("");
                    break;
                case "7":
                    System.out.println("");
                    break;
                case "8":
                    System.out.println("");
                    break;
                case "9":
                    System.out.println("");
                    break;
                default:
                    System.out.println("\u001B[31mТакой задачи нету, выберите из списка!");
            }
        }while(repeat);
        
    }
    
}
