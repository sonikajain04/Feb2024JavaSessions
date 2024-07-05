package javasessions;

public class CharacterConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1='a';
		char c2='b';
		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c1+c2);//97+98 = 195 - sum of ASCII code
		System.out.println("Byte value of c1 : "+(byte)c1);//97
		System.out.println("Byte value of c1 without byte: "+(0+'a'));//97	
		System.out.println("Byte value of c2 : "+(byte)c2);//98
		
		System.out.println("Byte value of c1 without byte: "+(c1+0));//ASCII value of a=97
		System.out.println("Byte value of c2-c1 without byte: "+(c2-c1));//98-97=1
		
		System.out.println(0+'$');//36 - ASCII value of '$'	
		System.out.println((byte)'$');//36 - ASCII value of '$'
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);//30
		
		
	}

}
