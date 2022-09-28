package service.mypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.CommandProcess;

public class UpdatePwdFormService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("active", "updatePwd");
		request.setAttribute("display", "myPageCngInfoUp.jsp");
		
		return "/mypage/myPage.jsp";
	}
	
}
