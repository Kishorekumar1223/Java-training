package sorting;

public class StringTask {

	public static void main(String[] args) {
		String str = "Hello world";
		logic(str);
		System.out.println();
		inter(str);
		System.out.println();
		split(str);
		Sym(str);
	}
	public static void logic(String s) {
		String sArr = s.replace("world", "all");
		System.out.print(sArr);
	}
	public static void inter(String s) {
		String[] sArr = s.split(" ");
		for (int i = sArr.length-1;i>=0;i--) {
			System.out.print(sArr[i]+" ");
		}
	}
	public static void split(String s) {
		String sArr =s.replace(" ","___");
		System.out.println(sArr);
	}
	public static void Sym(String s) {
		String[] sArr = s.split("");
		for (int i =0;i<sArr.length;i++) {
			if(i%2==0) {
				System.out.print(sArr[i]+"_");
			}else {
				System.out.print(sArr[i]+"*");
			}
		}
	} 
}
