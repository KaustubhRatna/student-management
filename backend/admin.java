/*Kaustubh Ratna
209303032
cce section c
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

/**
 *
 * @author Admin
 */
import java.util.*;
public class admin
{
    static ArrayList <Student> slist=new ArrayList<Student>();
    
    public void add_student(String name,String regno,String branch,String section,String batch)
    {
        Student s= new Student();
        s.name=name;
        s.branch=branch;
        s.regno=regno;
        s.section=section;
        s.batch=batch;
        this.slist.add(s);
    }
     public int remove_student(String regno)
    {
        for(int i=0;i<slist.size();i++)
      {
        if(slist.get(i).regno.equals(regno))
        {slist.remove(slist.get(i));
        return 1; 
        }
      }
        return 0;
    }
    public int update_name(String regno,String name)
    {
        if(name!=null)
        {
        for(int i=0;i<slist.size();i++)
      {
        if(slist.get(i).regno.equals(regno))
        {slist.get(i).name=name;
        return 1; 
        }
      }
        return 0;
        }
      return -1;
    }
    public int update_branch(String regno,String branch)
    {
          if(branch!=null)
        {
        for(int i=0;i<slist.size();i++)
      {
        if(slist.get(i).regno.equals(regno))
        {slist.get(i).branch=branch;
        return 1; 
        }
      }
        return 0;
        }
      return -1;
    }
    public int update_section(String regno,String section)
    {
         if(section!=null)
        {
        for(int i=0;i<slist.size();i++)
      {
        if(slist.get(i).regno.equals(regno))
        {slist.get(i).section=section;
        return 1; 
        }
      }
        return 0;
        }
      return -1;
        
    }
    public int update_sgpa(String regno,float sgpa,int sem)
    {
        
         if(sgpa>=0&&sgpa<=10&&sem>=1&&sem<=4)
        {
        for(int i=0;i<slist.size();i++)
      {
        if(slist.get(i).regno.equals(regno))
        {slist.get(i).sgpa[sem-1]=sgpa;
        slist.get(i).cgpa=(slist.get(i).cgpa+sgpa)/(sem);
        return 1; 
        }
      }
        return 0;
        }
      return -1;
    }
    public Student get_details(String regno)
    {
      for(int i=0;i<slist.size();i++)
      {
        if(slist.get(i).regno.equals(regno))
        return slist.get(i); 
        }
      return null;
    }
}
