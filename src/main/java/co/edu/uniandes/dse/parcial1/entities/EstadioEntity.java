package co.edu.uniandes.dse.parcial1.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class EstadioEntity extends BaseEntity {

    private String nombre;
    private Long precio;
    private int  capacidad;

    @PodamExclude
	@OneToMany(mappedBy = "estadio")
	private List<ConciertoEntity> conciertos = new ArrayList<>();

}
