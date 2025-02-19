package ec.com.dinersclub.collector.events;

import org.eclipse.microprofile.reactive.messaging.Acknowledgment;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ec.com.dinersclub.collector.models.AuditoriaMessage;
import ec.com.dinersclub.collector.repository.IAuditoriaRepository;
import io.vertx.core.json.JsonObject;

import static io.quarkiverse.loggingjson.providers.KeyValueStructuredArgument.*;

import javax.inject.Inject;

public class AuditoriaEvent {
	
	private static final Logger logger = LoggerFactory.getLogger(AuditoriaEvent.class);
	
	@Inject
	IAuditoriaRepository repository;
	
    @Incoming("audit")
    @Acknowledgment(Acknowledgment.Strategy.PRE_PROCESSING)
    public void process(JsonObject auditoria) {
    	repository.saveAudit(new AuditoriaMessage(auditoria));
    	logger.info("informacion de auditoria", kv("auditoria", auditoria));
    }
    
}
