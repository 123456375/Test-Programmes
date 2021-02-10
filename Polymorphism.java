package Test;

public class Polymorphism {
    public static void main(String[] args){
        Animal obj1 = new Dog();
        Dog obj2 = new Dog();
        Animal obj3 = new Horse();
        Horse obj4 = new Horse();
        Animal obj5 = new Animal();
        Cat obj6 = new Cat();
      
        obj1.shout(); 
        obj2.shout(); 
        obj3.shout();
        obj4.shout();
    }   
}

class Animal{
    public void shout(){
        System.out.println("Parent animal's shout");
    }       
}

class Dog extends Animal{
    public void shout(){
        System.out.println("bark..");
    }
}

class Cat extends Animal{
    public void shout(){
        System.out.println("meu meu..");
    }
}

class Horse extends Animal{
    public void shout(){
        System.out.println("neigh");
    }
}