package lotto;
import java.util.HashSet; 
import java.util.Random; 
import java.util.Set;


	public class lotto {
		public static void main(String[] args) { 
			//int[] n;
			Set s = new HashSet(); 
			Random r = new Random();
			
			while(s.size()<6) {
				s.add(r.nextInt(45)+1);
			}
			
			System.out.println(s.toString());
		}
}


