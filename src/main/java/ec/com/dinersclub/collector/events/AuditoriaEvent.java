package ec.com.dinersclub.collector.events;

import org.eclipse.microprofile.reactive.messaging.Acknowledgment;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ec.com.dinersclub.collector.models.Auditoria;
import io.vertx.core.json.JsonObject;

import static io.quarkiverse.loggingjson.providers.KeyValueStructuredArgument.*;

public class AuditoriaEvent {
	
	private static final Logger logger = LoggerFactory.getLogger(AuditoriaEvent.class);
	
    @Incoming("audit")
    @Acknowledgment(Acknowledgment.Strategy.PRE_PROCESSING)
    public void process(JsonObject auditoria) {
    	Auditoria aud = new Auditoria(auditoria);
    	logger.info("informacion de auditoria", kv("auditoria", aud));
    }
    
}
