public class Metodos {
    
    public static void main(String[] args) {
        
        // Uma classe é formada por atributos e metodos. Os metodos, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes
        // Metodos possuem um critério de nomeação. Não é obrigatorio, mas é recomendado que seja utilizado
        // Deve ser nomeado como verbo. Deve seguir o padrão camelCase. 
        // Todos os metodos devem sempre ser definidos dentro de uma classe. Não existem metodos globais. 

        // Criterio de definição de metodos. Existe a convenção estrutural para todos os metodos, que tem o objetivo de de melhorar a forma para definir os metodos 
        // 1. É necessario se perguntar constantemente qual a finalidade do metodo 
        // 2. É necessario analisar se o metodo será responsavel por retornar algum valor ou não 
        // Caso o metodo não seja representado por nenhum valor (int, double, long, string...), ele será representado pela palavra void

        // Os metodos as vezes precisão de argumentos como criterio de execução. 
        // Exceções são comuns na execução de metodos, as vezes é necessario prever e tratar a possível existência de uma exceção. 
        // Será necessário que o metodo seja visivel a toda aplicação, somentes em mesmos pacotes, atraves de herança ou somente a nível a propria classe. 

        //public double somar (int num1, int num2) {
            //Logica - Finalidade do metodo
            //return;
        //}

        //public void imprimir (String texto) {
            // Logica - Finalidade do metodo 
            // Aqui não precisa de return, pois não sera retornado nenhum resultado 
        //}

        // Throws Expection indica que o metodo pode ter alguma exceção 
        //public double dividir (int dividendo, int divisor) throws Expection {}

        //private void metodoPrivado(){}
        // Este metodo não pode ser visto por outras classes 

        //public void validar () {}
        // Alguns equivocos estruturais. Este metodo deveria retornar alguma informação
        // No caso boolean (true ou false)

        //public void calcularEnviar () {}
        // Um metodo deve representar uma unica responsabilidade 

        // public void gravarCliente (String nome, String cpf...)
        // Este metodo tem a finalidade de gravar informações de um cliente, mas é possivel criar o objeto cliente e passar como parametro 

        // public void gravar (Cliente cliente) {}
        //ou 
        // public void gravarCliente (Cliente cliente) {}

    }
}
