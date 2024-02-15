public class TrocaDeVariaveis {
   int a = 15, b = 56, aux;
  public void TrocaDeValores() {
    System.out.println("Valor de a: "+a);
    System.out.println("Valor de b: "+b);
    System.out.println("Valor de aux: "+aux);
      aux = a;
      a = b;
      b = aux;
        System.out.println("Valor de a: "+a);
        System.out.println("Valor de b: "+b);
        System.out.println("Valor de aux: "+aux);
  }
}