package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitites.Book;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Book> list = new ArrayList<>();

		System.out.print("How many books will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nBook #" + (i + 1) + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			while (idVerification(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Title: ");
			sc.nextLine();
			String title = sc.nextLine();
			System.out.print("Pages: ");
			int pages = sc.nextInt();
			Book book = new Book(id,title,pages);
			list.add(book);
		}

		System.out.print("\nWhats is the book Id to add pages? ");
		int id = sc.nextInt();
		Book book = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (book == null) {
			System.out.println("\nThis id doesn't exist");
		}else {
			System.out.print("\nHow many pages will be added? ");
			int quantity = sc.nextInt();
			book.addPages(quantity);
		}
		
		for(Book obj : list) {
			System.out.println();
			System.out.println(obj);
		}
		sc.close();
	}
	
	public static boolean idVerification(List<Book> list, int id) {
		Book book = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return book != null;
	}
}
