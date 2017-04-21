/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktory;

/**
 *
 * @author jaroslaw.ziolkowski
 */
public class Dog {

   
    
    Dog(String bark){
        System.out.println("This dog says: " +bark);
    }
    
    Dog(int bar){
        System.out.println("This dog says barks: " +bar+ " many times");
    }
    
    void Pick(){
        System.out.println("This pick method"); 
    }
    void Pic(){
        Pick();
        System.out.println("This is pic method. Haha");
    }
}
