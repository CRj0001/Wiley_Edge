package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wiley.jdbcapp.util.dBConnection;

public class UseBLOB {
	
	public static void createColumn() {
		Connection conn = null;
		
		String q = "ALTER TABLE candidates ADD COLUMN resume LONGBLOB NULL AFTER email";
		
		try {
			conn = dBConnection.createConnection();
			PreparedStatement ps = conn.prepareStatement(q);

			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("Successfully ALTER!!!!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void writeBlob(int cid, String file) {
		Connection conn = null;
		
		String q = "UPDATE candidates SET resume=? WHERE id=?";
		
		try {
			conn = dBConnection.createConnection();

			
			PreparedStatement ps = conn.prepareStatement(q);
			
			File f = new File(file);
			FileInputStream fis = new FileInputStream(f);
			
			ps.setBinaryStream(1, fis);
			ps.setInt(2, cid);
			
			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("Successfully UPDTED!!!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		//createColumn();
		String file = "D:\\Wiley_Training\\file_data\\rresume_blob.txt";
		int id = 200;
		writeBlob(200,file);
	}
}
 