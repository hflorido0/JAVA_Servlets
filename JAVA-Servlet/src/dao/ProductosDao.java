package dao;

import java.util.ArrayList;
import java.util.Random;

import model.Producto;

public class ProductosDao {
	
	public ProductosDao() {
		Class.forName("com.mysql.cj.jdbc.Driver")
		url =  Constants.DB_URL_CONNECTION;
		user = Constants.DB_USER_CONNECTION;
		pass = Constants.DB_PASS_CONNECTION;
		Connection conexion = DriverManager.getConnection(url, user, pass);
		
		conexion.setAutoCommit(false);
	}

	public ArrayList<Producto> getProductos() {
		//Here we implement our code to get data from Database
		//instead of hardcoding the values
		ArrayList<Producto> products = new ArrayList<>();
		
		for (int i = 0; i < 10; i ++) {
			products.add(generateRandomProducto(i));
		}
		
		return products;
		
	}
	
	private Producto generateRandomProducto(int id) {
		Random random = new Random();
		String[] colors = {"blue", "red", "pink"};
		Producto p = new Producto(id, "producto-" + id, colors[random.nextInt(3)], random.nextInt(100));
		return p;
	}
}
