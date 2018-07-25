package co.uk.objectivity.microservice.config;

import co.uk.objectivity.microservice.services.BallService;
import co.uk.objectivity.microservice.services.impl.FootballServiceImpl;
import co.uk.objectivity.microservice.services.impl.VolleyballServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import javax.inject.Named;

public class CoreApplicationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(BallService.class)
                .annotatedWith(Names.named("Football")).to(FootballServiceImpl.class);

        bind(BallService.class)
                .annotatedWith(Names.named("Volleyball")).to(VolleyballServiceImpl.class);
    }
}
