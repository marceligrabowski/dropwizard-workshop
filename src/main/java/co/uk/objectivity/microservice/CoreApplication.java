package co.uk.objectivity.microservice;

import co.uk.objectivity.microservice.config.CoreApplicationModule;
import co.uk.objectivity.microservice.config.CoreConfiguration;
import com.google.inject.Module;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import lombok.extern.slf4j.Slf4j;
import ru.vyarus.dropwizard.guice.GuiceBundle;

@Slf4j
public class CoreApplication extends Application<CoreConfiguration> {
    private static final Module[] MODULES = {new CoreApplicationModule()};

    public static void main(String[] args) throws Exception {
        new CoreApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<CoreConfiguration> bootstrap) {
        GuiceBundle<Configuration> guiceBundle = GuiceBundle.builder()
                .modules(MODULES)
                .enableAutoConfig(getClass().getPackage().getName())
                .build();

        bootstrap.addBundle(guiceBundle);
    }

    @Override
    public void run(CoreConfiguration configuration, Environment environment) throws Exception {
        log.info("Application is running. abcdefgh");
    }
}
