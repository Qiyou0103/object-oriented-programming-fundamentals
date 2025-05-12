import java.util.Scanner;
public class exercise02 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner input = new Scanner(System.in); 
System.out.println("Enter the number of integer: ");
int num = input.nextInt();
if (num % 2 == 0) {
System.out.println("Number is even.");
} else {
System.out.println("Number is odd.");
}
input.close();
}
}
