import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int array[] = new int[10]; 
        System.out.println("��������� ������ ������� 10-� ��������� �������");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt(); 
        }
        System.out.print ("����� �������:");
        for (int i = 0; i < 10; i++) {
            if(i!=9) {
                System.out.printf ( array[i]+"," ); 
            }else
                System.out.print ( array[i]);
        }
        System.out.println();
    }
}