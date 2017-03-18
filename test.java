package os.CLI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import os.Query.echoQuery;

public class test {
	public static void main(String[] args) {
//		VariableList vl = new VariableList();
//		Scanner s = new Scaßnner(System.in);
//		echoQuery eq = new echoQuery(new Expression("salam"));
//		System.out.println(eq.execute());

		String str = "if(expresion){statement}";
		String pattern = "[iI][fF](.*)\\{.*\\}";
		pattern = "[iI][fF](.*)\\{.*\\}";

		Pattern r = Pattern.compile(pattern);

		Matcher m = r.matcher(str);
		if (m.find( )) {
			System.out.println("Found value: " + m.group(0) );
			System.out.println("Found value: " + m.group(1) );
			System.out.println("Found value: " + m.group(2) );
			System.out.println("Found value: " + m.group(3) );

		}else {
			System.out.println("NO MATCH");
		}
	}
}
