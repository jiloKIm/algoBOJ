import java.util.Scanner;


public class Main{ 
  public static void main(String[] args){ 
    
    int []a=new int[2]; 
    Scanner sc =new Scanner(System.in);

    a[0]=sc.nextInt();
    a[1]=sc.nextInt();
if((a[0]<=1000|a[0]>=1000 )& a[0]!=0 &(a[1]<=1000|a[1]>=1000 )& a[1]!=0){
    if(a[0]>0 & a[1]>0){
        System.out.println(1);
    }
else if(a[0]<0 & a[1]>0){
        System.out.println(2);
    }
else if(a[0]<0 & a[1]<0){
        System.out.println(3);
    }
else if(a[0]>0 & a[1]<0){
        System.out.println(4);
    }

}

  }
}