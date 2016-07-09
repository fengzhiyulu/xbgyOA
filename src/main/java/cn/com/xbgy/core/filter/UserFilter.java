package cn.com.xbgy.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.xbgy.pm.bean.User;

public class UserFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain filter) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)resp;
		String url=request.getRequestURI();
		if(url.contains("user")){
			filter.doFilter(request, response);
		}else if(url.contains(".css")||url.contains(".js")){
			filter.doFilter(request, response);
		}else{
			if(request.getSession().getAttribute("userInfo")==null){
				response.sendRedirect(request.getContextPath() + "/user/loginPage");
			}else{
				filter.doFilter(request, response);
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
