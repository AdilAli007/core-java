/*
Consider classes:
CEO
Manager
Assistant Manager
Supervisor
Employees
Perform Hierarchal Inheritance which includes information that is relevant between CEO and all other
classes. Each class must contain atleast 4 fields, a parameterized constructor for information input from
the user and a DisplayInformation function.
 */
package com.hierarchal;

     class Ceo {
     static String organizationName = "FAR ORGANIZATION" ;
     static String organizationLocation = "DUBAI";
     private String name;
     private String city;
     private int id ;
     private double salary;

     public Ceo(String name, String city, int id, double salary){
         this.name = name;
         this.city = city;
         this.id = id;
         this.salary = salary;
     }
     public void displayInformation(){
         System.out.println("Name : "+name);
         System.out.println("City: "+city);
         System.out.println("Employee Id: "+id);
         System.out.println("Salary: "+salary);
         System.out.println("Organiztaion Name: "+Ceo.organizationName);
         System.out.println("Organization Location: "+Ceo.organizationLocation);
     }
}
class Manager extends Ceo{
    public Manager(String name, String city, int id, double salary) {
        super(name, city, id, salary);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }
}
class AssistantManager extends Manager{

    public AssistantManager(String name, String city, int id, double salary) {
        super(name, city, id, salary);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }
}
class Supervisor extends  AssistantManager{

    public Supervisor(String name, String city, int id, double salary) {
        super(name, city, id, salary);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }
}
public class Test{
    public static void main(String[] args) {
        Ceo ceo = new Ceo("Rayyan","Hyd",20,190000);
        Manager manager = new Manager("Burhan","Khi",21,200000);
        AssistantManager assistantManager = new AssistantManager("Awais","Dadu",22,210000);
        Supervisor supervisor = new Supervisor("Chintu","Gawadar",23,100000);

        System.out.println("CEO Information:");
        ceo.displayInformation();
        System.out.println("\nManager Information:");
        manager.displayInformation();
        System.out.println("\nAssistant Manager Information:");
        assistantManager.displayInformation();
        System.out.println("\nSupervisor Information:");
        supervisor.displayInformation();
    }
}

