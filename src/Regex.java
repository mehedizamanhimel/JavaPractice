import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public void patternMatchesOne() {
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		
		System.out.println(b);
		
		boolean a = Pattern.compile(".aaaaa.").matcher("saaaaas").matches();
		System.out.println(a);
		
		boolean abcd = Pattern.matches("saa", "saa");
		if(abcd==true) {
			System.out.println("111 True");
		}
		else{
			System.out.println("111 False");
		}
		
		boolean c = Pattern.matches("[aaabbb]+", "aaaaaaaaabbbbbbbb");
		System.out.println(c);
		
		String as = ".a";
		String asd = "sa";
		boolean s = Pattern.matches(as, asd);
		System.out.println(s);
		
		boolean d = Pattern.matches("\\D .a [aaabbb]+ ", "a sa aaaaaaaaabbbbbbbb 2");
		System.out.println(d);
		
		
		System.out.println("asdfasfasdf "+Pattern.matches("[a-z0-9]{6}", "1aS111"));
		
		
	}

	public void IntToString() {
		int i = 200;
		String str = Integer.toString(i);
		String str2 =  String.valueOf(i);
		System.out.println(str);
		System.out.println(str2);

		String string = "This is a string";
		System.out.println(string);
		String[] str4 = string.split("\\s");
		for (String s : str4){
			System.out.println(s);
		}

	}
}
