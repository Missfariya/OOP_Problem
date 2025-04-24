class person {
    private String name;
    private int age; 

    person(String name, int age) {
        this.name = name; 
        this.age = age; 
    } 
    public String getname(){ 
        return name; 
    } 
    public int getage(){ 
        return age; 
    } 
    public void setname(String name){ 
        this.name = name; 
    } 
    public void setage(int age){ 
        this.age = age; 
    }
    
}

public class Q1 {

    public static void main(String[] args) {
        person p1 = new person("Fariya", 21); 
        person p2 = new person("Sara", 22); 

        System.out.println(p1.getname() + " is " + p1.getage() + " years old"); 
        System.out.println(p2.getname() + " is " + p2.getage() + " years old"); 

        System.out.println();

        // modify the age for person1 
       p1.setage(22); 
       p2.setage(24); 

       System.out.println("Set new age for both persons"); 
       System.out.println();
       System.out.println(p1.getname() + " is now " + p1.getage() + " years old"); 
       System.out.println(p2.getname() + " is now " + p2.getage() + " years old"); 

    }
}