import java.util.*;
import java.lang.Math.*;
public class javaFunctions {
    //1.public static void printHellowWorld(){         
    //     System.out.println("hellow world");
    // }

    // public static void printUsingLoops(){
    //     for(int i=1 ; i<=3;i ++) {
    //         System.out.println("this is function using loop");
    //     }
    // }
    
    // public static void main(String[] args){            //  THIS IS OUR MAIN FUNCTION AND IN JAVA EXUCATION IS START WITH THE MAIN FUNCTION
    //     printHellowWorld();                           // THIS IS CALLED THE CALLING THE FUNCTION (function call)
    
    //     printUsingLoops();                            //this is another function using the for loop (function call)
    // }

    //2.THERE IS ANOTHER FUNCTION 
    // public static void calculateSum(int num1, int num2) {
    //     int sum = num1 + num2 ;
    //     System.out.println("the sum is : " + sum);
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int  a = sc.nextInt();
    //     int  b = sc.nextInt();
    //     calculateSum(a, b);
    // } 
    
    //CALL BY VALUE
    // public static void swap(int a,int b) {     //here passes the copy of the a and b from main function
    //     int temp= a;
    //     a=b;
    //     b=temp;                                   //whatever change occures in the finction is only function
    //     System.out.println("first is : " +a);     //it not effect main function or any other function
    //     System.out.println("second is : " +b);
    // }
    // public static void main(String[] args) {
    //     int a = 34;
    //     int b =43;
    //     swap(a,b);       //only in that function valuse of a and b are change not int the main function

    //     System.out.println("this is main function thats why a ans b are not change=" + a);
    //     System.out.println("this is main function thats why values not change="+b);
    // }

    // public static int pro(int a ,int b) {
    //     int product = a*b;
    //     System.out.println("the product of a and b is : " +product);
    //     return product;
    // }
    // public static void main(String[] args) {
    //     pro(3,5);
    // }

    //find the factorial of any number 
    // public static void main(String[] args){
    //     int i = 1;
    //     int fact = 1;
    //     for(i=1;i<=5;i++){
    //         fact = i*fact;
          
    //     }
    //     System.out.println("fact : " + fact);
    // }


    //FUNCTION OVERLOADING
    //1.FUNCTION IS SAME NAME BUT DIFFRENT PARAMETERS
//     public static int sum (int a , int b){
//         return a +b;
//     }
//     public static float sum(float a , float b,float c){
//         return a + b + c;
//     }
//     public static int sum(int a , int b, int c){
//         return a+b+c;
//     }
//     public static void main(String[] args){
    
//         System.out.println(sum(84, 39));
//         System.out.println(sum(32.4f, 323.3f, 232.23f));
//         System.out.println(sum(83, 343, 34));

//     }
        


    //2.FUNCTION OVERLOADING USING DATA TYPE
    // public static int sum (int a,int b){
    //     return a+b;
    // }
    // public static float sum(float a , float b){
    //     return a+b;
    // }
    // public static void main(String[] args){
    //     float sum = sum(45.45f, 45.47f);
    //     System.out.print(sum);

    // }


    // CHECH THE WEATHER NO IS PRIME OR NOT 
   
  

     //CHECK THE GIVEN NO IS PRIME OR NOT
    //  public static boolean IsPrime (int a){
    //     boolean IsPrime = true;
    //     for (int i = 2; i <=a-1; i++){
    //         if(a % i ==0){
    //             IsPrime = false;
    //         }
    //     }
    //     return IsPrime;
    //  }


    //OPTIMIZE CODE OF FINDING PRIME NO 
    // public static boolean isprime(int n){
    //     for(int i = 2; i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             return false;
              
    //         }
    //     }
    //     return true;
    // }

    // public static void isprimerange(int n){
    //     for (int i =2;i<=n;i++){
    //         if(isprime(i)){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }

    //TO FIND THE BINARY TO DECIMAL
    // public static void binToDeci(int a){
    //     int pow =0;
    //     int ld=0;
    //     int decimal=0;
    //     while(a>0){
    //         ld = a %10;
    //         decimal = decimal+int(ld *(int)Math.pow(2, pow));
    //         a = a/10;
    //         pow++;
    //     }
    //     System.out.println(decimal);
    // }

    //public static void binToDeci(int a){
    //    int myoriginal_no=a;
    //    int ld=0;
    //    int pow=0;
    //    int decimal =0;
    //    while(a>0){
    //        ld = a%10;
    //        decimal= decimal+(ld * (int)Math.pow(2,pow));
    //       a = a/10;
    //        pow++;
    //    }
    //    System.out.println(myoriginal_no+" is converted binary to decimal is "+decimal);
    //}
    //public static void main(String[] args){
        //isprimerange(20);
    //    binToDeci(111);

//         System.out.println(PrimeNo(20));
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 2;i<n-1;i++){
//             if(n%i==0){
//                 System.out.println("this is not prime");
//                 break;
//             } else {
//                 System.out.println("this is prime no");
//                 break;
//             }
        // }
    //     int sum =0;
    //     for (int i = 3;i<100;i++){
            
    //         if(i%3==0){
    //             sum =sum+i;  
    //         }
    //     }
    //     System.out.println(sum);
    //System.out.println(IsPrime(6)); 
    //System.out.println(isprime(13));
    //isprimerange(20);
     }
}
