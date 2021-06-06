/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_07;

import java.util.Scanner;

public class AreaFinder {
    public static void main(String[] args){
        //constant variable
        final double CONVERSION = 0.09290304;

        System.out.print("What is the length of the room?");
        Scanner input = new Scanner(System.in);
        String LengthStr = input.next();
        double length = Double.parseDouble(LengthStr);

        System.out.print("What is the width of the room?");
        String WidthStr = input.next();
        double width = Double.parseDouble(WidthStr);

        //calculations
        double area = length*width;
        double areaMeterss = area*CONVERSION;

        System.out.print("you entered dimensions "+ length + " feet by "+ width+ "feet.\n");
        System.out.print("The area is: \n"+ area+ " Square feet \n"+ areaMeterss+ " square meters");
    }
}
