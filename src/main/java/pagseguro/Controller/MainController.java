package classified.Controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.mail.MessagingException;



@Controller
public class MainController {
	

	// implements ErrorController
	private static final String PATH = "/error";
	
	
	@RequestMapping("/")
	public String index(Model model) {
		
		return "index";
	}
	
    @RequestMapping(value = PATH)
    public String error(Model model) {
    	BreadCrumbs.set(model, "Erro");
        return "404";
    }

		public String getErrorPath() {
        return PATH;
   }

}
