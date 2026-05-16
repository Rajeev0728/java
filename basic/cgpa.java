// write a program to calculate CGPA using marks of five subject (out of 100)

public class cgpa {
    public static void main(String[] args){

        float subject1 = 65;
        float subject2 = 85;
        float subject3 = 95;
        float subject4 = 75;
        float subject5 = 45;
        float cgpa = (subject1 + subject2 + subject3 + subject4 + subject5)/50;
        System.out.println(cgpa);
    }
}