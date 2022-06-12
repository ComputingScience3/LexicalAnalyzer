/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import logic.LexicalAnalyzer;

/**
 *
 * @author yunei
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LexicalAnalyzer analyzer = new LexicalAnalyzer();
        System.out.print("Ingrese la sentencia:");
        System.out.println(analyzer.wordsContained(sc.nextLine()));
    }
    
}
