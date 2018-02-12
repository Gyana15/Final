package Random;
public class repeatCharacters2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcadcbdacdbesdfag";
char a[] = new char[str.length()];
int i=0;
int j;
int t=1;
String sum;
String c;
do{
	c="";
	j=i+1;
	while(j<str.length()){
		if(str.charAt(i)!=str.charAt(j)){
			c=c+str.charAt(j);
		}
		j++;
	}
	System.out.println(c);
	sum=str.charAt(i)+c;
	a[t++]=sum.charAt(0);
	i=1;	
	str=sum;
}while(c.length()>=1);
for(int n=1;n<a.length;n++){
	System.out.print(a[n]);
}
	}
}