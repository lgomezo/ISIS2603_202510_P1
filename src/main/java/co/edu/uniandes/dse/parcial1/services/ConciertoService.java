package co.edu.uniandes.dse.parcial1.services;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

public class ConciertoService{

	@Autowired
	ConciertoRepository conciertoRepository;

	public ConciertoEntity createBook(ConciertoEntity conciertoEntity) throws EntityNotFoundException, IllegalOperationException {
		log.info("Inicia proceso de creación del concierto");
		
		if (conciertoEntity.getEstadio() == null)
			throw new IllegalOperationException("Estadio is not valid");
		
	
		if (!validateNombre(conciertoEntity.getNombre()))
			throw new IllegalOperationException("nombre is not valid");

		if (!conciertoRepository.findByNombre(conciertoEntity.getNombre()).isEmpty())
			throw new IllegalOperationException("El concierto ya está registrado ");
        if (!validateAforo(conciertoEntity.getAforo()<10 ))
            throw new IllegalOperationException( "El concierto debe tener más de 10 personas")
        if (!validatePresupuesto(conciertoEntity.getPresupuesto()<1000 ))
            throw new IllegalOperationException( "El concierto debe tenerun presupuesto mayor a  1000 ")

		
        ConciertoEntity.setEstadio(estadioEntity.get());
		log.info("Termina proceso de creación del concieto");
		return conciertoRepository.save(conciertoEntity);
	}




@Transactional
public ConciertoEntity validateFecha(Date fecha) throws IllegalOperationException {
		log.info("Inicia proceso de validar la fecha de un concierto  con id = {0}",fecha);
        Hoy hoy = LocalDateTime.now()
		Fecha fecha = conciertoRepository.getDate()
    if (Duration.between(fecha,hoy)<0 ){
        throw new IllegalOperationException( " La fecha del concierto no puede ser antes de la fecha actual")



    }
    

}

}
