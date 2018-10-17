package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.product.model.Product;

public class ProductDaoImpl implements ProductDao {

	private Connection con = null;

	List<Product> prods = null;
	
	Statement stmt=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	@Override
	public boolean saveProduct(Product product) {

		con = DBUtils.getConnection();
		int x=0;
		try {
			String qry = "insert into product values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setString(1, product.getId());
			ps.setString(2, product.getName());
			ps.setDouble(3, product.getPrice());
			ps.setString(4, product.getDescription());

			x=ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		boolean status=false;
		if(x!=0)
			status=true;

		return status;
	}

	@Override
	public List<Product> listAll() {
		try {
			prods = new ArrayList<>();
			con = DBUtils.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");

			while (rs.next()) {
				Product prod = new Product();
				prod.setId(rs.getString(1));
				prod.setName(rs.getString(2));
				prod.setPrice(rs.getDouble(3));
				prod.setDescription(rs.getString(4));

				prods.add(prod);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return prods;
	}

	@Override
	public Product findProduct(String id) {
		Product prod=null;
		
		try {
			con=DBUtils.getConnection();
			String qry="select * from product where id=?";
			ps=con.prepareStatement(qry);
			ps.setString(1, id);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				prod=new Product();
				prod.setId(rs.getString(1));
				prod.setName(rs.getString(2));
				prod.setPrice(rs.getDouble(3));
				prod.setDescription(rs.getString(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prod;
	}

	@Override
	public boolean updateProduct(Product product) {
		int x=0;
		try {
			
			con=DBUtils.getConnection();
			String qry="update product set product_name=?,price=?,description=? where id=?";
			ps=con.prepareStatement(qry);
			ps.setString(1, product.getName());
			ps.setDouble(2, product.getPrice());
			ps.setString(3, product.getDescription());
			ps.setString(4, product.getId());
			
			x=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		boolean status=false;
		if(x!=0)
			status=true;
		
		
		return status;
	}

	@Override
	public boolean deleteProduct(String id) {

		int x=0;
		try {
			con=DBUtils.getConnection();
			String qry="delete from product where id=?";
			ps=con.prepareStatement(qry);
			ps.setString(1, id);
			x=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		boolean status=false;
		if(x!=0)
			status=true;
		
		return status;
	}

}
