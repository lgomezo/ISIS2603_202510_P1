package co.edu.uniandes.dse.parcial1.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ConciertoEntity extends BaseEntity {

    private String nombre;
    private Long presupuesto;
    private int   aforo;

    @Temporal(TemporalType.DATE)
    private Date   fecha;

    @PodamExclude
	@ManyToOne
	private EstadioEntity estadio;

}
