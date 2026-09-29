public class Main {

    public static void main(String[] args) {
//    Primitive data types
        int age = 18;
        double gpa = 4.5;
        char letter = 'B';
        boolean isStudent = true;

//     Reference data types
        String university = "Polsko Japońska Akademia Technik Komputerowych";

//      Print all at once
        if (isStudent) {
            System.out.println("The student studies at " + university + " and his gpa is " + gpa + ".");
            System.out.println("The student's name starts with " + letter + " and he is " + age + "years old.");
        }
        else {
            System.out.println("This user is not a student!");
        }
    }
}
