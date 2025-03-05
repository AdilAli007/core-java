/*
Consider a scenario in which you have to construct a transcript of semesters that you have studied so
far.
Make a class TranscriptSemester1 and furthermore till the semester you are currently studying in and
provide the Semester GPA of each semester and Cammulative GPA of all the semesters BY overriding
relevant functions and displaying the information.
 */

package com.transcript;

    abstract class StudentTranscript {
    static String nameOfStudent = "Aadil" ;
    double creditPoints ;
    int creditHours ;

    public StudentTranscript(double creditPoints,int creditHours){
        this.creditPoints = creditPoints;
        this.creditHours = creditHours;
    }

    public abstract void semesterGPA() ;

}

    class TranscriptSemesterOne extends StudentTranscript{

        public TranscriptSemesterOne(double creditPoints, int creditHours) {
            super(creditPoints, creditHours);
        }

        @Override
        public void semesterGPA() {
            double result = creditPoints / creditHours;
            System.out.println("1st Semester GPA: "+result);
        }

    }

    class TranscriptSemesterTwo extends StudentTranscript{

        public TranscriptSemesterTwo(double creditPoints, int creditHours) {
            super(creditPoints, creditHours);
        }

        @Override
        public void semesterGPA() {
            double result = creditPoints / creditHours;
            System.out.println("2nd Semester GPA: "+result);
        }

    }

    class TranscriptSemesterThree extends StudentTranscript{

        public TranscriptSemesterThree(double creditPoints, int creditHours) {
            super(creditPoints, creditHours);
        }

        @Override
        public void semesterGPA() {
            double result = creditPoints / creditHours;
            System.out.println("3rd Semester GPA: "+result);

    }

    static class TranscriptSemesterFour extends StudentTranscript{

        double totalCreditPoints;
        int totalCreditHours;
        public TranscriptSemesterFour(int totalCreditHours,double totalCreditPoints,double creditPoints, int creditHours) {
            super(creditPoints, creditHours);
            this.totalCreditHours = totalCreditHours;
            this.totalCreditPoints = totalCreditPoints;
        }

        @Override
        public void semesterGPA() {
            double result = creditPoints / creditHours;
            System.out.println("4th Semester GPA: "+result);
        }

        public void calculateCGPA() {
            double result = totalCreditPoints / totalCreditHours;
            System.out.println("Commulative CGPA: "+result);
        }
    }
     public static class Test {
         public static void main(String[] args) {
             System.out.println("Name of Student: "+nameOfStudent);
             TranscriptSemesterOne transcriptSemesterOne = new TranscriptSemesterOne(35,15);
             transcriptSemesterOne.semesterGPA();
             TranscriptSemesterTwo transcriptSemesterTwo = new TranscriptSemesterTwo(32,14);
             transcriptSemesterTwo.semesterGPA();
             TranscriptSemesterThree transcriptSemesterThree = new TranscriptSemesterThree(40,15);
             transcriptSemesterThree.semesterGPA();
             TranscriptSemesterFour transcriptSemesterFour = new TranscriptSemesterFour(90, 140, 34, 15);
             transcriptSemesterFour.semesterGPA();
             transcriptSemesterFour.calculateCGPA();
         }
}
    }