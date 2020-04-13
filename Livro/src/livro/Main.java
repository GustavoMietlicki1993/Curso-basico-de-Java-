
package livro;

public class Main {

    public static void main(String[] args) {
     Pessoa a[] = new Pessoa[2];
     Livro b[] = new Livro[3];
     
     a[0] = new Pessoa("Gustavo", 26, "Homem");
     b[0] = new Livro("Java", "Acir", 300);
     
     b[0].setLeitor(a[0]);
        System.out.println(b[0].detalhes());
    }
    
}
