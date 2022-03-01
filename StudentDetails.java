package service;

import java.util.ArrayList;

import model.StudentModel;

public class StudentDetails implements AbcDetails {
	StudentDetails st  = new StudentDetails ();
	ArrayList<StudentModel> stuList = new ArrayList<StudentModel>();
	public void addEmployeeToList(StudentModel sm) throws ClassNotFoundException {
		stuList.add(sm);
		stuDao.storeEmpRecordInDb(stuList);
	}

}
