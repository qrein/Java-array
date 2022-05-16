public class Main {
	public static void main(String[] args){
		 
		String[] a = { " Невежда "," про"," нее"," свой"," толк", " все", " к", " худу", " клонит;", " А", " ежели"," невежда", " познатне,", " так", " он", " ее" ," еще",
				" и", " гонит."};
		System.out.print("Исходный массив: ");
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}
		System.out.println();
		
		int n = a.length;
		String temp;
 
		for (int i = 0; i < n/2; i++) {
		    temp = a[n-i-1];
		    a[n-i-1] = a[i];
		    a[i] = temp;
		}
		System.out.print("Полученный массив: ");
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}
	}
}
