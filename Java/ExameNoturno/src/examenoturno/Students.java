
package examenoturno;

public class Students {
    private int id;
    private String name;
    private double final_grade;
    private int total_absence;
    
    public Students()
    {
        id = 0;
        name = "";
        final_grade = 0;
        total_absence = 0;
    }

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
        final_grade = 0;
        total_absence = 0;
    }
    
    public int getId() {
        return id;
    }

    public int getTotal_absence() {
        return total_absence;
    }

    public double getFinal_grade() {
        return final_grade;
    }

    public String getName() {
        return name;
    }
    
    public void setFinal_grade(double final_grade) {
        this.final_grade = final_grade;
    }

    public void setTotal_absence(int total_absence) {
        this.total_absence = total_absence;
    }
    
}
