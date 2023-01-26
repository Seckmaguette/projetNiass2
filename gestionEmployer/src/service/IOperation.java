package service;

public interface IOperation {
     default public  int somme(int a, int b){
        return a+b;
    }
    default public int soustraction(int a, int b){
        return a-b;
    }

    default public int multi(int a, int b) {
       return a*b;
    }

}
