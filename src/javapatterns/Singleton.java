
package javapatterns;


public class Singleton {
    
    private static Singleton instance;
    
        private Singleton(){
        System.out.println("Criou a classe");
        }
          
        public static Singleton createIntance(){
        
        if (instance == null){
            instance = new Singleton();
        }
        
        return instance;
    }
    
}
