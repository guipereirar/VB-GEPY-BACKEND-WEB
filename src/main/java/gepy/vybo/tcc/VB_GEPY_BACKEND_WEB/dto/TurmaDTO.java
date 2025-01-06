package gepy.vybo.tcc.VB_GEPY_BACKEND_WEB.dto;

import gepy.vybo.tcc.VB_GEPY_BACKEND_WEB.entity.TurmaEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class TurmaDTO {

    private Long id;
    private String nome;

    public TurmaDTO(TurmaEntity turma) {
        BeanUtils.copyProperties(turma, this);
    }

}