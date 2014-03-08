/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns;


public class App {


    public static void main(String[] args) {
        testarSingleton();
    }

    private static void testarSingleton() {
        for (int i = 0; i<3; i++){
          Singleton sing = Singleton.createIntance();
        }
    }

}
