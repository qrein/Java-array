public class Main 
{
	public static void main(String[] args) 
	{
		int[] array = new int[12];
		int sum = 0;
        double Sr = 0;

			for (int i = 0; i < array.length; i++) 
			{
				array[i] = (int) Math.round((Math.random()*-15)+15);
			    System.out.print(array[i]+" ");
			    sum += array[i];  
			}
			Sr = (double) sum / array.length;
			System.out.printf("%n����� ����� � �������: %-4d%n" , sum);
            System.out.printf("��.���� ����� � �������: " + Sr);
            

	}
}
