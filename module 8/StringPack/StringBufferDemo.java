package StringPack;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("Ashu");
		sb.append(" cdac nashik");
		System.out.println(sb);
		
		int i=sb.indexOf("h");   //2   
		System.out.println("i is" +i);    // 2 Ashu cdac nashik
		int i1=sb.lastIndexOf("a");  //11
		System.out.println("i1 is" + i1);
		sb.replace(6, 9, "new");
		System.out.println(sb);
		 // Ashu cdac nashik
		sb.delete(0,4);
		//   start  end
		System.out.println(sb);
		System.out.println(sb.reverse());

	}

}
