package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fkjava.ws.call.CallServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;



public class CallServlet extends BaseServlet {


	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CallServiceImpl callServiceImpl = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		callServiceImpl.sayHello("zhangsan");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	


}
