package a1_106601015_1;
import java.util.Scanner;

public class a1_106601015_1 {

	public static void main(String[] args) {
		// calculate avenger
		Scanner scanner = new Scanner(System.in);
		int avenger = 0;
		for(int i = 1; i <= 3; i++){
			avenger += scanner.nextInt();
        }
		avenger = avenger/3;
		
		// print avenger score and level
        String level = "";
        if(avenger >= 90){
        	level = "A";
        }
        else if(avenger >= 80) {
        	level = "B";
        }
        else if(avenger >= 70) {
        	level = "C";
        }
		else if(avenger >= 60) {
			level = "D";
		}
        else{
        	level = "D";
        }
        System.out.printf("%d\n", avenger);
        System.out.printf("%s", level); 
	}

}
