class Animal {
    private String name;
    Animal(String name){
        this.name= name;
    }
    String getName(){
        return name;
    }
    void makeSound(){
        System.out.println( "Animal make sound");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("bow bow");
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("meow meow");
    }
}
class OOPs{
    public static void main(String args[]){
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        System.out.println("Dog name : "+(dog.getName()));
        dog.makeSound();
        System.out.println("Cat name : "+(cat.getName()));
        cat.makeSound();
    }
}
