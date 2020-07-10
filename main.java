import java.util.Random;
class Main {
  public static void main(String[] args) {
    int trials1 = 1000000; //can change
    int dicesides = 6; //can change
    int totalamount = 0; //cannot change
    int amount = 0; //cannot change
    int trials2 = trials1;
    while(trials1 > 0){
      amount = amount + 1;
      Random rand = new Random();
      int n = rand.nextInt(dicesides);
      n += 1;
      Random rand1 = new Random();
      int n1 = rand1.nextInt(dicesides);
      n1 += 1;
      if(n == n1){
        trials1 = trials1 - 1;
        totalamount = totalamount + amount;
        amount = 0;
      }
    }
    double average = totalamount / (double) trials2;
    System.out.println("Trials: " + trials2);
    System.out.println("Average: " + average);
  }
}
