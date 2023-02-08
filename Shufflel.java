public class Shufflel {
    public static void main(String[] args) {
        int x =3; //x equivale a 3
        while (x > 0) { //enquanto x for maior que zero vai entrar nas condicionais
            if (x > 2) {
                System.out.print("a"); //x é maior que 2, então vai printar a
            }

            x = x - 1; //condicional dentro do while e fora do if, sempre vai subtrair até zerar
            System.out.print("-"); //condicional dentro do while e fora do if, sempre vai printar até zerar

            if (x == 2) { //apos o primeiro if a condicional é verdadeira
                System.out.print("b c");
            }
            if (x == 1) { //apos o segundo if a condicional é verdadeira
                System.out.print("d");
                x = x -1; //como está dentro do if nao vai mais imprimir o "-" depois do d pois a condicional era ser maior que zero
            }
        }
    }
}
