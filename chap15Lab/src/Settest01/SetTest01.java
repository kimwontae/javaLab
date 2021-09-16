package Settest01;
import java.util.HashSet; 
import java.util.Random; 
import java.util.Set;


	public class SetTest01 {
		public static void main(String[] args) { 
			//int[] n;
			Set s = new HashSet(); 
			Random r = new Random();
			
			while(s.size()<6) {
				s.add(r.nextInt(45)+1);
			}
			
			System.out.println(s);
		}
}


