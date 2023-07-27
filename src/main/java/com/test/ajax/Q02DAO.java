package com.test.ajax;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.test.my.DBUtil;

public class Q02DAO {
	private Connection conn;
	private Statement stat;
	private PreparedStatement pstat;  //?????
	private ResultSet rs;

	public Q02DAO() {
		this.conn = DBUtil.open();
	}

	public int checkDong(String dong) {
		try {
			
			String sql = "select count(*) as cnt from zipcode where dong like ?";
			
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, "%"+dong+"%");
			
			rs = pstat.executeQuery();
			
			if (rs.next()) {
				
				return rs.getInt("cnt");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	
}
