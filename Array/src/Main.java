import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int mas[] = new int[10];
        int min=999;
        System.out.println("Введите кол-во символов: ");
        int kol = input.nextInt();
        System.out.println("Вводим массив:");
        for (int i = 0; i < kol; i++) {
            mas[i] = input.nextInt(); 
        }
        System.out.print ("Вывод массива: ");
        for (int i = 0; i < kol; i++) {
            if(mas[i]<min)
                min=mas[i];
            }
        for (int i = 0; i < kol; i++) {
            if(min==mas[i]) {
                System.out.printf ( "Наименьшее значение массива "+mas[i]+", его позиция: "+i+";\n"); 
            }
        }
        System.out.println();
    }
}