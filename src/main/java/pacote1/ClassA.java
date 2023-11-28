package pacote1;
import pacote2.ClassB;

public class ClassA {

    private int minhaVariavel;

    public static void main(String[] args) {
        System.out.println("Chamando ClasseB.metodoDaClasseB() de ClasseA:");
        ClassB.metodoDaClassB();


        int minhaVariavelLocal = 10;
        System.out.println("Valor da variável local: " + minhaVariavelLocal);
    }
}




