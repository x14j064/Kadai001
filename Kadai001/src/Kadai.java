import java.io.File;
import java.util.Scanner;
public class Kadai {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int life;
		System.out.println("HP�����");
		life = s.nextInt();
		int keiken;
		System.out.println("EXP�����");
		keiken = s.nextInt();
		int kane;
		System.out.println("MONEY�����");
		kane = s.nextInt();
		String name;
		System.out.println("���O�����");
		name = s.next();

		System.out.println("-----�X�e�[�^�X-----");
		System.out.println("HP:"+life);
		System.out.println("EXP:"+keiken);
		System.out.println("MONEY:"+kane);
		System.out.println("���O:"+name);
		System.out.println("�Z�[�u���܂���");


		new File("I:\\java\\test.save");

	}

}
