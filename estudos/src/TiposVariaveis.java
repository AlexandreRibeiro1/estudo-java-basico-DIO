public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    // Usa-se o "." para mostrar números reais
    // double salarioMinimo = 2500.33;

    // Peculiaridades ao se trabalhar com alguns tipos específicos: 
    byte idade = 123;
    short ano = 2020; 
    int cep = 21070333; // Se começar com 0, pode ser que tenha necessidade de usar outro tipo 
    long cpf = 98765432109L; // Se começar com 0, pode ser que tenha necessidade de usar outro tipo. Deve terminar com "L" para representar que não vai ser um inteiro e sim um longo
    float pi = 3.14F; // É necessario colocar o "F" no final, caso contrario pode acontecer um erro por achar que deveria ser a variavel "double"
    double salario = 1275.33;

    // Java é fortemente tipado, logo é necessário ter cuidado com os valores 

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal; 
    // Nesse foi era necessário mudar o numeroCurto2 para "int", ou então ultilizar o recurso chamado "cast".
    // "Cast" é nada mais do que pegar um tipo mais abrangente e converte para um mais expecifico pois é o tipo correspondente.

    // É possivel mudar o valor de uma variavel durante o codigo
    int numero = 1; 
    numero = 2; 

    // Se for necessário que o valor nunca mude, deve ser usado uma constante
    // A constante é feita a partir da palavra reservada "final", seguida do tipo e deve ser feita em CAIXA ALTA 
    final double VALOR_DE_PI = 3.14; 

    // String representa o texto na aplicação 
    String meuNome = "Alexandre Ribeiro"; 
    }
}
