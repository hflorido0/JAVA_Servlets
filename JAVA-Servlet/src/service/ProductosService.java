package service;

import java.util.ArrayList;

import dao.ProductosDao;
import model.Producto;

public class ProductosService {
	private ProductosDao dao;
	private static ProductosService productoService;
	
	private ProductosService() {
		this.dao = ProductosDao.getInstance();
	}
	
	public static ProductosService getInstance() {
		if (productoService == null) 
			productoService = new ProductosService();
		return productoService;
	}
	
	public ArrayList<Producto> getProductos() {
		return dao.getProductos();
	}
	
	public ArrayList<Producto> getProductosFiltered(String filter) {
		ArrayList<Producto> productos = dao.getProductos();
		ArrayList<Producto> productosReturn = new ArrayList<>();
		for (Producto p : productos) {
			if (p.getColor().contains(filter))  productosReturn.add(p);
		}
		return productosReturn;
	}
}
