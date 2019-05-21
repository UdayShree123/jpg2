class App
{
 public static void main(String args[ ])
 {
 float sum,x;
 int k;
 sum = 0.0f;
 for(k =1; k <=5; k++)
 {
 x = 1/(float)k;
 sum = sum + x;
 System.out.println("value of x:" + x);
 }
 System.out.println("sum:" +sum);
 }
}
}
