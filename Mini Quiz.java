/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaaaaaaaaaaaaaaaaaa;


import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class AAAAAAAAAAAAAAAAAAA {

    public static void main(String[]args) {
        
        int point = 0;
    
        String user = JOptionPane.showInputDialog("Enter your username: ");
        String number = JOptionPane.showInputDialog("Enter number(s) of exercise:  ");
        int num =Integer.parseInt(number);
        
        do{
        Random random = new Random();
        
        int x = random.nextInt(3)+1;
        
        switch (x){
            case 1:
                String answer = JOptionPane.showInputDialog("3 * 5 = ? ");
                if ("15".equalsIgnoreCase(answer)) {
                    point++;
                } else {
                    point = point;
                }
                break;
            case 2:
                answer = JOptionPane.showInputDialog("18/3 = ? ");
                if ("6".equalsIgnoreCase(answer)) {
                    point++;
                } else {
                    point = point;
                }
                break;
            case 3:
                answer = JOptionPane.showInputDialog("15 + 5 = ? ");
                if ("20".equalsIgnoreCase(answer)) {
                    point++;
                } else {
                    point = point;
                }
                break;  
        } 
        num--;
        } while (num > 0);
        
        JOptionPane.showMessageDialog(null, "Congratulations "+user+", Your score is "+point+"/"+number);
        
    }
 }

