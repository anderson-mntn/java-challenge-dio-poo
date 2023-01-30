package dio_desafio_dominio;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp implements Set<Conteudo> {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Conteudo> devsIncritos = new HashSet<>(); // Order do not matters
    private Set<Conteudo> conteudos =  new LinkedHashSet<>(); // Order matters
    
    //Getter and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public Set<Conteudo> getDevsIncritos() {
        return devsIncritos;
    }
    public void setDevsIncritos(Set<Conteudo> devsIncritos) {
        this.devsIncritos = devsIncritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    //Equals and hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        result = prime * result + ((devsIncritos == null) ? 0 : devsIncritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (dataInicial == null) {
            if (other.dataInicial != null)
                return false;
        } else if (!dataInicial.equals(other.dataInicial))
            return false;
        if (dataFinal == null) {
            if (other.dataFinal != null)
                return false;
        } else if (!dataFinal.equals(other.dataFinal))
            return false;
        if (devsIncritos == null) {
            if (other.devsIncritos != null)
                return false;
        } else if (!devsIncritos.equals(other.devsIncritos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Iterator<Conteudo> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean add(Conteudo e) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean addAll(Collection<? extends Conteudo> c) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }
    public String getCargaHoraria() {
        return null;
    }
    
    

}   
