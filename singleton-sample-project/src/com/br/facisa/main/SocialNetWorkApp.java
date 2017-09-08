package com.br.facisa.main;

/**
 * @author Mateus Lourenco
 *
 */
import java.util.Scanner;

import com.br.facisa.entities.User;

public class SocialNetWorkApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		User user = new User();
		String ans = null;

		do {
			System.out.println("Welcome to my Social network!\n");
			System.out.println("Please, fill in the fields below. :)");

			System.out.print("Name: ");
			user.setName(in.nextLine());
			System.out.print("Burn date: ");
			user.setBurnDate(in.nextLine());
			System.out.print("Email adress: ");
			user.setEmail(in.nextLine());
			System.out.println(user.getName()+" is Logged");
			System.out.println("This is your number id: "+user.makeConnection());
			System.out.println("\nDo you want continue? (y/n)");
			ans = in.nextLine();

		} while (ans.equalsIgnoreCase("y"));
		in.close();
	}

}
