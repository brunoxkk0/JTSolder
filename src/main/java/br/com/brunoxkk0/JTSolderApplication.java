package br.com.brunoxkk0;

import br.com.brunoxkk0.data.model.internal.Api;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.event.annotation.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton
public class JTSolderApplication{

    private static final Logger logger = LoggerFactory.getLogger(JTSolderApplication.class);

    private static final Api api = new Api("JTSolder", "1.0", "DEV");

    public static void main(String[] args) {
        Micronaut.run(JTSolderApplication.class, args);
    }

    @EventListener
    void init(StartupEvent event){
        logger.info("Started...");
        logger.info("Current API: " + api);
    }

    public static Api getApi() {
        return api;
    }

    public static Logger getLogger() {
        return logger;
    }
}
