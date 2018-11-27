package ArrayList;

import java.util.*;

public class ArraySimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array  = new ArrayList<>();
		String resp = "";
		
		Scanner scanner= new Scanner(System.in);
		
		do{
			System.out.println("Digite uma palavra:");
			resp = scanner.nextLine();
			array.add(resp);
			System.out.println("Deseja fazer de novo:");
			resp = scanner.nextLine();
		}while (resp.equals("sim"));
		
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		scanner.close();
		System.out.close();
	}

}
