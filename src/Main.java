//1 - ) Crie uma classe carro com atributos como modelo, ano e cor. Implemente métodos
//      para mudar a cor e obter o modelo do carro.

import br.com.cubosacademy.exerciciosPOO.classeCarro.Carro;
public class Main {
    public static void main(String[] args) {
        Carro onix = new Carro(2024, "preto","Onix");
        onix.setCor("Prata");
        System.out.println(onix.getModelo());
        System.out.println(onix.getCor());
    }
}