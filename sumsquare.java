//Hello This is DSA TRAINING   
class sumsquare{
  public static int sums(int n){
    int sum=0;
    int square;
    for(int i=1;i<=n;i++){
      square=i*i;
      sum=sum+square;
}
    return sum;
}
public static void main(String args[]){
    int n=5;
    System.out.println(sums(n));
}
}
