import java.io.*;

import java.util.Scanner;

public class Solution {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Type file name: ");
            System.out.println(sum(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Can't calculate.");
        }
    }

    private static int sum(String fileName) throws Exception {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Can't find this file.");
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String number = null;
        int result = 0;
        while ((number = bufferedReader.readLine()) != null) {
            try {
                result += Integer.parseInt(number);
                /*result += new Integer(number);*/
            } catch (Exception e) {
                System.out.println("Invalid number.");
                throw e;
            }
        }
        bufferedReader.close();
        return result;
    }
}