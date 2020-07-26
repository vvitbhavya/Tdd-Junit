public class Main {
	String remove_A_FromFirstTwoCharAts(String string)
    {
        String str=" ";
        if(string.length()>=2 && string.charAt(0)=='A' && string.charAt(1)=='A')
            str=string.substring(2,string.length());
        else if(string.length()>=1 && string.charAt(0)=='A')
            str=string.substring(1,string.length());
        else if(string.length()>=2 && string.charAt(1)=='A')
            str=string.charAt(0)+string.substring(2,string.length());
        else
            str=string;
        return str;
    }
	public static void main(String args[]) {
    	String s="Anjali";
    	Main m=new Main();
    	System.out.println(m.remove_A_FromFirstTwoCharAts(s));
    }
}