
import java.util.Objects;


public class PessoasContato implements Comparable<PessoasContato> {
    
    private String nome;
    private String tel;

    public PessoasContato(String nome, String tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public PessoasContato() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoasContato other = (PessoasContato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(PessoasContato o) {

        return this.nome.compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "\nnome: " + nome
                + "\ntel: " + tel;
    } 

    
    
    
}
