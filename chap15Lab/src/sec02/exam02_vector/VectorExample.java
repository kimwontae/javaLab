package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("재목1", "내용1", "글쓴이1"));
		list.add(new Board("재목2", "내용2", "글쓴이2"));
		list.add(new Board("재목3", "내용3", "글쓴이3"));
		list.add(new Board("재목4", "내용4", "글쓴이4"));
		list.add(new Board("재목5", "내용5", "글쓴이5"));
		
		//list.remove(2);
		//list.remove(3);
		//int j=list.size();
		for(int i=0;i<3;i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}

	}

}
