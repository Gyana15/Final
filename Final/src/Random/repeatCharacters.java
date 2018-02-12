package Random;

public class repeatCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="aabcdefbf";
char[] b=a.toCharArray();

for(int i=0;i<a.length();i++){
	for(int j=i+1;j<a.length();j++){
	if(a.charAt(i)==a.charAt(j)){
		b[j]='\0';
	}
}}
StringBuilder sb = new StringBuilder();
for(int t=0;t<b.length;t++){
	sb.append(b[t]);
}
System.out.println(sb.toString());
	}

}
