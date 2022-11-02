/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximunexam;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MaximunExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creer un programme qui calcule le maximun entre 3 valeurs
        //en utilisant la forme conditionnelle IF
        
        Scanner scan = new Scanner(System.in);
        // creation de l'instance 
        System.out.println("entrer valeur 1");
        // afficher un message a l'utilisateur
        int v1 = scan.nextInt();
        // permettre a l'utilisateur d'entrer une valeur par le clavier
        System.out.println("entrer valeur 2");
        int v2 = scan.nextInt();

        System.out.println("entrer valeur 3");
        int v3 = scan.nextInt();

        int max;
        // initialiser max et definir son type

        if (v1 > v2) {
            if (v1 > v3) {
                max = v1;
            } else {
                max = v3;
            }
        } else if (v2 > v3) {
            max = v2;
        } else {
            max = v3;
        }

        System.out.println("le maximum est egale a : " + max);
    }

}
