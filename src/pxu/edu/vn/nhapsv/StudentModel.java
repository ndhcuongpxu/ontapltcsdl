package pxu.edu.vn.nhapsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class StudentModel {
	static Connection conn;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	public StudentModel() {
		conn = connnectDB();
	}

	public void addStudent(Student input) {
		PreparedStatement ps = null;
		try {

			String sql = "insert into  student(hoten,ngaysinh,gioitinh,sdt) values(?,?,?,?)";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, input.getHoten());
			statement.setString(2, dateFormat.format(input.getNgaysinh()));
			statement.setString(3, input.getGioitinh());
			if (input.getSdt() != null) {
				statement.setString(4, input.getSdt());
			}
			// Step 6: Process the results
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Connection connnectDB() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/qlsv";
			String userName = "root";
			String password = "@Dmin1234";
			Class.forName("com.mysql.jdbc.Driver");
			if (conn == null) {
				conn = DriverManager.getConnection(dbURL, userName, password);
				System.out.println("connect successfully!");
			}
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}
}
