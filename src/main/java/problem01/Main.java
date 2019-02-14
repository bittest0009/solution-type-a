package problem01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		List<Integer> numList = new ArrayList<>();
		int count = 0;
		int num = number;
		
		while(num/10 != 0) {
			numList.add(num%10);
			num /= 10;
		}
		numList.add(num);
		
		for(int i=0; i<numList.size() ; i++) {
			int temp = numList.get(i);
			if(temp==3 || temp==6 || temp==9) {
				count++;
			}
		}
		
		return count;
	}
}