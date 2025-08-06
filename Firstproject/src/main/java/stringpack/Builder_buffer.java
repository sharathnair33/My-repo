package stringpack;

public class Builder_buffer {

	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Hi World");
System.out.println(sb);
StringBuilder sbs=new StringBuilder("Hello guys");
System.out.println(sbs);
//insert- to insert new element into the string (index based)
sb.insert(3, "-");
System.out.println(sb);
//append-to add a new string at the last 
sb.append("!!!");
System.out.println(sb);
//replace-to replace a string based on index
sb.replace(0, 1, "Z");
System.out.println(sb);
//reverse-to reverse a string
sb.reverse();
System.out.println(sb);
//delete- to delete a char index based
sb.delete(0, 3);
System.out.println(sb);

	
	
	
	
	}

}
