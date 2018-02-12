package Random;

public class sortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={6,8,1,15,4,2};
int m;
for(int i=0;i<a.length;i++){
	for(int j=i+1;j<a.length;j++){
		if(a[i]<a[j]){
			continue;
		}
		else{
			m=a[i];
			a[i]=a[j];
			a[j]=m;
		}
	}
}
for(int k=0;k<a.length;k++)
System.out.println(a[k]);
	}

}
