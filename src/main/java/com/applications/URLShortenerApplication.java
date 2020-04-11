package com.applications;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class URLShortenerApplication extends Application<URLShortenerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new URLShortenerApplication().run(args);
    }

    @Override
    public String getName() {
        return "URLShortener";
    }

    @Override
    public void initialize(final Bootstrap<URLShortenerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final URLShortenerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}