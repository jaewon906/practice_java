import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���");
		int length = 0;
		
		length = sc.nextInt();
		String [] arr = new String[length];
		
		System.out.println("������ ������ ������ŭ �Է��ϼ���");
		System.out.println(length);
//		next�� nextLine�� �������� \n�� �����ϴ� �� ������ �г� ��ü ������ �г��� ����
		for(int i=0; i<length;i++) {
			
			   arr[i]= sc.next();
			
			System.out.println("arr"+"["+i+"]"+" = "+arr[i]);
			
		}
		
		for(int i=0;i<2;i++){
			
		}

	}

}
