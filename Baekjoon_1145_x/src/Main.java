import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] func = new int[5];
		int num = 0;
		int count = 0;
//		for �� �ȿ� Scanner�� �Է��ϸ� func[0] ~ func[4] ���� ������� �Է��� �޴´�.
//		int[] aa = {1,2,3,4,5,6}; System.out.print(dd); �� �����ϸ� �迭�� ���� ��� �Ǵ� ���� �ƴ϶� �޸� �ּ� ���� ��µǾ� �� �� ���� ���� ���´�.
//		���� for ~~ {aa[i]} ó�� �ݺ����� ����ϰ� �迭�� ù��° �ε��� ���� ����ϰų� Arrays.toString(�迭)�� ����ؾ� �Ѵ�.

//		�� �������� �ʿ��� �˰����� ���Ʈ���� �˰����̴�.
//		���Ʈ���� �˰����� ����Ž�� �˰������� ��� ����� ���� Ž���غ��� �˰����̴�.
//		���Ʈ���� �˰����� ������δ� for��, ��Ʈ��ŷ(���), DFS&BFS Ž������ �ִ�.
//		��ü Ž���ϴ� ������δ� ���� ������ ��ü������ Ž���ϴ� ���� Ž��, ���� ������ ��ü������ Ž���ϴ� ���� �켱 Ž��(DFS)
//		�ʺ� �켱 Ž��(BFS)�� �⺻���� �����̴�.
		for (int i=0; i<=4; i++){
			func[i] = sc.nextInt();
		}
		
			while(count<3) {
				num++;
			}
			if(num % func[0] ==0){count++;}
			if(num % func[1] ==0){count++;}
			if(num % func[2] ==0){count++;}
			if(num % func[3] ==0){count++;}
			if(num % func[4] ==0){count++;}
			
			if(count==3){
				System.out.println("count �� 3�� �� : " + num);	
	    }
			System.out.println("num : " + num);
			System.out.println("count : " + count);
			
	}

}
