package pxu.edu.vn.nhapsv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StudentView {
	private Scanner sc;
public void nhapsvView() {
		sc = new Scanner(System.in);
		
}
public Student NhapSV() throws ParseException {
	Student student = new Student();
	System.out.println("Nhap ID sinh vien: ");
   int idSV = sc.nextInt();
   student.setIdstudent(idSV);
   
   
   System.out.println("Nhap ho ten sinh vien: ");
   String hotenSV = sc.next();
   student.setHoten(hotenSV);
   
   
   System.out.println("Nhap ngay sinh: ");
   String ngaysinhSV = sc.next();
   SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
   Date ngaySinh = dateFormat.parse(ngaysinhSV);
   student.setNgaysinh(ngaySinh);
   
   System.out.println("Nhap gioi tinh: ");
   String gioitinhSV = sc.next();
   student.setGioitinh(gioitinhSV);
   
   System.out.println("Nhap sdt: ");
   String sdtSV =sc.next();
   student.setSdt(sdtSV);
	return student;
	
}
public void hienThiThongBao() {
	System.out.println("Ban da nhap thanh cong sinh vien!!!");
}
}
