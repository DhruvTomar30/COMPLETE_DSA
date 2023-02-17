public class Constructor {
    public static void main(String args[]){
    //    Constructor p1=new Constructor("dhruv");   // parametrized constructor....
    //     System.out.println(p1.name);

        Student s1= new Student();
        s1.name="dhruv";
        s1.roll=123;
        // s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=88;
        s1.marks[2]=90;

        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=100;
        for(int i=0;i<=3;i++){
            System.out.println(s2.marks[i]);
        }
}
}
//          String name;
//          int rollno;
// Constructor(String name){    
//         // System.out.println("hello ");    // default(non-parametrized) constructor...
//         this.name=name;
// }

    class Student{
        String name;
        int roll;
        String password;
        int marks[];

        // copy Constructor..
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }

    Student(){
        marks=new int[3];
        System.out.println("hello");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}

