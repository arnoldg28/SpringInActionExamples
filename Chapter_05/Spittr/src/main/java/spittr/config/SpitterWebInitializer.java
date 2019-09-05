package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spittr.web.WebConfig;

/**
 * Under the covers, AbstractAnnotationConfigDispatcherServletInitializer
 * creates both a DispatcherServlet and a ContextLoaderListener
 */
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  /**
   * @Configuration class’s returned getRootConfigClasses() will be used to configure the application context created by
   * ContextLoaderListener
   * @return
   */
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { RootConfig.class };
  }

  /**
   * @Configuration classes returned from getServletConfigClasses() will define beans for
   * DispatcherServlet’s application context.
   * @return
   */
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}