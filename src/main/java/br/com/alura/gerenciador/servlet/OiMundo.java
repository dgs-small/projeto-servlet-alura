package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Anotação para definir o recurso que será passado na uri para fazer requisição ao servlet
@WebServlet(urlPatterns = "/hello")
public class OiMundo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<link rel=\"stylesheet\" href=\"css/style.css\">");
		out.println("<title>Devolvido por um Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Meu primeiro Servlet</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
