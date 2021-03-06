package org.lib.application;

import org.lib.view.MainFrame;
import javax.swing.SwingUtilities;
import org.lib.controller.LibraryMenuBar;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(final BundleContext context) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame.init(context, new LibraryMenuBar());
            }
        });
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here
    }
}
