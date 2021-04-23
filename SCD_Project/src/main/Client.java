package main;

import gui.*;
import results.*;
import student.*;
import teacher.*;
import admin.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Signup frame = new Signup();
		frame.setVisible(true);
		
		Sign_In frame2 = new Sign_In();
		frame2.setVisible(true);
		
		MainScreen frame3 = new MainScreen();
		frame3.setVisible(true);
		
		NotFound frame8 = new NotFound();
		frame8.setVisible(true);
		
		TeachersMenu frame4 = new TeachersMenu();
		frame4.setVisible(true);


		AdminMenu frame5 = new AdminMenu();
		frame5.setVisible(true);
		
		StudentMenu frame6 = new StudentMenu();
		frame6.setVisible(true);
		
		GetResults frame7 = new GetResults();
		frame7.setVisible(true);
		
		Results frame9 = new Results();
		frame9.setVisible(true);
		
		
		CreateQuiz frame12 = new CreateQuiz();
		frame12.setVisible(true);
		
		CreateQuiz2 frame11 = new CreateQuiz2();
		frame11.setVisible(true);
		
		AttempQuiz frame13 = new AttempQuiz();
		frame13.setVisible(true);
		
		AttempQuiz2 frame14 = new AttempQuiz2();
		frame14.setVisible(true);
		
		AttemptQuiz3 frame15 = new AttemptQuiz3();
		frame15.setVisible(true);
		
		
		SearchTeacher frame16 = new SearchTeacher();
		frame16.setVisible(true);
		
		ShowTeacherData frame17 = new ShowTeacherData();
		frame17.setVisible(true);
		
	}

}
