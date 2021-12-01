/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcjenkins;

/**
 *
 * @author doria
 */
public class CalcJenkins {
    
    public  int somme( int a, int b){
        return a+b;
    }
    
    public int soustraction(int a, int b){
        return a-b;
    }
    
    public int division(int diviseur, int diviser){
        if(diviseur!=0){
            return diviser/diviseur;
        }
        return 0;
    }
    
    public int mutiplication(int a, int b){
        return a*b;
    }
    
}
