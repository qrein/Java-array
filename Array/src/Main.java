import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int mas[] = new int[10];
        int min=999;
        System.out.println("������� ���-�� ��������: ");
        int kol = input.nextInt();
        System.out.println("������ ������:");
        for (int i = 0; i < kol; i++) {
            mas[i] = input.nextInt(); 
        }
        System.out.print ("����� �������: ");
        for (int i = 0; i < kol; i++) {
            if(mas[i]<min)
                min=mas[i];
            }
        for (int i = 0; i < kol; i++) {
            if(min==mas[i]) {
                System.out.printf ( "���������� �������� ������� "+mas[i]+", ��� �������: "+i+";\n"); 
            }
        }
        System.out.println();
    }
}