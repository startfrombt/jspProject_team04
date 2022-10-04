package service.brandList;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.CommandProcess;
import dao.BrandListDAO;

public class RegisterLikeService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BrandListDAO bld = BrandListDAO.getInstance();
		
		int product_id = Integer.parseInt(request.getParameter("product_id"));
		String mem_id = request.getParameter("mem_id");
		
		try {
			int result = bld.registerLike(product_id, mem_id);
			
			request.setAttribute("product_id", product_id);
			request.setAttribute("mem_id", mem_id);
			request.setAttribute("result", result);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "brandPdList.jsp";
	}

}
