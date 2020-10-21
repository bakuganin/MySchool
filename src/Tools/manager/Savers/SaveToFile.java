/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools.manager.Savers;

import interfaces.Saveable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sptvr19.myschool.entity.Person;

/**
 *
 * @author user
 */
public class SaveToFile implements Saveable{
    
    @Override
    public void saveToFile(List arrayList, String fileName) {
        FileOutputStream fos  = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(arrayList);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода, вывода!");
        }
    }
    
    @Override
    public List loadFromFile(String fileName){
        FileInputStream fis  = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            return (List) ois.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода или вывода!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Класс не найден!");
        }
        return new ArrayList();
        
    }




}
