package problem04;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//게임
		
		//무조건 3자리 숫자여야하는가? 맨앞에 0 가능?
		int result = ((int)Math.random())*100 + ((int)Math.random())*10 + ((int)Math.random());
		int count = 0;
		
		List<Integer> tempList = new ArrayList<>();
		List<Integer> numList = new ArrayList<>();
		int resultTemp = result;
		while(resultTemp/10 != 0) {
			numList.add(resultTemp%10);
			resultTemp /= 10;
		}
		numList.add(resultTemp);
		
		while(true) {
			int sCount = 0;
			int bCount = 0;
			int zeroCount = 0;
			int temp = ((int)Math.random())*100 + ((int)Math.random())*10 + ((int)Math.random());
			count++;
			
			int tempNum = temp;
			while(tempNum/10 != 0) {
				tempList.add(tempNum%10);
				tempNum /= 10;
			}
			tempList.add(tempNum);
			
			for(int i=0; i<tempList.size(); i++) {
				
			}
			
			System.out.println("> "+temp);
			System.out.println(count + " - S:" + sCount + ", B:" + bCount +", O:" + zeroCount);
			
			if(temp == result) {
				System.out.println("(종료)");
				break;
			}
		}
		
	}
}