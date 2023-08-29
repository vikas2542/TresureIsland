package treasureislandgame;

import java.util.Scanner;

public class TreasureIslandGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		System.out.println("Welcome to the Enchanted Island. Your goal is to discover the hidden treasure.");
		System.out.println("You are at a fork in the road. Will you go left or right?");
		choice = scanner.nextLine();
		if (choice.equalsIgnoreCase("left")) {
			System.out.println("You've chosen the path on the left.");
			System.out.println("You arrive at a riverbank. Now, do you swim across or look for a way around?");
			choice = scanner.nextLine();
			if (choice.equalsIgnoreCase("swim")) {
				System.out.println(
						"You jump into the river but are quickly surrounded by playful dolphins. They guide you safely to the other side.");
				System.out.println(
						"You continue your journey and stumble upon a massive wall of fire. Will you attempt to pass through it (red door) or seek a different route?");
				choice = scanner.nextLine();
				if (choice.equalsIgnoreCase("red")) {
					System.out.println(
							"You sprint through the fire unscathed. What an amazing feat! You find yourself in a chamber filled with glowing gems. Congratulations, you've found the treasure!");
				} else {
					System.out.println(
							"You choose a different route and come across three doors: blue, yellow, and green.");
					System.out.println("Which door will you enter?");
					choice = scanner.nextLine();
					if (choice.equalsIgnoreCase("blue")) {
						System.out.println(
								"You enter the blue door and discover a room filled with sparkling crystals. Although it's not the treasure, it's a sight to behold!");
					} else if (choice.equalsIgnoreCase("yellow")) {
						System.out.println("Congratulations! You've found the legendary treasure chest!");
					} else {
						System.out.println(
								"You enter the green door and find yourself in a serene forest. While it's not the treasure, it's a peaceful place to explore.");
					}
				}
			} else {
				System.out.println(
						"You decide to find a different path and encounter a friendly traveler who helps you navigate around the river. You continue your journey.");
			}
		} else if (choice.equalsIgnoreCase("right")) {
			System.out.println(
					"You've chosen the right path and come across a hidden tunnel. You venture inside and find the treasure chest! Congratulations!");
		} else {
			System.out.println("Your hesitation leads to a dead-end. Game Over.");
		}
	}
}
