package controller;

import java.util.Scanner;

import dao.StudentDao;
import model.StudentModel;
import service.StudentDetails;

public class MainController {

	public static void main(String[] args) throws ClassNotFoundException {
		StudentDetails st = new StudentDetails();
		StudentDao stDao = new StudentDao();
		System.out.println("****************************************************");
		System.out.println("CHOOSE YOUR LOGIN TYPE");
		System.out.println("****************************************************");
		boolean temp = true;
		while(temp) {
			System.out.println("1.ADMIN\n2.STUDENT\n3.EXIT");
			Scanner sc = new Scanner(System.in);
			int option = Integer.parseInt(sc.nextLine());
			switch(option) {
				case 1: {
					System.out.println("****************************************************");
					System.out.println("Enter your username");
					String adminName = sc.nextLine();
					System.out.println("Enter your password");
					String adminPwd = sc.nextLine();
					if(adminName.equals("Accountuser") && adminPwd.equals("asd#tth%")) {
						boolean temp1 = true;
						while(temp1) {
							System.out.println("****************************************************");
							System.out.println("Choose any one of an operation that you wish to do");
							System.out.println("1. ADD FRESER DETAILS\n2. VIEW ALL THE STUDENT DETAILS\n3) UPDATE ANY DETAILS OF STUDENT\n4) DELETE ANY STUDENT DETAILS\n5) EXIT");
							boolean flag1 = true;
							int adminOption = 0;
							while(flag1) {
								try {
									adminOption = Integer.parseInt(sc.nextLine());
									flag1 = false;
								}catch(Exception e) {
									System.out.println("Input given type is wrong. Give the right option in number type");
									flag1 =true;
								}
							}
							
							switch(adminOption) {
								case 1:{
									System.out.println("NOW U CAN ADD A FRESHER DETAILS");
									System.out.println("HOW MANY STUDENT DETAILS WANT TO ADD IN TABLE");
									int empCount = Integer.parseInt(sc.nextLine());
								
									for(int i=0; i<empCount; i++) {
										System.out.println("ENTER A STUDENT ID ");
										
										
										int  id = Integer.parseInt(sc.nextLine());
										System.out.println("ENTER A STUDENT NAME");
										String name = sc.nextLine();
										System.out.println("ENTER YOUR STUDENT DEPARTMENT");
										String dep=sc.nextLine();
										System.out.println("ENTER A STUDENT YEAR OF STUDING");
										int years=sc.nextInt();
										System.out.println("ENTER A STUDENT BATCH");
										int batch = sc.nextInt();
										System.out.println("ENTER THE ACCEDEMIC FEES ALLOTTED OF THE STUDENT");
										int totalfees=sc.nextInt();
										System.out.println("ENTRE STUDENT PAID FEES");
										int paidfees=sc.nextInt();
										System.out.println("ENTER A AMOUNT STUDENT YET TO PAY A FEES");
										int balancefees = sc.nextInt();
										
									break;
								}
								}
								case 2:{
									System.out.println("NOW U CAN VIEW ALL THE DETAILS OF STUDENT RECORD IN OUR TABLE");
								
									stDao.viewStudentTableReccord();
								
									break;
								}
								case 3:{
									System.out.println("NOE CAN UPDATE ANY REORD IN STUDENT TABLE");
									System.out.println("*************************************");
									System.out.println("ENTER A STUDENT ID WANT TO EDIT A DETAILS");
									int id = Integer.parseInt(sc.nextLine());
									System.out.println("**************************************");
									System.out.println("SELECT AN OPTION WHAT YOU WANT TO EDITI");
									System.out.println("1.PAID FEES\n2.TOTAL FEES\n3.DEPARTMENT\n4.EXIT");
									int updateOption = Integer.parseInt(sc.nextLine());
									switch(updateOption) {
									case 1:{
										System.out.println("ENTER A STUDENT PAID FEES");
										String newStuPaidFees = sc.nextLine();
										
										//stDao.updateStudentRecord(updateOption,id,newStuPaidFees);
										
										
										break;
									}
									case 2:{
										System.out.println("ENTER A TOTAL FEES");
										break;
									}
									case 3:{
										System.out.println("ENTER A DEPARTMENT");
										break;
									}
									}
									
								}
								case 4:{
									System.out.println("ENTER A STUDENT DETAILS WHAT YOU WANT TO DELETE");
									
								}
								case 5:{
									temp1 = false;
									break;
								}
							}
						}
					
					}
					else {
						System.out.println("****************************************************");
						System.out.println("GIVEN ADMIN LOGIN CREDENTIAL IS WRONG PLEASE GIVE THE CORRECT ONE");
					}
					break;
				}
				case 2:{
					System.out.println("ENTER USER STUDENT ID TO LOGIN");
					int id=sc.nextInt();
					System.out.println("ENTER A PASSWORD TO LOGIN");
					int stupass=sc.nextInt();
					System.out.println("***********WELCOME , NOW  U CAN DO WHICH OPERATION U WANT");
					
					
				}
}
		}
	}
}

