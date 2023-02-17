public class OOPS {     // Classes and Objects....
    public static void main(String args[]){
        Pen p1=new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // p1.color="yellow";
        // System.out.println(p1.color);

        // BankAccount myAccount=new BankAccount();
        // myAccount.username="dhruv";
        // System.out.println(myAccount.username);
        // // myAccount.Password="dfnkd";   // Gives Error 
        // myAccount.setPassword("hello");
        
        p1.setColor("green");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

    }
}

// Access Modifiers...
class BankAccount{
    public String username;
    private String Password;
    public void setPassword(String pwd){
        Password=pwd;
    }
}

// class Pen{
//     String color;
//     int tip;

//     void setColor(String newColor){
//         color=newColor;}

//     void setTip(int newTip){
//         tip=newTip;
//     }
// }

// Another Class...
class Student{
    String name;
    int age;
    float Percentage;

    void calcPercentage(int phy,int chem,int math){
        Percentage=(phy+chem+math)/3;
    }
}
    // Getters and Setters....
    class Pen{
        private String color;
        private int tip;

        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
        void setColor(String newColor){
            this.color=newColor;
        }
        void setTip(int newTip){
            this.tip=newTip;
        }
}

