
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participante")
public class Pessoa implements Serializable{
    @Id
    public long id;
    @Column
    public int idade;
    @Column
    public boolean sexo;

    public int getIdade() {
        return idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
    
}
