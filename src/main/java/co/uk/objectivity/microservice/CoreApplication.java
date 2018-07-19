package co.uk.objectivity.microservice;

import co.uk.objectivity.microservice.config.CoreConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class CoreApplication extends Application<CoreConfiguration> {
    public static void main(String[] args) throws Exception {
        new CoreApplication().run(args);
    }

    @Override
    public void run(CoreConfiguration configuration, Environment environment) throws Exception {

    }
}
