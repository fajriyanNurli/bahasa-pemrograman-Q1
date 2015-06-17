import java.util.Stack;
import java.util.*;
public class stack {
    public static void main(String args[]){
        Stack<String> tumpukan=new Stack<String>();

        //Ini Inputannya
        tumpukan.push("10.100000.11");
        tumpukan.push("10.100000.12");
        tumpukan.push("10.100000.13");
        tumpukan.push("10.100000.14");
        tumpukan.push("10.100000.15");

        //Ini Outputnya
        System.out.println(tumpukan.pop());
        System.out.println(tumpukan.pop());
        System.out.println(tumpukan.pop());
        System.out.println(tumpukan.pop());
        System.out.println(tumpukan.pop());
    }
}
