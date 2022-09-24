package service.member;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import control.CommandProcess;
import dao.MemberDAO;
import dto.MemberDTO;

public class LoginService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 데이터 받기
		String mem_id = request.getParameter("mem_id");
		String mem_pwd = request.getParameter("mem_pwd");
		String rememberId = request.getParameter("rememberId");
		System.out.println(mem_id+","+mem_pwd+","+rememberId);
		
		// DB 
		MemberDAO memberDAO = MemberDAO.getInstance();
		MemberDTO memberDTO = memberDAO.selectMember(mem_id);
		System.out.println(memberDTO);
		
		// ID / PWD 확인
		if(checkPwd(memberDTO, mem_pwd)) {
			HttpSession session = request.getSession();
			session.setAttribute("mem_id", mem_id);
			
			// 아이디 저장
			if("on".equals(rememberId)) {
				Cookie cookie = new Cookie("id", mem_id);
				response.addCookie(cookie);
			} else {
				Cookie cookie = new Cookie("id", mem_id);
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
			
			return "/";
		// ID / PWD 가 일치하지 않을 경우
		}else {
			String msg = URLEncoder.encode("아이디 또는 비밀번호가 일치하지 않습니다.", "utf-8");
			
			request.setAttribute("msg", msg);
		}
		
		
		return "/member/memLoginForm.jsp";
	}
	
	public boolean checkPwd(MemberDTO memberDTO, String mem_pwd) {
		return memberDTO != null && memberDTO.getMem_pwd().equals(mem_pwd);
	}

}
