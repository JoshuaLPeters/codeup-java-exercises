package codeup;

public class CodeupTest {
    public static void main(String[] args) {

        String[] student1 = {"Sophie", "K", "Olympic", "Macbook Pro"};

        CodeupStudent sophie = new CodeupStudent(student1, true);

        sophie.greeting();
        sophie.study();
        System.out.println(sophie.giveBusinessCards());
    }
}
