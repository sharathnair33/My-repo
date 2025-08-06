package stringpack;

public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hi Sharath";
System.out.println(s);
String s1=new String("Hi world");
System.out.println(s1);
//charat-to return character in the string at index positn.
System.out.println(s.charAt(5));
//length-to return the size of the string.
System.out.println(s.length());
//concat-to add two strings.
System.out.println(s1.concat(s));
//contains-to check weather a character/word is present in the string.

System.out.println(s1.contains(s));
System.out.println(s.contains("S"));
//touppercase-to convert lower case to upper case.
System.out.println(s.toUpperCase());
//tolowercase-to convert upper case to lower case.	
System.out.println(s.toLowerCase());
//equals-to compare if 2 strings are equal.
System.out.println(s.equals(s1));
String v="java";
String w="java";
String x="Java";
System.out.println(w.equals(x));
//equalsignorecase-	to ignore the case 
System.out.println(w.equalsIgnoreCase(x));
String a=new String("java");
System.out.println(v.equals(a));
System.out.println(v==a);
//equal operator= check content
//equal method= checks for memory location
System.out.println(v==w);
//isEmpty-to check if the string is empty(boolean)
System.out.println(a.isEmpty());
String b="";
System.out.println(b.isEmpty());
//valueof-convert Datatype to String
int c=25;
System.out.println(String.valueOf(c));

	}
	

}