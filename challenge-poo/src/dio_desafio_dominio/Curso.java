package dio_desafio_dominio;


public class Curso extends Conteudo{
    private double cargaHoraria;

    public double calcularXp(){
        return XP_DEFAULT + cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCursos: [titulo = " + getTitulo() +
         ", descricao = " + 
         getDescricao() + 
         ", cargaHoraria = " + cargaHoraria + "]";
    }

    
}
