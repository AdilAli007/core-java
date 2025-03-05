/*
Consider classes:
Head of Department
Co-ordinator
Faculties
Students
Perform Multilevel Inheritance in which information is passed on from the Head of Department to the
next class. You can assume any scenario as per your wish. Each class must contain atleast 4 fields, a
parameterized constructor for information input from the user and a DisplayInformation function.
 */

package com.multilevelInheritance;

    class Faculties {
        String universityName ;
        String facultyName;
        int totalFacultiesInUniversity;
        String nameOfDeanOfFaculty;

        public Faculties(String universityName, String facultyName, int totalFacultiesInUniversity , String nameOfDeanOfFaculty){
            this.universityName = universityName;
            this.facultyName = facultyName;
            this.totalFacultiesInUniversity = totalFacultiesInUniversity;
            this.nameOfDeanOfFaculty = nameOfDeanOfFaculty;
        }
        public void displayInformation(){
            System.out.println("University Name: "+universityName);
            System.out.println("Total Faculties in University: "+totalFacultiesInUniversity);
            System.out.println("Name of Faculty: "+facultyName);
            System.out.println("Dean of Faculty: "+nameOfDeanOfFaculty);
        }
    }

    class HeadOfDepartment extends Faculties {
    private String nameOfHOD ;
    private String nameOfDepartment ;

    public HeadOfDepartment(String nameOfHOD,String nameOfDepartment,String universityName, String facultyName, int totalFacultiesInUniversity, String nameOfDeanOfFaculty) {
            super(universityName, facultyName, totalFacultiesInUniversity, nameOfDeanOfFaculty);
            this.nameOfHOD = nameOfHOD ;
            this.nameOfDepartment = nameOfDepartment;
        }

        @Override
        public void displayInformation() {
            System.out.println("Name Of HOD: "+nameOfHOD);
            System.out.println("Name Of Department: "+nameOfDepartment);
            super.displayInformation();
        }
    }

    class Coordinator extends HeadOfDepartment {
    String nameOfCoordinator;

    public Coordinator(String nameOfCoordinator,String nameOfHOD,String nameOfDepartment, String universityName, String facultyName, int totalFacultiesInUniversity, String nameOfDeanOfFaculty) {
            super(nameOfHOD,nameOfDepartment, universityName, facultyName, totalFacultiesInUniversity, nameOfDeanOfFaculty);
            this.nameOfCoordinator = nameOfCoordinator;
        }

        @Override
        public void displayInformation() {
            System.out.println("Name of Coordinator: "+nameOfCoordinator);
            super.displayInformation();
        }
    }

    class Students extends Coordinator {
        String nameOfStudent ;

        public Students(String nameOfStudent,String nameOfCoordinator, String nameOfHOD, String nameOfDepartment, String universityName, String facultyName, int totalFacultiesInUniversity, String nameOfDeanOfFaculty) {
            super(nameOfCoordinator, nameOfHOD, nameOfDepartment, universityName, facultyName, totalFacultiesInUniversity, nameOfDeanOfFaculty);
            this.nameOfStudent = nameOfStudent;
        }

        @Override
        public void displayInformation() {
            System.out.println("Student Name: "+nameOfStudent);
            super.displayInformation();
        }
    }
    public class Test {
        public static void main(String[] args) {
            Students students = new Students("Aadil","Ali","Waseem","CS","UOS","IT",10,"Awais");
            students.displayInformation();
        }
    }

