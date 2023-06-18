/**
 * 
 */
package HackerSpace.Web.Signup_Login.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author soumyadeep DEY
 *
 */
@Controller
public class SignUpController {
	
	 @RequestMapping("signup")
     public String SignUp()
     {
		return "SignUp";
	 }
}
