
package ex19;
import java.util.Scanner;

public class Ex19 {
int Calculate1 (int m, int n)
  {
    int sum = 0;
    for (int i = m; i <= n; i++)
      if ((i % 3 == 0) && (i % 5 == 0))
	sum = sum + i;
      return sum;
  }
int Calculate2 (int m, int n)
  {
    int sum = 0;
    for (int i = m; i <= n; i++)
      if ((i % 3 == 0) || (i % 5 == 0))
	sum = sum + i;
      return sum;
  }
int Calculate3 (int m, int n)
  {
    int sum = 0;
    for (int i = m; i <= n; i++)
      if ((i % 3 != 0) && (i % 5 != 0))
	sum = sum + i;
      return sum;
  }

    public static void main(String[] args) {
        // TODO code application logic here
        //int i;
        int result=0;
         Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the value of m and n");
    int m = sc.nextInt ();
    int n = sc.nextInt ();
    Ex19 q = new Ex19 ();
        System.out.println("1. and operation\n 2. and operation\n 3. not operation");
        int i = sc.nextInt ();
        switch(i){
            case 1:{
                 result = q.Calculate1 (m, n);
                break;
            }
            case 2:{
                 result = q.Calculate2 (m, n);
                break;
            }
            case 3:{
                 result = q.Calculate3 (m, n);
                break;
            }
        }
    //int result = q.Calculate (m, n);
    System.out.println (result);
    }
    
}
