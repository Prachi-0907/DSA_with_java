import java.util.*;
class Swap{
    public static void main(String args[]){
        int i,temp;
        int a[]={1,2,3,4,5,6};
      for(int n=0;n<a.length;n++){
        temp=a[n];
        a[n]=a[n+1];
        a[n+1]=temp;
        n=n+1;
     }
     for(int n=0;n<a.length;n++){
        System.out.print(a[n]);
        
    }
}
}