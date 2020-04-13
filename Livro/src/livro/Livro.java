
package livro;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int paginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    public String detalhes() {
        return "Livro{" + "titulo=" + this.getTitulo() + "\n, autor=" + this.getAutor() + ""
                + "\n, paginas=" + this.getPaginas() + "\n, pagAtual=" + this.getPagAtual() + "\n,"
                + " leitor=" + this.getLeitor().getNome() + '}';
        
    }
    
    

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
          }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = true;
    }

    @Override
    public void folhear() {
        
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}
