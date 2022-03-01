package dao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import model.StudentModel;
import utility.ConnectionManager;

public class StudentDao extends GetConnection{
	
	Connection dbConn = null;
	@Override
	public Connection getDbConnection() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection dbCon = ConnectionManager.getConnection();
		return dbCon;
	}
	public void storeStudentRecordInDb(ArrayList<StudentModel> stuList) throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "insert into studentsDetailsRecord(stuid,stuname,studep,yearofstudying,academicfees,paidfees,balancefees) values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			for(StudentModel sm:stuList) {
				ps.setInt(1, sm.getstuid());
				ps.setString(2, sm.getstuname());
				ps.setString(3, sm.getstudep());
				ps.setInt(4, sm.getyearofstudying());
				ps.setInt(5, sm.getacademicfees());
				ps.setInt(6, sm.getpaidfees());
				ps.setInt(7, sm.getbalancefees());
				int result = ps.executeUpdate();
				if(result ==1) {
					System.out.println("*************************************************");
					System.out.println("STUDENT RECORD IS ADDED SUCCESSFULY IN DATABASE");
					System.out.println("***************************************************");
				}
				
			}
		}catch(SQLException e) {
			System.out.println("CHECK GIVEN STATEMENT THERE IS SOMETHING ERROR GIVEN DATA TYPE ARE YOU ENTER A DUPLICATE VALUE FOE PRIMARY KEY ");
			e.printStackTrace();
		}
	}
	public void viewStudentTableRecord() throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "Select * from studentsDetailsRecord";
		try {
			HashMap<Object, Object> hm=new HashMap<>(); 
			Statement stmt = dbConn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				hm.put(rs.getInt("stuid"),rs.getString("stuname"));
			}
			
					System.out.println(hm);
		}catch(SQLException e) {
			System.out.println("CHECK SQL QUEY GIVEN RIGHT OR WRONG");
			e.printStackTrace();
		}
	}
	public void updateStudentRecord(int option, int stuid ,String newStudentDepartmentName) throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "update  studentsDetailsRecord set studep = ? where stuid = ?";	
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			ps.setString(1, newStudentDepartmentName);
			ps.setInt(2, stuid );
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("CHECK IN GIVEN DATA TYPE IS WRIGHT OR WRONG");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updateStudentRecord(int option,int stuid,int newPaidFees) throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "update  studentsDetailsRecord set paidfees = ? where stuid = ?";	
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			ps.setInt(1,newPaidFees );
			ps.setInt(2,stuid );
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("CHECK IN GIVEN DATA TYPE IS WRIGHT OR WRONG");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	public void updateStudentRecord1(int option,int stuid,int newBalanceFees) throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "update  studentsDetailsRecord set paidfees = ? where stuid = ?";	
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			ps.setInt(1,newBalanceFees );
			ps.setInt(2,stuid );
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("CHECK IN GIVEN DATA TYPE IS WRIGHT OR WRONG");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	public void deleteStudentRecord(int stuid) throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql="delete from studentsDetailsRecord where stuid=?";
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			ps.setInt(1,stuid);
			ps.executeUpdate();
		}catch(SQLException e) {
			System.out.println("CHECK WITH YOUR QUERY");
			e.printStackTrace();
		}
		
	}
	
	}
	
		
		
	



