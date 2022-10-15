import javax.sound.sampled.Line;

public class JavaPattern {
    public static void main(String[] args) {

        // PRINT THE PATTERN
        
       /*  for (int i = 1 ; i <= 5; i++ ){       //first loop is decide the horizontal line here 4
            for (int j=1; j <= i ; j++){      // second inner loop is decide the how many vertical line is print here 4
                System.out.print(" * ");   //and into the inner loop there is the what to print here * is print 
            }                                //very important here to write only print because the one line print
            System.out.println();             
        }
        
     } */

    // PRINT THE INVERTED STAR PATTERN

    /*for ( int i = 1; i<=4 ; i++){
        for ( int j =4 ; j>=i; j--){
            System.out.print("*");
        }
        System.out.println();
      }*/


    // INVERTED PATTERN ANOTHER LOGIC
    /*int n = 4;
    for ( int line=1 ; line<= n; line++) {
        for (int star=1; star<=n-line+1; star++ ){
            System.out.print("*");
        }
        System.out.println();
    }*/
    

   
    // PRINT THE NUMEBR PYRAMID
    /*for(int line = 1; line<=4; line++) {
    for(int no=1; no<=line; no++){
        System.out.print(no);
    }
    System.out.println();
    }*/

     //PRINT THE CHANRACTER PYRAMID 

   /*char ch = 'A';
   //this if outer loop for (horizontal line)
   for (int line = 1; line<=4; line++) {

    //this is inner loop (for the vertical lines)
    for(int chars = 1; chars <=line; chars++) {
        System.out.print(ch);
        ch++;
    }
    System.out.println();
    }*/
    for ( int i= 1; i<=5; i++) {
        for (int j=1; j<=6; j++) {
            if (j==2 || j==3 || j==4 || j==5){
                System.out.print(" ");
                continue;
            }
           System.out.print("*");
        }
        System.out.println();
    }
  
   

    }
}
