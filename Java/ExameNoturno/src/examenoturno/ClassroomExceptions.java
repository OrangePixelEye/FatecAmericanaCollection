
package examenoturno;
public class ClassroomExceptions extends Exception 
{
    private String error_message;

    public ClassroomExceptions(String error_message) {
        this.error_message = error_message;
    }
    
    @Override
    public String getMessage()
    {
        return error_message;
    }
}
