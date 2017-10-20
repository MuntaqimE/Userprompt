import java.util.Scanner;
import java.lang.String;
public class Userprompt{
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		String username,password;
		System.out.println("Enter your username");
		username = keyboard.nextLine();
		System.out.println("enter your password");
		password = keyboard.nextLine();
		if (username.equals("Muntaqim")&&(password.equals("me22810"))){
			System.out.println("Welcome Muntaqim!");
		}
		else {
			System.out.println("You have entered the wrong username or password");
		}
	}
}

