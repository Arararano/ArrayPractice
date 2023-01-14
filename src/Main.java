import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Volvo");
        int index = 0;
        String temp;
        Scanner kb = new Scanner(System.in);
        
        Integer test;

        System.out.println("Enter a String to be added to the array at index 1");
        temp = kb.nextLine();

        list.add(temp);

        System.out.println("Enter a index to call from the array");
        index = kb.nextInt();

        System.out.print("You called " + list.get(index));
        
    }





    public static void arrayTest(String[] args){
        int[] arr;
        arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        for(int i = 0; i < arr.length; i++){
            System.out.println("Elements at index " + i + " is " + arr[i]);

        }
    }
 
}