package de.esserjan.edu.frege.maven;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.project.configurator.AbstractProjectConfigurator;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;

/**
 * Empty implementation to make lifecycle-mapping-metadata.xml contribution
 * effective.
 * 
 * @author Jan Esser <a href="https://twitter.com/januszesser>@januszesser</a>
 */
public class FregeProjectConfigurator extends AbstractProjectConfigurator {

	@Override
	public void configure(ProjectConfigurationRequest configurationRequest, IProgressMonitor progressMonitor)
			throws CoreException {
		// NOOP
	}

}
