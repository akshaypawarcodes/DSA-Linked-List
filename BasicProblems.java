public class BasicProblems {
    public static void main(String[] args) {

        //problem 1(sum of natural num)
//        int n=7;
//        int sum=0;
//        System.out.println("natural numbers are");
//        for(int i=1; i<=n; i++){
//            sum=sum+i;
//            System.out.print(i+" ");
//
//        }
//        System.out.println();
//        System.out.println("sum of natural num "+ sum);

        //problem 2(factorial of n)
//        int n=5;
//        int fact=1;
//        for(int i=1; i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println("factorial of n is ");
//        System.out.println(fact);

        //problem 3(fibonaci series)

        int num=10;
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for(int i=2; i<=num;i++){
            n3=n1+n2;
            System.out.print(" "+n3+" ");
            n1=n2;
            n2= n3;
        }
    }
}
