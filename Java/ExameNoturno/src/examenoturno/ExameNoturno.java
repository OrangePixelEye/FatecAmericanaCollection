package examenoturno;

public class ExameNoturno {
    public static void main(String[] args) {
        
        Students st = new Students(1, "name");
        Students st1 = new Students(2, "nSme");
        Students st2 = new Students(3, "namA");
        Classroom cl = new Classroom("ADM", 2);
        
        try{
           cl.addStudent(st);
           cl.addStudent(st1);
           cl.addStudent(st2);
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage() + "\n\n");
        }
        
        try
        {
            cl.addStudent(st);
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage() + "\n\n");
        }
        
        try
        {
            cl.registerMissing(1);
            cl.registerMissing(3);
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage() + "\n\n");
        }
        
        try
        {
            cl.rate(2, 9);
            cl.rate(1, 10);
            cl.rate(1, 11);
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage() + "\n\n");
        }
        
        try
        {
            cl.rate(3, 1);
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage() + "\n\n");
        }
        
        cl.listStudents();
        cl.listApproved();
    }
}
