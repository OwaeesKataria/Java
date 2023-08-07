package com.Genpact.Java1;
import java.util.Scanner;
public class SpeedConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in meters: ");
        double distance = sc.nextDouble();

        System.out.print("Enter the time taken (H): ");
        int hours = sc.nextInt();

        System.out.print("Enter the time taken (M): ");
        int min = sc.nextInt();

        System.out.print("Enter the time taken (S): ");
        int sec = sc.nextInt();

        int t_sec = (hours * 3600) + (min * 60) + sec;

        double Mps = distance / t_sec;
        double Kmph = (distance / 1000) / (t_sec / 3600);
        double Mph = (distance / 1609) / (t_sec / 3600);

        System.out.println("Speed in M/s: " + Mps);
        System.out.println("Speed in Km/h" + Kmph);
        System.out.println("Speed in M/h" + Mph);


    }
}
