/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author gustavo.mietlicki
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cat = new Scanner(System.in);
        System.out.println("Quantas pernas? ");
        int pernas = cat.nextInt();
        System.out.println("Isso é um(a) ");
        switch(pernas){
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Bípede");
                break;
            case 3:
                System.out.println("Tripé");
                break;
            case 4:
                System.out.println("Quadrupide");
                break;
            case 6:
            case 8:
                System.out.println("Aranha");
                break;
            default:
                System.out.println("E.T.");
        }
    }
    
}
