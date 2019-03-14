package studentmanagement;

import service.StudentManagementConsoleImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome Spring!" );
        
        StudentManagementConsoleImpl studentManagement = new StudentManagementConsoleImpl();
        
        System.out.println("Name a new student:");
        studentManagement.save(studentManagement.create());
        System.out.println("and one more student:");
        studentManagement.save(studentManagement.create());

        System.out.println("Searching for student with id 1002");
        System.out.println(studentManagement.find(1002));
        
        System.out.println("And here is all students:");
        studentManagement.findAll().forEach(s-> System.out.println(s));

        
//      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
//      StudentDao studentDao = context.getBean(StudentDao.class);
//      
//      AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(ComponentScanConfig.class); 
//      UserInputService userInputService = context2.getBean(UserInputService.class); 


        		
    }
}
