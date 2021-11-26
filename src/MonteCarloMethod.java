import java.util.Random;
import java.lang.Math;

public class MonteCarloMethod {
  //problema 37

  public static void main(String[] args) {
    int iter = 1000000, insideCircle;
    double x, y;
    double S = 0;

    Random randNum = new Random();

    for(int i = 0; i < iter; i++) {
      x = randNum.nextDouble();
      y = randNum.nextDouble();
//      System.out.println("randX=" + randX + "    randY=" + randY);
      if(Math.pow(x,2)+(Math.pow(y,2)) <= 1) {
        S += Math.sqrt( Math.pow(Math.cos(x),4) + Math.pow(Math.sin(y),6)) + 2/(1+Math.pow(Math.sin(x*y),6));
      }
    }
    S=S/iter;
    System.out.println("R="+S);
  }
}
