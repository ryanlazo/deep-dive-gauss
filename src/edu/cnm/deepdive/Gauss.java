package edu.cnm.deepdive;

public class Gauss {

  private static final int DEFAULT_UPPER_LIMIT = 100;

  public static void main(String[] args) {
    int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_LIMIT;// ternary
                                                                                         // operator
    System.out.printf("The sum from 1 to ,d is %,d%n", upperLimit, sum(upperLimit));
  }

  public static long sum(int limit) {
    long sum = 0; // start with zero in order to count up to whatever the number is
    for (int i = 1; i <= limit; i++) {// int i = 1 because you start at one, condition as long as i
                                      // is less than or equal to i we continue
      sum += i;// upper limit in the previous public defines all the 'limit' stuff down here so
      // if the command line gives you a 10 in place holder args [0] then 10 is your upper limit
      // making 10 the long sum(int 10) and the <=limit (10)
    }
    return sum;
  }

  public static long smartSum(int limit) {
    long sum = ((long) limit) * ((long) limit + 1) / 2;
    return sum;
  }


}// codingbat.com 
