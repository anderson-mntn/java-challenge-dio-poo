package dio_desafio_dominio;

public abstract class Conteudo {
    protected static final double XP_DEFAULT = 10d; //const

    private String titulo;
    private String descricao;
    public abstract double calcularXp(); //abstract nao permite instanciar a class Conteudo. Mas permite usar na classes filhas (Herança).
    
    public static double getXpDefault() {
        return XP_DEFAULT;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
