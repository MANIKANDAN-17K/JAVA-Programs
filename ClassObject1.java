public class Person{
    String name;
    int age;
 
    public Person( String name,int age) {
        this.name = name;
        this.age = age;
    } 
    void display(){
        System.out.println("name :"+name+"\n age:"+age);
    }
    
}
class ClassObject1{
    public static void main(String[] args) {
        Person p = new Person("mani",21);
        p.display();
        
    }

}

