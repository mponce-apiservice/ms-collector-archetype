package ec.com.dinersclub.collector.repository;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;

import ec.com.dinersclub.collector.models.AuditoriaMessage;
import ec.com.dinersclub.collector.repository.entities.AuditoriaEntity;

@ApplicationScoped
public class AuditoriaRepository implements IAuditoriaRepository{
	
	private Set<AuditoriaEntity> auditoria = Collections.synchronizedSet(new HashSet<>());
	
	public void saveAudit(AuditoriaMessage audit) {
		auditoria.add(new AuditoriaEntity(audit));
	}

}
