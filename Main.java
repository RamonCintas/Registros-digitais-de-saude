import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Perfil_De_Saude p1 = new Perfil_De_Saude();

        // Mensagem para identificação do programa
        System.out.println("|------------------------------");
        System.out.println("|Bem-Vindo(a) ao Programa de Registros Digitais De Saúde");
        System.out.println("|------------------------------\n");
        System.out.println("|----- Programador: -----");
        System.out.println("|> Ramon Cintas Gomes");
        System.out.println("|------------------------------\n");

        // Scanner para a entrada de dados
        Scanner S = new Scanner(System.in);

        // Variáveis criadas para armazenar os valores que entraram no programa
        String nome = "";
        String sobrenome = "";
        String sexo = "";
        int dia = 0;
        int mes = 0;
        int ano = 0;
        double altura = 0.0;
        double peso = 0.0;


        // Apartir daqui os dados serão inseridos pelo usuário
        System.out.println("|----- Digite o primeiro nome do(a) Paciente: ---");
        nome = S.nextLine();
        p1.setNome(nome);
        System.out.println("|----- Digite o sobrenome do(a) Paciente: ---");
        sobrenome = S.nextLine();
        p1.setSobreNome(sobrenome);
        
        // Loop com verificação de entrada de dados para o dia do nascimento
        System.out.println("|----- Digite o gênero do(a) Paciente ---\n Exemplos de dados:\n Digite (m ou M) para masculino ou (f ou F) para feminino:");
        while(true)
        {
            try 
            {
                sexo = S.next();
                if(sexo.equals ("m") || sexo.equals ("M") || sexo.equals ("f") || sexo.equals ("F")) {
                    p1.setSexo(sexo);
                    break;
                }
                else{
                    System.out.println("|----- Digite novamente um gênero valido. Digite (m ou M) para masculino ou (f ou F) para feminino:");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println(" AVISO: O gênero é inválido tente novamente:");
            }
        }

        // Loop com verificação de entrada de dados para o dia do nascimento
        System.out.println("|----- Digite o dia do nascimento do(a) Paciente: ---\n Exemplos de dados:\n Digite (1) para o dia 1 até (31) para o dia 31:");
        while (true)
        {
            try
            {
                dia = S.nextInt();
                if (dia <= 31 && dia >= 1 && dia != 0){
                    p1.setDia(dia);
                    break;
                }else {
                    System.out.println(" AVISO: Digite novamente um dia valido. Digite (1) para o dia 1 até (31) para o dia 31:");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println(" AVISO: O dia é inválido tente novamente:");
            }
        }
            
        // Loop com verificação de entrada de dados para o mês do nascimento
        System.out.println("|----- Digite o mês de nascimento do(a) Paciente: ---\n Exemplos de dados:\n Digite (1) para o mês 1 de janeiro até (12) para o mês 12 de dezembro:");
        while (true)
        {
            try
            {
                mes = S.nextInt();
                if (mes >= 1 && mes <= 12){
                    p1.setMes(mes);
                    break;
                }
                else {
                    System.out.println(" AVISO: Digite novamente um mês valido. Digite (1) para o mês 1 de janeiro até (12) para o mês 12 de dezembro:");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println(" AVISO: O mês é inválido tente novamente:");
            }
        }
        
        // Loop com verificação de entrada de dados para o ano do nascimento
        System.out.println("|----- Digite o ano de nascimento do(a) Paciente: ---\n Exemplos de dados: \n Digite (1922) para o ano de 1922 até (2022) para o ano de 2022:");
        while (true)
        {
            try
            {
                ano = S.nextInt();
                if (ano >= 1920 &&  ano <= 2022 && ano != 0){
                    p1.setAno(ano);
                    break;
                }
                else {
                    System.out.println("AVISO: Digite novamente um ano valido. Digite (1922) para o ano de 1922 até (2022) para o ano de 2022:");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println(" AVISO: O ano é inválido tente novamente:");
            }
        }
        
        // Loop com verificação de entrada de dados para a altura do(a) paciente
        System.out.println("|----- Digite a altura do(a) Paciente: ---\n Exemplos de dados: \n Digite (1) para 1 metro (3.0) para 3 metros (...):");
        while (true)
        {
            try
            {
                altura = S.nextDouble();
                if (altura >= 1.00 &&  altura != 0.00){
                    p1.setAltura(altura);
                    break;
                }
                else {
                    System.out.println("AVISO: Digite novamente uma altura valida. Digite (0.30) para 30 centímentros até (3.0) para 3 metros:");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println(" AVISO: A altura é inválida tente novamente:");
            }
        }

        // Loop com verificação de entrada de dados para o peso do(a) paciente
        System.out.println("|----- Digite o peso do(a) Paciente: ---\n Exemplos de dados: \n Digite (1) para 1 quilograma até (500) para 500 quilogramas:");
        while (true)
        {
            try
            {
                peso = S.nextDouble();
                if (peso >= 1 &&  peso <= 500 && peso != 0){
                    p1.setPeso(peso);
                    break;
                }
                else {
                    System.out.println("AVISO: Digite novamente um peso valido. Digite (1) para 1 quilograma até (500) para 500 quilogramas:");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println(" AVISO: O peso é inválido tente novamente:");
            }
        }
        
        // Relatórios do(a) paciente
        System.out.println("\n|----- Dados do(a) Paciente: ---");
        System.out.println("|) Nome: " + p1.getNome());
        System.out.println("|) Sobrenome: " +p1.getSobreNome());
        System.out.println("|) Gênero: " +p1.getSexo());
        System.out.println("|) Data de nascimento: " +p1.getDia()+"/"+p1.getMes()+"/"+p1.getAno());
        System.out.println("|) Altura em metros: " +p1.getAltura());
        System.out.println("|) Peso Kg: " +p1.getPeso()+" Quilogramas");
        System.out.println("|) Idade: " +p1.getIdade()+" Anos\n");
        System.out.println("|) (IMC) índice de massa corporal do(a) paciente:");
        System.out.printf("|> Resultado do IMC: %.2f %n",(p1.getImc())); 
        System.out.println("|> Observação: "+ p1.getMsgImc()+"\n");
        System.out.println("|) (FCM) Frequência cardíaca máxima do(a) paciente:");
        System.out.println("|> Resultado do FCM: "+ p1.getFCM()+" (BPM) Batimentos por minuto\n");
        System.out.println("|) (FCA) Frequência cardíaca alvo do(a) paciente:");
        System.out.printf("|> Resultado do 1° Intervalo de (BPM) Batimentos por minuto: %.2f %n",(p1.getFCA1()));
        System.out.printf("|> Resultado do 2° Intervalo de (BPM) Batimentos por minuto: %.2f %n",(p1.getFCA2()));
        System.out.println("|------------------------------");
    }
}