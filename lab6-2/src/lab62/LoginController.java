package lab62;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	private String successView;
	private String failView;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String passwd = request.getParameter("passwd");
		if ("user".equals(user) && "123".equals(passwd)) {
			return new ModelAndView(getSuccessView(), "user", user);
		} else {
			return new ModelAndView(getFailView());
		}
	}

	public String getSuccessView() {
		return successView;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

	public String getFailView() {
		return failView;
	}

	public void setFailView(String failView) {
		this.failView = failView;
	}
}
