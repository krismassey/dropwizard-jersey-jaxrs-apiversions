package com.kris.massey.dropwizard;

import com.kris.massey.ApiVersionResourceFilterFactory;
import io.dropwizard.ConfiguredBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ApiVersionBundle<T> implements ConfiguredBundle<T> {

    @Override
    public void run(T configuration, Environment environment) throws Exception {
        environment.jersey().getResourceConfig().getResourceFilterFactories().add(new ApiVersionResourceFilterFactory());
    }

    @Override
    public void initialize(Bootstrap<?> bootstrap) {

    }
}
