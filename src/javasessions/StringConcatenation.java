package javasessions;


public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=200;
		
		String x="hello";
		String y="hi";
		
		System.out.println(a+b);//300
		System.out.println(x+y);//hello
		
		System.out.println(a+x);//100hello
		System.out.println(a+b+x+y);//300hellohi
		System.out.println(x+y+a+b);//hellohi100200		
		System.out.println(x+y+(a+b));//hellohi300		
		System.out.println(a+b+x+y+a+b);//300hellohi100200
		
		double c=12.33;
		double d=23.44;
		System.out.println(x+y+c+d);//hellohi12.3323.44
		System.out.println(a+b+c+d+x+y);//hellohi
	
		char c1='a';//97
		char c2='b';//98
		System.out.println(c1+c2+x+y);//195hellohi
		
		System.out.println(c1+" "+c2);//hellohi
		System.out.println(x+" "+y);//hello hi
		
		String t1="a";
		String t2="b";
		System.out.println(t1+" "+t2);//a b
		
		System.out.println(c1+' '+c2);//227 = 97+ASCII code for space+98
		
		System.out.println(true+x);//truehello
		System.out.println('a'+'b'+"hello"+"selenium"+100+200+12.33);//195helloseenium10020012.33
		
		
		
	
	}

}
