/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_01;

/**
 *
 * @author Jozua Palandi
 */
public class MVC_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //fetch student record based on his roll no from the database
      StudentModel model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("Palandi");
      controller.setStudentRollNo("12");

      controller.updateView();
   }

   private static StudentModel retriveStudentFromDatabase(){
      StudentModel student = new StudentModel();
      student.setName("Jozua");
      student.setRollNo("5");
      return student;
   }
    
}
