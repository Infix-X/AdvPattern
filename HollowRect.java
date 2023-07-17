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

/*4)floyed trangle*/
1
1 2
3 4 5
6 7 8 9


    class Inverted_trangle{
    public static void main(String[]args){
        int n=6,counter=1;
    for(int i=1;i<=n;i++){
        /*spaces*/for(int j=1;j<=i;j++){
            System.out.println(counter);
            counter++;
        }
        System.out.println();
        }
    }
}


/*5)binary traingle*/
1
0 1
1 0 1
0 1 0 1
    class binary_trangle{
    public static void main(String[]args){
     
        int n=6;
        for(int i=0;i<=6;i++){
            for(int j=0;j<i;j++){
                if((i+j)%2==0){
                    System.out.println(1); 

                } 
                else {
                    System.out.println(0); 
                }
            }
            System.out.println(); 
            

        }
    }
}

/*6)*/
butterfly pattern
class binary_trangle{
    public static void main(String[]args){
     
        int n=6;
        //halfperiod
        for(int i=1;i<=n;i++){

            //star
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            //space
            for(int j=1;j<=2*(n-1);j++){
                System.out.println(" ");
            }
          //star
             for(int j =1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
            
        }
        //halfperiod
        for(int i=n;i>=n;i--){
            //star
            
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            //space
            for(int j=1;j<=2*(n-1);j++){
                System.out.println("");
            }
          //star
             for(int j =1;j<=i;j++){
                System.out.println("*");
            }

/*7)Solid Rhombas
               *****
              *****
            *****
           *****
         ***** */
          public class Solid_rhombas{
    public static void main(String[]args){
        int n=6;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.println("");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.println("*");
            }
             System.out.println();
        }

    }
}
          
            System.out.println();

    }
    }
}
/*8) hollow rhombas 
       *****
      *   *
    *    *
  *    *
 *****
  */
public class HollowRhombas {
    public static void main(String[]args){
        int n=6;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.println("");
            }
            //star
            for(int j=1;j<=n;j++){
                if(i==1||i==n || j==1||j==n){
                    System.out.println("*");
                }else{
                     System.out.println(""); 
                }
            }
             System.out.println();
        }

    }
    
}
