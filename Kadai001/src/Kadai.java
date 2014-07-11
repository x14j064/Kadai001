import java.io.File;
import java.util.Scanner;
public class Kadai {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int life;
		System.out.println("HPを入力");
		life = s.nextInt();
		int keiken;
		System.out.println("EXPを入力");
		keiken = s.nextInt();
		int kane;
		System.out.println("MONEYを入力");
		kane = s.nextInt();
		String name;
		System.out.println("名前を入力");
		name = s.next();

		System.out.println("-----ステータス-----");
		System.out.println("HP:"+life);
		System.out.println("EXP:"+keiken);
		System.out.println("MONEY:"+kane);
		System.out.println("名前:"+name);
		System.out.println("セーブしました");


		new File("I:\\java\\test.save");

	}

}
