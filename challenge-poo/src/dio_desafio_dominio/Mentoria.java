package dio_desafio_dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
   
    LocalDate data; // localDateTime
 

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() +
         ", descricao="+ getDescricao() + 
         ", data="+ data + "]";
    }
    @Override
    public double calcularXp() {
        return XP_DEFAULT + 25d;
    }

    
}
