package code.repo.oops.constructor_newInstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorNewInstanceExample {

	
	public static void main(String args[])
    {
        try 
        {
            Class<?> clasz = Class.forName("code.repo.oops.constructor_newInstance.Employee");
			Constructor<?> constructor = clasz.getConstructor(new Class[]{int.class,String.class,int.class});
            Employee employee = (Employee)constructor.newInstance(1,"JavaInterviewPoint",45000);
            System.out.println("Employee Id     : "+employee.getEmpId());
            System.out.println("Employee Name   : "+employee.getEmpName());
            System.out.println("Employee Salary : "+employee.getEmpSalary());
            
        }
        catch (NoSuchMethodException e) 
        {
            e.printStackTrace();
        }
        catch (SecurityException e) 
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        } catch (InstantiationException e) 
        {
            e.printStackTrace();
        } catch (IllegalAccessException e) 
        {
            e.printStackTrace();
        } catch (IllegalArgumentException e) 
        {
            e.printStackTrace();
        } catch (InvocationTargetException e) 
        {
            e.printStackTrace();
        }
    }
}
