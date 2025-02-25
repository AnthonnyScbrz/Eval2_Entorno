package core.input;

import java.util.Scanner;

public class Input {
    static Scanner values = new Scanner(System.in);

    public static int getOptionMenu(){
        return values.nextInt();
    }
    public static int getNumberOfProduct(){
        return values.nextInt();
    }
    public  static String getProductReference(){
        return values.next();
    }
    public static byte getNumberProductRegister(){
        return values.nextByte();
    }
    public static String getRegisterDay(){
        return values.next();
    }
}
