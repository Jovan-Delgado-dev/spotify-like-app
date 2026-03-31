package com.jovan;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        String[] songs = {
            "Aperture",
            "Blinding Lights",
            "Halo",
            "Shape of You"
        };

        do {
            System.out.println("\n=== Spotify Menu ===");
            System.out.println("[H] Home");
            System.out.println("[S] Search by title");
            System.out.println("[L] Library");
            System.out.println("[Q] Quit");
            System.out.print("Choose an option: ");

            choice = input.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'H':
                    System.out.println("Home - Welcome to your music app");
                    break;

                case 'S':
                    input.nextLine();
                    System.out.print("Enter song title: ");
                    String title = input.nextLine();

                    boolean found = false;

                    for (String song : songs) {
                        if (song.equalsIgnoreCase(title)) {
                            System.out.println("Found: " + song);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Song not found.");
                    }
                    break;

                case 'L':
                    System.out.println("Your Library:");
                    for (int i = 0; i < songs.length; i++) {
                        System.out.println((i + 1) + ". " + songs[i]);
                    }
                    break;

                case 'Q':
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 'Q');

        input.close();
    }
}