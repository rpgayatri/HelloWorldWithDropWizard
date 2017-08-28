package HelloWorldWithDropWizard;

import HelloWorldWithDropWizard.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldWithDropWizardApplication extends Application<HelloWorldWithDropWizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloWorldWithDropWizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "Hello World!";
    }

    @Override
    public void initialize(final Bootstrap<HelloWorldWithDropWizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloWorldWithDropWizardConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(configuration.getTemplate(), configuration.getDefaultName());
        environment.jersey().register(resource);
    }

}
