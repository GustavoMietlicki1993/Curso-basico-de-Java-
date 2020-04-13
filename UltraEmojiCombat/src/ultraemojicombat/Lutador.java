
package ultraemojicombat;

public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    //Metodos Publicos
    public void apresentar(){
        System.out.println("--------------------------------------");
        System.out.println("CHEEGOU A HORA, apresentamos o Lutador: "+ this.getNome());
        System.out.println("Diretamente de: "+ this.getNacionalidade());
        System.out.println("Com "+this.getIdade()+" anos e "+ this.getAltura()+" de altura.");
        System.out.println("pesando "+this.getPeso()+" kg. ");
        System.out.println(this.getVitorias()+" Vitorias. ");
        System.out.println(this.getDerrotas()+" Derrotas. ");
        System.out.println(this.getEmpates()+" Empates. ");
    }
    public void status(){
        System.out.println("Com "+this.getIdade()+" anos e "+ this.getAltura()+" de altura.");
        System.out.println("pesando "+this.getPeso()+" kg. ");
        System.out.println(this.getVitorias()+" Vitorias. ");
        System.out.println(this.getDerrotas()+" Derrotas. ");
        System.out.println(this.getEmpates()+" Empates. ");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    //Metodos Especiais

    public Lutador(String no, String nacio,int ida, int vit, int der, int emp, float alt, float pes) {
        this.nome = no;
        this.nacionalidade = nacio;
        this.idade = ida;
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
        this.altura = alt;
        this.setPeso(pes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "medio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }   
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
    
}
