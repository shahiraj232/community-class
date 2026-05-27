/*John needs to write a program to calculate the total distance
travelled by a vehicle. The program will take initial velocity,
acceleration, and time as input from the user. To calculate the
distance, John can use the following formula:*/

import java.util.Scanner;

public class Distance{
    public static void main(String[] args){
        double dis,u,a,t;
        System.out.println("Enter inital velocity in m/s");
        Scanner sc = new Scanner(System.in);
        u = sc.nextDouble();
        System.out.println("Enter acceleration in m/s");
        a = sc.nextDouble();
        System.out.println("Enter Time in seconds");
        t = sc.nextDouble();

        dis= (u*t) + ((a*t*t)/2);
        System.out.println("Distance = "+dis);

    }
}