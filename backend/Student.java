/*Kaustubh Ratna
209303032
cce section c
 
 */
package BACKEND;

/**
 *
 * @author Admin
 */
public class Student 
{
  public String name, branch ,regno,batch,section;
 float sgpa []=new float[8];
 public float cgpa;
public String get_name()
    {
    return this.name;
    }
public String get_branch()
{
    return this.branch;
}
public String get_regno()
{
    return this.regno;
}
public String get_batch()
{
    return this.batch;
}
public String get_section()
{
    return this.section;
}

 public float get_cgpa()
 {
 return this.cgpa;
 }
}
