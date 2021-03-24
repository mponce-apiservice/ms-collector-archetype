package ec.com.dinersclub.collector.repository;

import ec.com.dinersclub.collector.models.AuditoriaMessage;

public interface IAuditoriaRepository {
	
	void saveAudit(AuditoriaMessage audit);

}
