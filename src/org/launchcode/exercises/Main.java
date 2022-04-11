package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        studentFiles.forEach((key, value) -> {

            if (CheckFileExtension(value) != 1) {
                System.out.println(key);
            }
        });
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        if (y == 0) try {
            throw new ArithmeticException("Can't divide by 0!");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return x / y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if (fileName.equals("")) try {
            throw new Exception("BOO");
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

        String extension = "";
        int i =fileName.lastIndexOf('.');
        if (i > 0) {
            extension = fileName.substring(i + 1);
        }
        if (extension.equals("java")) return 1;
        return 0;
    }

}
