
package caronapp.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Avaliacao implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idUsuarioAvaliador;
    private Long avaliacao;
    private Long idUsuarioAvaliado;
    private Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuarioAvaliador() {
        return idUsuarioAvaliador;
    }

    public void setIdUsuarioAvaliador(Long idUsuarioAvaliador) {
        this.idUsuarioAvaliador = idUsuarioAvaliador;
    }

    public Long getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Long avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Long getIdUsuarioAvaliado() {
        return idUsuarioAvaliado;
    }

    public void setIdUsuarioAvaliado(Long idUsuarioAvaliado) {
        this.idUsuarioAvaliado = idUsuarioAvaliado;
    }
    
}
