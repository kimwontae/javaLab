package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("���1", "����1", "�۾���1"));
		list.add(new Board("���2", "����2", "�۾���2"));
		list.add(new Board("���3", "����3", "�۾���3"));
		list.add(new Board("���4", "����4", "�۾���4"));
		list.add(new Board("���5", "����5", "�۾���5"));
		
		//list.remove(2);
		//list.remove(3);
		//int j=list.size();
		for(int i=0;i<3;i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}

	}

}