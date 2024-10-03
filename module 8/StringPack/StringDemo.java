package StringPack;

public class StringDemo {

	public static void main(String[] args) {
		 String str =new String("  Ashvini aa Puri");
		 String str2 =new String("   Puri");
        System.out.println(str.substring(5));     //vini
        System.out.println(str.substring(5,8));    // vin
                                    // start  end
        System.out.println(str.trim());
        System.out.println(str.substring(5,8));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim().toLowerCase());   //nested fun
        System.out.println(str.indexOf("V"));
        System.out.println(str.replace("v","w"));
        System.out.println(str.concat(str2));
        if(str.equals(str2));
        System.out.println("same");
        String[] arr=str.split(" ");
        for(String s:arr)
        {
        	System.out.println(s);
        }
	} 

}
