import java.util.*;
public class Empsalary {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the basic salary   :   ");
        float basicsalary = s.nextInt();
        float hra = 0;
        float da = 0;
        
        if( basicsalary <= 10000)
        {
        	hra = basicsalary * 0.20f;
        	da = basicsalary * 0.80f;
        	System.out.println("salary = "+basicsalary+" "+ "HRA = "+hra+" "+ "DA  =  " + da);
        }
        else if( basicsalary <= 10000)
        {
        	hra = basicsalary * 0.20f;
        	da = basicsalary * 0.80f;
        	System.out.println("salary = "+basicsalary+" "+ "HRA = "+hra+" "+ "DA  =  " + da);
        }
        else
        {
            hra = basicsalary * 0.20f;
            da = basicsalary * 0.80f;
            System.out.println("salary = "+basicsalary+" "+ "HRA = "+hra+" "+ "DA  =  " + da);
        }
        s.close();
	}

}
