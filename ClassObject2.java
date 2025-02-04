class Dog{
    String name;
    int breed;
    Dog(String name,int breed){
        this.name = name;
        this.breed = breed;
    }
    void setBread(int bread){
                this.breed = bread;
    }
    void display()
       {
         System.out.println("DOG name :"+name+" \n Breed : "+breed);
       }
}
class ClassObject2{
    public static void main(String arg[]){
        Dog d = new Dog("puppy",5);
        d.display();
        d.setBread(10);
        d.display();
        
    }
}