package BoardExample;
// DAO(Data Access Object) Ŭ����

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList();
	}

	// �� �Է� ó�� �޼ҵ�
	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��ǿ� ���� �ۼ� �ϼ���.");
		System.out.print("�ۼ���:");
		String register = sc.next();

		System.out.print("�̸���:");
		String email = sc.next();

		System.out.print("��й�ȣ:");
		String passwd = sc.next();

		System.out.print("����:");
		String subject = sc.next();

		System.out.print("�۳���:");
		String content = sc.next();

		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		addArticle(boardVO);
	}

	// �� �ۼ�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// �۸�� ���
	public void listArticles(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i).toString());
			}
		} else {
			System.out.println("��ϵ� ���� �����ϴ�.");
		}
	}

	// ������ ���� �ۼ��� �� ��й�ȣ �Է��ϴ� �޼ҵ�  //��
	public void removeArticle(Scanner sc) {
			if(boardList.size()==0) {
				System.out.println("��ϵ� ���� �����ϴ�.");
			}else {
				System.out.println("������ ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���");
				System.out.print("�ۼ���:");
				String register = sc.next();
				System.out.print("��й�ȣ:");
				String passwd = sc.next();

				if(boardList.size()>0) {
					for(int i=0;i<boardList.size();i++) {
						if(boardList.get(i).getRegister().equals(register)) {
							if(boardList.get(i).getPasswd().equals(passwd)) {
							
							boardList.remove(i);
							System.out.println("�����Ϸ�");
							i--; //�迭�� �����Ǹ� �������� ������ ���� �Ǳ⶧���� �ѹ��� üũ�ϱ� ���ؼ� i���� ���ش�.
							}	
						}
					
					}	
				}else {
					System.out.println("�ش��ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
				
			}
	}
	
}
