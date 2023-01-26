package service;

public class OperationService implements IOperation{
    @Override
    public int somme(int a, int b) {
        return a+b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a-b;
    }

    public int modulo(int a, int b){
        return a%b;
    }

}
