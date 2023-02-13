package com.bridgelabz.workshop4;
import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hotel name");
        String hotelName = scanner.next();
        System.out.println("Is customer a rewards customer:Y or N?");
        String customerRewards = scanner.next();
        System.out.println("Enter date of Check-In");
        int checkIn = scanner.nextInt();
        System.out.println("Enter date of Check-Out");
    }
}
