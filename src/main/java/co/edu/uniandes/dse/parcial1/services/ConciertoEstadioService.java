package co.edu.uniandes.dse.parcial1.services;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ConciertoEstadioService {

ConciertoRepository conciertoRepository;
EstadioRepository estadioRepository;

public ConciertoEntity replaceConcierto(Long conciertoFecha, Long estadioFecha) throws EntityNotFoundException,IllegalOperationException {
		log.info("Inicia proceso de actualizar CONCIERTO c", conciertoFecha);
		Fecha fecha= conciertoRepository.findbyFecha(fecha)
        Fechas fechas = estadioRepository.findbyFecha(fechas)
		if (conciertoEntity.getCapacidad()<estadioEntity.getAforo())
			throw new IllegalOperationException("El aforo del estadio debe ser mayor al del concierto ");

		return bookEntity.get();



        
}@Transactional
public ConciertoEntity validateFecha(Date fecha) throws IllegalOperationException {
		log.info("Inicia proceso de validar la fecha de un concierto  con id = {0}",fecha);
        Hoy hoy = LocalDateTime.now()
		Fecha fecha = conciertoRepository.getDate()
    if (Duration.between(fecha,hoy)<0 ){
        throw new IllegalOperationException( " La fecha del concierto no puede ser antes de la fecha actual")

}
