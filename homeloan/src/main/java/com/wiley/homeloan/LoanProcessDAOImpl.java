package com.wiley.homeloan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;




public class LoanProcessDAOImpl implements LoanProcessDAO{
	final static int cibil_score = 720;
	
//	public void getInformation(User u, LoanProcess lp) {
//		//annual income doc
////		cibil score enum/ final
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter your annual income:");
//		int annual_income = sc.nextInt();
//		
//		String document = lp.getDoc();
//		int id= u.getUser_id();
//		
//		String selectSQL = "SELECT document FROM loan_process WHERE id=?";
//        ResultSet rs = null;
//        
//        DBConnection dbcon = new DBConnection();
//        try (Connection conn = DBConnection.createConnection();
//                PreparedStatement pstmt = conn.prepareStatement(selectSQL);) {
//            pstmt.setInt(1, id);
//            rs = pstmt.executeQuery();
//
//            File file = new File(document);
//            FileOutputStream output = new FileOutputStream(file);
//
////            System.out.println("Writing to file " + file.getAbsolutePath());
//            while (rs.next()) {
//                InputStream input = rs.getBinaryStream("document");
//                byte[] buffer = new byte[1024];
//                while (input.read(buffer) > 0) {
//                    output.write(buffer);
//                }
//            }
//        } catch (SQLException | IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//            }
//        
//        }
//	}
	
	public void getInformation(Loan l, String file) {
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n******Your LOAN is in process.");
		
		System.out.println("\nEnter 'Y' to provide documents.");
		char ch = sc.next().charAt(0);
		if(ch != 'Y')
		return;
				
		String q = " INSERT INTO  loan_process(loan_id,document,annual_income,cibil_score) VALUES(?,?,?,?);";
		
		try {
			conn = DBConnection.createConnection();

			
			PreparedStatement ps = conn.prepareStatement(q);
			
			File f = new File(file);
			FileInputStream fis = new FileInputStream(f);

		System.out.println("abcd");
		
			ps.setInt(1, l.getLoan_id());
			
			ps.setBinaryStream(2, fis);
			ps.setInt(3, l.getAnnual_income());
			ps.setInt(4, cibil_score);
			
			int count = ps.executeUpdate();
			System.out.println("qwert");
			if(count != 0) {
				System.out.println("Loan_process Successfully UPDTED!!!!");
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

	public void getInformation(User u) {
		// TODO Auto-generated method stub
		
	}


}
