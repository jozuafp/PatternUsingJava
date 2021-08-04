/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator_01;

/**
 *
 * @author Jozua Palandi
 */
public class Mediator_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      User jozua = new User("Jozua");
      User palandi = new User("Palandi");

      jozua.sendMessage("Hi! Palandi!");
      palandi.sendMessage("Hello! Jozua!");
   }
    
}
