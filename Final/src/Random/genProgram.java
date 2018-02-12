package Random;

import java.util.Scanner;

public class genProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//-------------Form a tree-----------
/*for(int i=0;i<10;i++){
	for(int j=0;j<=i;j++){
		System.out.print(j+" ");
	}
	System.out.println();
}*/
//----------------------------------------

//------Factorial-----------
int i;
System.out.println("Please Enter a value: ");
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
//--------------
System.out.print("Factorial of "+ i+ " is :");
if(i==1)
	System.out.print(i);
	
else{
	int j;
	j=i;
	while(j>1){
		i=i*--j;
	}
	System.out.print(i);
}
	}

}
