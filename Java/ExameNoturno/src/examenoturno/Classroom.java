package examenoturno;
public class Classroom {
    private String name_course;
    private int total_class;
    private int students = 0;
    private Students[] students_list = new Students[2];
    

    public Classroom(String name_course, int total_class) {
        this.name_course = name_course;
        this.total_class = total_class;
    }
    
    public void addStudent(Students student) throws Exception
    {
        //verificar o limite
        if(students >= 2) throw new Exception("The classroom is full");//20 = substituir por 20
        else
        {
            //verifica
            Students st = searchStudent(student.getId());
            if(st != null) throw new ClassroomExceptions("Student " + student.getName() +" is already in this classroom");
            else
            {
                //define as variaveis com 0
                student.setFinal_grade(0);
                student.setTotal_absence(0);
                //adiciona
                students_list[students] = student;
                students++;
                System.out.print("\nAdicionado = " + student.getName() + " \n");
            }
        }
    }
    
    public Students searchStudent(int id)
    {
        //percorrer a lista p se ver se já tá
        for(int i = 0; i < students; i++)
        {
            if(students_list[i].getId() == id)
            {
                return students_list[i];
            }
        }
        return null;
    }
    
    public void registerMissing(int id) throws Exception
    {
        //busca o aluno
        Students student = searchStudent(id);
        if(student == null) throw new ClassroomExceptions("Student " + id + " not found");
        else
        {
            student.setTotal_absence(student.getTotal_absence() + 1);
        }
    }
    
    public void rate(int id, double grade) throws Exception
    {
        //tratamento de parametros
        if(grade < 1 || grade > 10) throw new ClassroomExceptions("Grade " + grade + " is not an available number");
        else
        {
            Students student = searchStudent(id);
            if(student == null) throw new ClassroomExceptions("Student " + id + " not found");
            else
            {
                student.setFinal_grade(grade);
            } 
        }   
    }

    public void listStudents()
    {
        System.out.print("Alunos da turma de " + name_course + "\n\n");
        for(int i = 0; i < students; i++)
        {
            printStudent(i);
        }
    }
    
    public void listApproved()
    {
        System.out.print("Aprovados da turma de " + name_course + "\n\n");
        
        for(int i = 0; i < students; i++)
        {
            //verificar nota >= 6 e presença maior que 75%
            if(getAttendance(students_list[i].getTotal_absence())> 75.0 && students_list[i].getFinal_grade() >= 6)
            {
                printStudent(i);
            }
        }
    }
    
    private void printStudent(int pos)
    {
        System.out.print("Id: ");
        System.out.print(students_list[pos].getId() + "\n");
        System.out.print("Nome: ");
        System.out.print(students_list[pos].getName() + "\n");
        System.out.print("Nota: ");
        System.out.print(students_list[pos].getFinal_grade() + "\n");
        System.out.print("Faltas: ");
        System.out.print(students_list[pos].getTotal_absence() + "\n");
        System.out.print("Frequencia: ");
        System.out.print(getAttendance(students_list[pos].getTotal_absence()) + "% \n\n");
    }
    
    private double getAttendance(double student_absence)
    {  
        return (total_class - student_absence) * 100 / total_class;
    }
}
