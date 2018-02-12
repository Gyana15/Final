package Random;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Ram";
StringBuilder st=new StringBuilder(a);
System.out.println(st.reverse());
char b[]={};

for(int i=a.length()-1;i>=0;i--){
System.out.print(a.charAt(i));
}

	}

}
