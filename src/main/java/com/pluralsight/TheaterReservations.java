package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Get the users full name
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine().trim();
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        //Get the reservation date
        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateInput, formatter);

        //Get the number of tickets
        System.out.println("How many tickets would you like: ");
        int numberOfTickets = Integer.parseInt(scanner.nextLine().trim());

        //Find out if the word "ticket" will be plural or singular
        String ticketWord;
        if (numberOfTickets == 1) {
            ticketWord = "ticket";
        } else {
            ticketWord = "tickets";
        }

        //Display the output
        System.out.println(numberOfTickets + " " + ticketWord + " reserved for " + date + " under " + lastName + ", " + firstName);

    }

}
