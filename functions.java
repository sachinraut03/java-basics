import java.nio.file.ReadOnlyFileSystemException;

public class functions{
    //FOR FINDING THE PRIME NO 
    public static int PrimeNo(int a){
        for(int i=2;i<=a-1;i++){
                if(a%i==0){
                    System.out.println(a+" is not prime no");
                    break;
                }else{
                    System.out.println(a+" is prime no");
                    break;
                }
            }
        }
       return a;
    }

    //FOR FINDING THE PRIME NO INTO RANGE
    // public static void primeInRange(int n){
    //     for( int i=2;i<=n;i++){
    //         if(primeNo(i)){
    //             System.out.println(i+" ");
    //         }
    //     }
    // }

    public static void main(String[] args){
        System.out.println(PrimeNo(35));
        //primeInRange(20);
    }
}