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
        int n=6;
    for(int i=1;i<=n;i++){
        /*spaces*/for(int j=1;j<n-i;j++){
            System.out.println("");
        }
         /*star*/for(int j=1;j<=i;j++){
            System.out.println(j);
        }
        System.out.println();
        }
    }
}
/*3) print 1 to 3 digit  like 
expecte output:
1 2 3 4
1 2 3
1 2 
1
*/

class Inverted_trangle{
    public static void main(String[]args){
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.println(j);
            }
        }
   
        System.out.println();
        }
    }
