
import java.util.*;
public class Main {
   
	public static void main(String[] args) {
	//System.out.println("�� �ֻ��� ���� �Է��ϼ���");
	
	int Dice[] = new int[3];
	int Money = 0;
	
	Scanner sc = new Scanner(System.in);          //������ �ֻ��� ���� �Է� �޴´�.
	Dice[0] = sc.nextInt();
	Dice[1] = sc.nextInt();
	Dice[2] = sc.nextInt();
	//for(int i=0; i<=2; i++)
	//{
	//	Scanner sc = new Scanner(System.in);      //������ �ֻ��� ���� �Է� �޴´�.
	//	Dice[i] = sc.nextInt();
		
	//}  
	    int judge_1 = (Dice[0]>Dice[1]) ? Dice[0]:Dice[1];  // ���� ū �ֻ��� ���� �Ǻ��Ѵ�
	    int judge = (judge_1>Dice[2]) ? judge_1:Dice[2];
	    
    
	if(Dice[0]==Dice[1] || Dice[1] ==Dice[2] || Dice[2] ==Dice[0])  //���� ���� 2���� ���         
	{   
		if(Dice[0]==Dice[1] && Dice[1] ==  Dice[2] && Dice[2] ==Dice[0]) //3���� ���� ���� ��
		{
			Money = 10000+Dice[0]*1000;
		    System.out.println(Money);
		}
		else
		for(int i = 0; i<Dice.length;i++)
		{
			for(int j = i+1; j <Dice.length; j++)
			{
				if(Dice[i]==Dice[j])
				{
					System.out.println(1000+Dice[i]*100);
				}
			}
	
		} 
           
	}
	
	if(Dice[0] != Dice[1] && Dice[1] != Dice[2] && Dice[2] != Dice[0])  //���� �ٸ� ���� ���� ��
	{      
	         System.out.println(judge*100);
	}
		
	}

}
