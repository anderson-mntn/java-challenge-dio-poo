package dio_desafio_dominio;


public class Curso extends Conteudo{
    private int cargaHoraria;

    public double calcularXp(){
        return XP_DEFAULT * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() +
         ", descricao=" + 
         getDescricao() + 
         ", cargaHoraria=" + cargaHoraria + "]";
    }

    
}
