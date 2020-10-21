/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19.myschool;

import java.util.Scanner;

/**
 *
 * @author Jegor Bakunin
 */
class App {

    public void run() {
        Scanner input = new Scanner(System.in);
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
                    System.out.println("\u001B[44m\u001B[31mВыход из программы...");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("");
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
