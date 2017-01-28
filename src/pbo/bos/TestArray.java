/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.bos;

import javax.swing.JOptionPane;

/**
 *
 * @author Mic
 */
public class TestArray {
       public static void main(String[] args) {
        int[] data = {20, 10, 50, 30, 10, 100, 102, 103, 104, 109, 90, 12, 14, 16};
        int i;
        
        String bilangan=JOptionPane.showInputDialog("Jumlah data yang akan ditampilkan (1-14)");
        i=Integer.parseInt(bilangan);
        System.out.println("banyak data adalah="+i);
        
        if (i == 1){
        for (i = 0; i < 1; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 2){
        for (i = 0; i < 2; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 3){
        for (i = 0; i < 3; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 4){
        for (i = 0; i < 4; i++) {
            System.out.println(data[i]);
        }
        }else if(i == 5){
            for (i = 0; i < 5; i++) {
            System.out.println(data[i]);
        }
        }else if(i == 6){
        for (i = 0; i < 6; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 7){
        for (i = 0; i < 7; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 8){
        for (i = 0; i < 8; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 9){
        for (i = 0; i < 9; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 10){
        for (i = 0; i < 10; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 11){
        for (i = 0; i < 11; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 12){
        for (i = 0; i < 12; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 13){
        for (i = 0; i < 13; i++) {
            System.out.println(data[i]);
        }
        }else if (i == 14){
        for (i = 0; i < 14; i++) {
            System.out.println(data[i]);
        }
        }
          
       }
}
