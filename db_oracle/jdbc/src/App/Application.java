package App;

import dao.DeptDAO;
import vo.DeptVO;

public class Application {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		//dao.insertDept("Edu4", "Seoul");
		//dao.deleteDept(1);
		/*
		for(DeptVO data : dao.deptList()) {
			System.out.printf("%d | %-12s | %s %n",
					data.getDeptno(),data.getDname(),data.getLoc());
		}
		*/
		System.out.println("END");
	}
}
