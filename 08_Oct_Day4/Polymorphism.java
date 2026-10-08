class Calculator{
    int add(int a, int b){
        return a+b;
    }

    //same name ,three parameters
    int add(int a,int b,int c){
        return a+b+c;
    }

    //same name different types
    double add(double a,double b){
        return a+b;
    }
}

//runtime
class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks: boo boo");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat mews:Meow Meow!");
    }
}

public class Polymorphism {
    
    public static void main(String[] args){
        Animal pet1=new Dog();
        Animal pet2=new Cat();
        Animal pet3=new Animal();

        pet1.makeSound();
        pet2.makeSound();
        pet3.makeSound();
    }
}
