import java.util.Random;

public class DiceRoll {
  //problema 34
  //Se aruncă trei zaruri până când cel puţin două dintre ele cad cu 6 puncte. ξ - numărul
  //aruncărilor efectuate. A = {ξ∈[23,31]}.
  public static void main(String[] args) {
    int dice1,dice2,dice3;

    Random random = new Random();

    dice1 = random.nextInt(6)+1;
    dice2 = random.nextInt(6)+1;
    dice3 = random.nextInt(6)+1;

    System.out.println("Result");
    System.out.println(dice1);
    System.out.println(dice2);
    System.out.println(dice3);


  }
}
