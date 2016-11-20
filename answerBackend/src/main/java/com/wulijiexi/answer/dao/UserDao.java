package com.wulijiexi.answer.dao;



import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao extends Dao {

	/**
	 * 用户登录的dao
	 * @param username
	 * @param password
	 * @return true表示用户名密码正确，false表示用户名或密码不正确
	 */
	public boolean userLogin(String username,String password){
		String sql="select * from user where username=? and password=? ;";
		SqlRowSet rs=this.getJdbcTemplate().queryForRowSet(sql, new Object[]{username,password});
		if(rs.next())
			return true;
		else
			return false;
	}
	/**
	 * 获取用过所关注的城市,使用的前提是数据库中已经对当前openId的用户进行了存储
	 * @param openId
	 * @return 返回用户所关注的城市
	 */
	public String  getSubscribedCity(String openId){
		
		String sql="select subscribed_city from user where openId=?;";
		
		SqlRowSet rs=this.getJdbcTemplate().queryForRowSet(sql, new Object[]{openId});
		rs.next();
		String subscribed_city=rs.getString("subscribed_city");
		return subscribed_city;
		
	}
	
	public boolean setUsersubscribedCity(String openId,String newUserSubscribed_city){
		
		String sql="update user set subscribed_city=? where openId=?;";
		
		int rowsAffected=this.getJdbcTemplate().update(sql, new Object[]{newUserSubscribed_city,openId});
		
		return rowsAffected==1;
		
	}
	
	
	/**
	 * 仅仅向表中插入用户的openId,同时subscribe_time会自动生成
	 * @param openId
	 * @return
	 */
	public boolean insertUserInfo(String openId){
		
		String sql="insert into user(openId) values(?)";
		
		int rowsAffectde=this.getJdbcTemplate().update(sql, new Object[]{openId});
		
		return rowsAffectde>0?true:false;
		
	}
	
	/**
	 * 检查该用户的openI是否被存储，
	 * @param openId
	 * @return true表示已经存储 false表示未存储
	 */
	public boolean checkUserStoraged(String openId){
		
		String sql="select * from user where openId=?";
		 
		SqlRowSet rs=this.getJdbcTemplate().queryForRowSet(sql, new Object[]{openId});
		
		if(rs.next())
			return true;
		else 
			return false;
		
	}
	
	/**
	 * 设置用户取消关注的时间
	 * @param openId
	 * @return
	 */
	public boolean setUserUnSubscirbeTime(String openId){
		
		String sql="update user set unsubscirbe_time=current_timestamp() where openId=?";
		
		int rowsAffectde=this.getJdbcTemplate().update(sql, new Object[]{openId});
		
		return rowsAffectde>0?true:false;
		
	}
	
//	/**
//	 * 根据openId检查数据库中是否记录了用户的邮箱
//	 * @param openId
//	 * @return true表示邮箱存在 false表示邮箱不存在
//	 */
//	public boolean checkEmailExist(String openId){
//			
//			String sql="select (email is null) as exist from user where openId=?";
//			 
//			SqlRowSet rs=this.getJdbcTemplate().queryForRowSet(sql, new Object[]{openId});
//			
//			if(rs.next())
//				
//				return !rs.getBoolean("exist");
//			else 
//				return false;
//	
//	}
	
	/**
	 * 有用户记录则更新邮箱，没有用户记录则插入用户id和邮箱
	 * @param openId
	 * @param email
	 * @return
	 */
	public boolean setUserEmail(String openId,String email){
		
		String sql="update user set email=? where openId=?";
		 
		int rowsAffectde=this.getJdbcTemplate().update(sql, new Object[]{email,openId});
		
		if(rowsAffectde==0){
			
			sql="insert into user(email,openId) values(?,?)";
			
			rowsAffectde=this.getJdbcTemplate().update(sql, new Object[]{email,openId});
			
			if(rowsAffectde>0)
				return true;
			else 
				return false;
		}else
			return true;
			
	}
	
	/**
	 * 根据openId获取用户邮箱
	 * @param openId
	 * @return
	 */
	public String getUserEmail(String openId){
		
		String sql="select email from user where openId=?";
		 
		SqlRowSet rs=this.getJdbcTemplate().queryForRowSet(sql, new Object[]{openId});
		
		if(rs.next()){
			
			return rs.getString("email");
		}else
			return "nullmail";
		
	}
	
	/**
	 * 获取用户对校招随心看的使用次数
	 * @param openId
	 * @return
	 */
	public String getUserUseTimes(String openId){
		
		String sql="select count(*) as count from joblistpagelog where openId=?;";
		 
		SqlRowSet rs=this.getJdbcTemplate().queryForRowSet(sql, new Object[]{openId});
		
		if(rs.next()){
			
			return rs.getInt("count")+"";
		}else
			return "0";
		
	}

}
