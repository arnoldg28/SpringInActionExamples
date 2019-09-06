package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller is a stereotype annotation, based on the @Component annotation. Its purpose here is entirely for the benefit of component-scanning.
 * You could have annotated HomeController with @Component, and it would have had the same effect, but it would have been less expressive about
 * what type of component HomeController is.
 *
 */
@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {

  @RequestMapping(method = GET)
  public String home(Model model) {
    return "home";
  }

}
