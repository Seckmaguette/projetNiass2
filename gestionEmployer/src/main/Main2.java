package main;

import service.ICalcul;
import service.IOperation;
import service.OperationService;

public class Main2 {
    public static void main(String[] args) {
        IOperation op1=new OperationService();
        System.out.println(op1.multi(10,5));
        System.out.println(op1.somme(10,20));
        IOperation op2=new IOperation() {
            @Override
            public int somme(int a, int b) {
                System.out.println("je suis somme et je ne calcule rien");
                return 0;
            }
        };
        op2.somme(10,20);

        ICalcul c1=(a,b)-> {
         return    a - b;
        };
        System.out.println(c1.operation(10,5));
    }
}

