package assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wiley.jdbcapp.util.dBConnection;

public class BlobFileOutput {
	public static void getBlob(int cid, String file) {
		Connection conn = null;
		ResultSet rs = null;
		String q = "SELECT resume FROM candidates WHERE id=?";
		
		try {
			conn = dBConnection.createConnection();

			
			PreparedStatement ps = conn.prepareStatement(q);
			
			File f = new File(file);
			FileOutputStream fos = new FileOutputStream(f);
			
			ps.setInt(1, cid);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				InputStream input = rs.getBinaryStream("resume");
				byte[] buffer = new byte[1024];
				while(input.read(buffer) > 0) {
					fos.write(buffer);
				}
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
		String file = "Sahil_Resume.txt";
		int id = 201;
		getBlob(id,file);
	}

}
