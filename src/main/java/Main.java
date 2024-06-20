import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("SOMENTE NÚMEROS!");
    System.out.println(" ");
    System.out.println("Digite sua altura. Ex: (1.75)");
    double altura = sc.nextDouble();
    System.out.println(" ");
    System.out.println("Digite seu peso. Ex: (55)");
    double peso = sc.nextDouble();
    double imc = peso / (altura*altura);
    System.out.println("");
    System.out.printf("O seu IMC é de %.1f Kg/m² %n", imc);
    System.out.println("");
    if(imc<16.9){
      System.out.println("Você está muito abaixo do peso.");
    }
    if(imc>16.9 & imc<18.5){
      System.out.println("Você está abaixo do peso.");
    }
    if(imc>18.5 & imc<25){
      System.out.println("Você está com peso normal.");
    }   
    if(imc>25 & imc<30){
      System.out.println("Você está acima do peso.");
    }
    if(imc>30 & imc<35) {
      System.out.println("Você está com Obesidade Grau I.");
    }
    if(imc>35 & imc<40){
      System.out.println("Você está com Obesidade Grau II.");
    }
    if(imc>40){
      System.out.println("Você está com Obesidade Grau III.");
    }
    sc.close();
  }
}