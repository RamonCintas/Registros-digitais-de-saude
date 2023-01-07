import java.time.YearMonth;

public class Perfil_De_Saude
{
    private String nome;
    private String sobrenome;
    private String sexo;
    private int mes;
    private int ano;
    private int dia;
    private double peso;
    private double altura;

    // Métodos set e get do nome do(a) paciente
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    // Métodos set e get do sobrenome do(a) paciente
    public void setSobreNome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobreNome(){
        return sobrenome;
    }

    // Métodos set e get do gênero do(a) paciente
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }

    // Métodos set e get do dia da data do nascimento do(a) paciente
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return dia;
    }

    // Métodos set e get do mês do(a) paciente
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getMes(){
        return mes;
    }

    // Métodos set e get do ano do(a) paciente
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    // Métodos set e get do peso do(a) paciente
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }

    // Métodos set e get da altura do(a) paciente
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    // Cálculo referente a quantidade de anos do(a) paciente
    public int getIdade(){
        int anoAtual = YearMonth.now().getYear();
        int idade = anoAtual - ano;
        return idade;
    }

    // Cálculo referente ao imc do(a) paciente
    public double getImc(){
        double imc = getPeso() / (getAltura() * getAltura());
        return imc;
    }

    // Mensagem referente ao imc
    public String getMsgImc()
    {
        String msgImc = "";
        if (getImc() <= 17.3 || getImc() < 18.5 ){
            msgImc = "Magreza";
            return msgImc;
        }
        else if (getImc() >= 18.5 && getImc() <= 24.9 ){
            msgImc ="Normal";
            return msgImc;
        }
        else if (getImc() >= 25.5 && getImc() <= 29.9 ){
            msgImc = "Sobrepeso";
            return msgImc;
        }
        else if (getImc() >= 30 && getImc() <= 34.9  ){
            msgImc = "Obesidade grau I";
            return msgImc;
        }
        else if (getImc() >= 35.0 && getImc() <= 39.9 ){
            msgImc = "Obesidade grau II";
            return msgImc;
        }
        else if (getImc() > 40.0 ){
            msgImc = "Obesidade grau III";
            return msgImc;
        }
        return msgImc;
    }

    // Cálculo referente a frequência cardíaca máxima 
    public int getFCM()
    {
        int fcm = 220 - getIdade();
        return fcm;
    }

    // Cálculo referente a frequência cardíaca alvo 
    // intervalo 1
    public double getFCA1(){
        double fca1 = 0.60 * getFCM();
        return fca1;
    }
    // intervalo 2
    public double getFCA2(){
        double fca2 = 0.85 * getFCM();
        return fca2;
    }
}