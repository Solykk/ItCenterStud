package week1.lesson1;

public class EvgenBondar {

	public static void main(String[] args) {
		String str1 = "First string"; // ""
		String str2 = new String("First string"); // new String();

		System.out.println(str1);
		System.out.println(str2);

		char[] chars = { 's', 'e', 'c', 'o', 'n', 'd' };
		String str3 = new String(chars);
		String str4 = new String(chars, 2, 4);

		System.out.println(str3);
		System.out.println(str4);

		char[] str1ch = str1.toCharArray();
		char ch = str1.charAt(3);
		System.out.println(str1ch);
		System.out.println(ch);

		System.out.println("Length: " + str1.length());

		String str01 = "Test";
		String str02 = "Concatination";

		String str03 = str01 + " " + str02;
		String str04 = str01.concat(" ").concat(str02);
		System.out.println(str03);
		System.out.println(str04);

		String str05 = str03.substring(0, 10);
		String str06 = str03.substring(5);
		System.out.println(str05);
		System.out.println(str06);

		System.out.println(str03.contains("st"));

		String[] words = { "test1", "test3", "test2" };

		String str001 = "First string"; // ""
		String str002 = new String("Second string"); // new String();
		String testwords = str001 + " " + str002;
		String[] words01 = testwords.split(" ");
		for (int i = 0; i < words01.length; i++) {
			System.out.print(words01[i] + " ");
		}

		String data01 = "asd. 123. e423; 21; fds / 321";
		String[] data01num = data01.split("[\\s[A-Z_a-z].;/]+");
		for (int i = 0; i < data01num.length; i++) {
			System.out.print(data01num[i] + " ");
		}
	}
}
