package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class FileModel implements iGetModel{
    private String fileName;
    private List<Student> students;
    
    public FileModel(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students  = new ArrayList<>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }
    public void saveAllStudentToFile(List<Student> students)
        {
            try(FileWriter fw = new FileWriter(fileName, true))
            {
                for(Student pers : students)
                {
                    fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getStudentId());
                    fw.append('\n');
                }
                fw.flush();    
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }

    @Override
    public Integer deleteStudentById(Long id) {
       int i = -1;
        for (Student pers : students) {
            if (pers.getStudentID() == id) {
                i = students.indexOf(pers);
                break;
            }
        }
        if (i != -1) {
            students.remove(i);
        }
        return i;
    }
}
