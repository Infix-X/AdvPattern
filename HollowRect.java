import java.util.*;
void prinHolloRect(int rowLen,int colLen,int i,int j)
  {
  for(int i=0;i<=rowLen;i++){
    for(int i=0;i<=colLen;i++){
      if(i==1||i==rowlen||j==1||j==colLen){
        System.out.println("*");
      }
      System.out.println("*");
    }
    
  }
  }

o/p:
*****
*    *
*    * 
*****  

/*2)print inverted traingle
  expexted output:
      *
     * *
   * * *
*  * * *
 */

  class Inverted_trangle{
    public static void main(String[]args){
        int n=3;
    for(int i=0;i<n;i++){
        /*spaces*/for(int j=0;j<n-i;j++){
            System.out.println("");
        }
         /*star*/for(int j=0;j<i;j++){
            System.out.println("*");
        }
        System.out.println();
        }
    }
}
