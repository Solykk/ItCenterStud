package lesson4;

public class Task1 {
	public static void main(String [] args){
		String str1 = "First string";//""
		String str2 = new String("First string");// new String();
		System.out.println(str1);
		System.out.println(str2);
		char[] chars  = {'s','e', 'c',  'o', 'n', 'd'};
		String str3 = new String(chars);
		String str4 = new String(chars, 2, 4); // со второго по четвертый
		System.out.println(str3);
		System.out.println(str4);
		char[] str1ch = str1.toCharArray();
		char ch = str1.charAt(3);
		System.out.println(str1ch);
		System.out.println(ch);
		System.out.println(str1.length());
		String str01 = "Test";
		String str02 = "COncatination";
		String str03 = str01 + " " + str02;
		String str04 = str01.concat(" ").concat(str02);
		System.out.println(str03);
		System.out.println(str04);
		String str05 = str03.substring(0, 10);
		String str06 = str03.substring(5);
		System.out.println(str05);
		System.out.println(str06);
		System.out.println(str03.contains("st"));
		String[] words = { "test1", "test3", "test2"};
		String  testwords = str1 + str2;
		String[] words01 =  testwords.split(" ");
		for(int i = 0; i < words01.length; i++){
			System.out.print(words01[i] + " ");
		}
		System.out.println();
		String data  = "1/23/43/54/76";
		String[] dataArr = data.split("/");//data.split("[\\s.,;:]+");заменят пробелы
		for(int i = 0; i < dataArr.length; i++){
			System.out.print(dataArr[i] + " ");
		}
		System.out.println();
		String data1  = "1 /23 /. 43/54/76";
		String[] dataArr1 = data1.split("[\\s.,;:]+");
		for(int i = 0; i < dataArr1.length; i++){
			System.out.print(dataArr1[i] + " ");
		}
		System.out.println();
		String data01  = "adf. 123. /. ret456;/ 5 4/lfpn904lfjjf/ 76";
		String[] data01num = data01.split("[\\s[A-Z_a-z].;/]+");
		for(int i = 0; i < data01num.length; i++){
			System.out.print(data01num[i] + " ");
		}
	}
}
