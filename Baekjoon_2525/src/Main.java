import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 	  
	  Scanner sc = new Scanner(System.in);
	  int A = sc.nextInt();
	  int B = sc.nextInt();
	  int C = sc.nextInt();
	  int M = B+C;
	 
	  if(A<24 || A>=0) {     //�� �� 0�ú��� 23�� ���

		for(int i=1; i<=M; i++){  //���� ��� A�� 10 M�� 140�� ��� for���� �ѹ� ���� �� M = 80, A = 11�� �ǰ� M�� 80�̱� ������ if���� ������ ������ �ǹǷ� �ѹ� �� ����ȴ�.
			                      //���� A�� 12, M�� 20�� �ȴ�.
		 if(M>=60){		
		        M=M-60;
			    A=A+1;

			 }
      }
  }  
	  
	  if(A>=24) { //�� �� 24�̻��� ���
		  A=A-24;
		 
		 for(int i=1; i<=M; i++){
				if(M>=60){	
			        M=M-60;
				    A=A+1;
				    
				 }	  
	          } 
	  }
	  
	 System.out.printf("%d %d",A,M);
	}
}
