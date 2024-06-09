public class Operadores {

    public static void main(String[] args) {

        // Atribuição. Representado pelo símbolo "=". Utilizado para definir o valor inicial ou sobrescrever o valor de uma variavel 
        String nome = "Alexandre";
        int idade = 18; 
        double peso = 70.5; 
        char sexo = 'M'; 
        boolean doadorOrgao = false; 
        Date dataNascimento = new Date();
        
        // Aritméticos. Utilizado para realizar operações matemáticas. Adição (+), Subtração (-), Multiplicação (*), Divisão (/), Modulo (%)
        double soma = 10.5 + 15.7; 
        int subtração = 113 - 25; 
        int multiplicação = 20 * 7; 
        int divisao = 15/3; 
        int modulo = 18 % 3; 
        double resultado = (10 * 7) + (20/4);

        // O operador de Adição (+) quando utilizado em textos, realiza a concatenação de textos, ou seja, pode juntar palavras que precisam ser acopladas em um único resultado
        String nomeCompleto = "Alexandre" + "Ribeiro"; 

        // Unários. São aplicados com outro operador aritmético. 
        // Operador de valor positivo (+), Operador de valor negativo (-), Operador de incremento de valor (++), Operador de decremento de valor (--), Operador lógico de negação (!)
        int numero = 5; // Já é positivo mesmo sem o sinal 

        numero = - numero;
        numero = numero * -1; // Para tornar o numero positivo nomamente, é necessário realizar uma multiplicação 

        int valor = 5;
        // Repetição
        valor++; // Vai adicionar +1 

        System.out.println( ++ valor ); // Se o incremento estiver antes da variavel, primeiro será feito a operação e depois terá o resultado

        System.out.println( valor ++ ); 
        System.out.println( valor ); // Se o incremente estiver depois da variavel, primeiro terá o valor inicial e depois será feito o incremento, nesse caso, é necessário colocar a saída duas vezes para ver o antes e depois

        // Se quiser utilizar o decremento, seguirá a mesma lógica do incremento 

        // Valores booleanos possuem duas alternativas, sendo "true" ou "false" e é possivel negar elas. 
        boolean variavel = true; 
        variavel = !variavel;
        System.out.println( variavel );

        //Ternário. É uma forma resumida para definir condição e escolha por um dentre dois valores. É como uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha
        // Representado pelos símbolos "?" e ":". Caso a condição seja true, terá "?" e caso seja false, terá ":"
        int a, b; 
        a = 5;
        b = 6;

        String fim = a == b ?"Verdadeiro" : "falso";
        System.out.println(fim);

        // Relacionais. Avaliam a relação entre duas variáveis ou operações. 
        // Define se o operador a esquedar é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um valor booleano como resultado
        // Igual (==), Diferente (!=), Maior que (>), Maior ou Igual (>+), Menor (<), Menor ou Igual (<=), 

        String nomeUm = "Alexandre";
        String nomeDois = new String ("Alexandre"); 

        System.out.println( nomeUm.equals(nomeDois) );
        // Quando for utilizar objetos, é recomendado que use o "equals"

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        if ( numero1 < numero2 ) {
            System.out.println("A nossa condição é verdadeira");
        }
        System.out.println("numeroUm é igual a numeroDois? " + simNao );

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao );

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior a numeroDois? " + simNao );

        // Lógicos. Representam o recurso que nos permite criar expressões lógicas maiores a partir de duas ou mais expressões. 
        // Operador logico "E" (&&), Operador logico "OU" (||)
        // Existem duas condições. Pode ser uma expressão booleana ou uma expressão relacional 
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && ( 7 > 4 )) {
            System.out.println("As duas condições são verdadeiras"); 
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das duas condições são verdadeiras"); 
        }

        System.out.println("fim");

    }
}
