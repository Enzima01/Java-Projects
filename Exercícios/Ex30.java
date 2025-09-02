import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		String[] name = new String[10];
		String[] email = new String[10];
		String[] room = new String[10];

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("\nRent #" + (1 + i) + ":");
			
			System.out.print("Name: ");
			name[i] = sc.nextLine();
			System.out.print("Email: ");
			email[i] = sc.nextLine();
			System.out.print("Room: ");
			room[i] = sc.nextLine();

		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < room.length; i++) {
			if (room[i] != null) {
				System.out.println(room[i] + ": " + name[i] + ", " + email[i]);
			}
		}
		sc.close();
	}

}
