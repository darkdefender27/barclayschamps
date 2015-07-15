package com.cg.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class JdbcActorDAO implements ActorDAO {

	private DataSource datasource;
	
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void insert(Actor actor) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO ACTOR(first_name,last_name) values (?,?)";
		Connection conn = null;
		try{
			conn = datasource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,actor.getFirstName());
			ps.setString(2,actor.getLastName());
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			if(conn !=null){
				try{
					conn.close();
					
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public List<Actor> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		
		String sql = "select actor_id,first_name,last_name from actor where first_name = ?";
		Connection conn = null;
		try{
			conn=datasource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, firstName);
			ResultSet rs = ps.executeQuery();
			List<Actor> actors = new ArrayList<Actor>();
			while(rs.next()){
				Actor actor = new Actor();
				actor.setId(rs.getInt(1));
				actor.setFirstName(rs.getString(2));
				actor.setLastName(rs.getString(3));
				actors.add(actor);
			}
			rs.close();
			ps.close();
			return actors;
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
		finally{
			if(conn !=null){
				try{
					conn.close();
					
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public Actor findById(int id) {
		// TODO Auto-generated method stub
		String sql = "select actor_id,first_name,last_name from actor where actor_id = ?";
		Connection conn = null;
		try{
			conn=datasource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			Actor actor = null;
			if(rs.next()){
				actor= new Actor();
				actor.setId(rs.getInt(1));
				actor.setFirstName(rs.getString(2));
				actor.setLastName(rs.getString(3));
			}
			rs.close();
			ps.close();
			return actor;
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
		finally{
			if(conn !=null){
				try{
					conn.close();
					
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
	}

}