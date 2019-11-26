package util;
public class InputTest {
    public static void main(String[] args) {
        System.out.println(Input.getString());
        System.out.println(Input.yesNo());
        System.out.println(Input.getInt(2, 9));
        System.out.println(Input.getInt());
        System.out.println(Input.getDouble(1.22, 9.22));
        System.out.println(Input.getDouble());
    }
}
