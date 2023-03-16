import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Main {
//  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)) 은 Scanner sc = new Scanner(System.in) 보다
//  처리속도가 매우 빠르다.
//  단 BufferedWriter bw = new BufferedWeiter(new OutputStreamWriter(System.out)) 과 같이 써야하고
//  import java.io.InputStreamReader & import java.io.OutputStreamWriter & java.io.IOException 세개를 import 해야하고
//	main 클래스 옆에 throws IOException을 적어야 한다.
//	또한 입력 받을 때 String 변수1 = bf.readLine();으로 받는데 이것은 string으로 밖에 받지 못하므로 숫자로 변경하고 싶으면
//	변수2 = Integer.parseInt(변수1)로 정수형으로 바꿔줘야한다.
//	출력할 때는 bw.write(출력하고 싶은 것) 으로 출력하는데 버퍼를 닫아줘야 하므로 출력 후에는
//	bw.flush(); 와 bw.close()를 선언해야한다.
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String test_case = bf.readLine();
		
//		Integer.parseInt()를 할 경우 NumberFormatException이 발생할 수 있다. 따라서 try ~ catch문을 사용해서 예외처리 발생 시
//		중단 되지 않고 실행하게 해준다.
		
		try {
			
		    int test_case_num = Integer.parseInt(test_case);
		    for(int i=0;i<test_case_num;i++) {
		    	String input1 = bf.readLine();
				String input2 = bf.readLine();
				int value1 = Integer.parseInt(input1);
			    int value2 = Integer.parseInt(input2);
			    if(value1<=1000 && value1>=1 && value2>=1 && value2 <=1000){
			    	bw.write(value1+value2+"\n");
			    	}

		    }
		    }catch(NumberFormatException e) {}
		
//		bw.write에는 System.out.println();과 같이 자동개행기능이 없기 때문에 개행을 해주어야 할 경우에는 \n을 통해 따로 처리해야한다.
		bw.flush();
		
		bw.close();
		
		
  }
}
//