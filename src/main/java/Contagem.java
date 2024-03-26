
import java.util.Scanner;

public class Contagem {
  Scanner prompt = new Scanner(System.in);
    int n, cont = 0, i = 0;
      public void Contagem(){
        System.out.println("Quantidade a ser contada: ");
        int n = prompt.nextInt();

    while (i < n){
    i = i + 1;
}
System.out.println("A quantidade é de: " + n);
        