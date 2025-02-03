class StudentInfo{
     public String name;
    public int age;
    public char grade;
    StudentInfo(String name, int age, char grade){
            this.name = name;
            this.age = age;
            this.grade = grade;
    }
    void dispalyInfo(){
        System.out.println("name :"+name+"\n age :"+age+"\ngrade :"+grade);
    }
}
public class Student{
    public static void main(String args[]){
        StudentInfo stud1,stud2;
        stud1 = new StudentInfo("mani",21,'u');
        stud2 = new StudentInfo("raja",20,'a');
        stud1.dispalyInfo();
        stud2.dispalyInfo();

    }
}