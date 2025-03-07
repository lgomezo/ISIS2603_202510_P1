package co.edu.uniandes.dse.parcial1.services;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EstadioService {

@Autowired
	EstadioRepository estadioRepository;
    public EstadioEntity createEstadio( public EstadioEntity createEstadio(EstadioEntity estadioEntity) )throws EntityNotFoundException, IllegalOperationException {
        
		log.info("Inicia proceso de creación del estadio");


    if (!validateCapacidad(estadioEntity.getCapacidad()<10000 ))
            throw new IllegalOperationException( "El estadio debe tener aforo para  más de 1000 personas")
    if (!validatePrecio(estadioEntity.getPrecio()<100000 ))
            throw new IllegalOperationException( "El estadio debe tenerun precio mayor a  10000 ")
    if (!validateNombre( estadioEntity.getNombre().index()<3))
            throw new IllegalOperationException( "El nombre del estadio debe tener más de 3 caracteres ")

		
}
}