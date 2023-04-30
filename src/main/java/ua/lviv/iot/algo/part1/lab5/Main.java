package ua.lviv.iot.algo.part1.lab5;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public final class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        System.out.print("Enter search word: ");
        String searchWord = scanner.nextLine();

        Finder finder = new Finder();
        String foundedNames = finder.findImagesFiles(text, searchWord);
        System.out.println(foundedNames);
    }
}

