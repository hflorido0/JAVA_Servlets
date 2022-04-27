package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Producto;
import service.ProductosService;
@WebServlet(name="productos",urlPatterns={"/productos.do"})
public class Productos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Productos() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("productos", ProductosService.getInstance().getProductos());
		getServletContext().getRequestDispatcher("/jsp/productos.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filtro = request.getParameter("filter");
		ArrayList<Producto> productos = ProductosService.getInstance().getProductosFiltered(filtro);
		request.setAttribute("productos", productos);
		getServletContext().getRequestDispatcher("/jsp/productos.jsp").forward(request, response);
	}

}
