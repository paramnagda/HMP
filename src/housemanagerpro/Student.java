/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housemanagerpro;

/**
 *
 * @author param
 */
public class Student 
{
    String Name;
    String Gender;
    String Grade;
    String Section;
    String DOB;
    String Email;
    String Phone;
    
    public Student(String n, String ge, String gr, String s, String d, String e, String p)
    {
        Name=n;
        Gender=ge;
        Grade=gr;
        Section=s;
        DOB=d;
        Email=e;
        Phone=p;
    }
    
    public Student()
    {
        Name="";
        Gender="";
        Grade="";
        Section="";
        DOB="";
        Email="";
        Phone="";
    }
}
