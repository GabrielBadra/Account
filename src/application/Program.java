package application;

import java.util.Scanner;

import model.entities.Acoount;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Acoount acoount = new Acoount(number, holder, balance, withdrawLimit);
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			acoount.withdraw(withdraw);
			
			System.out.println("New balance: " + acoount.getBalance());
			
		}catch(DomainException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Erro não esperado.");
		}
		
		
		sc.close();
	}

}
