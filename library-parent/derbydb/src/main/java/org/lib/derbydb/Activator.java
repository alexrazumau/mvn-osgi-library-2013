package org.lib.derbydb;

import org.lib.derbydb.impl.DerbyDAOFactory;
import org.lib.integration.AbstractDAOFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        context.registerService(AbstractDAOFactory.class,
                new DerbyDAOFactory(), null);
    }

    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here
    }
}
