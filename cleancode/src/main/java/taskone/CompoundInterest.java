
package taskone;
import java.util.logging.Logger;
public class CompoundInterest {
	public double compoundInterestCalculation(double princple,double rateofinterest,
			double timeperiod,String type)
	{
		Period periodTypeObject=null;
		try
		{
		double value=(1+(rateofinterest)/100.00);
		if(type.equalsIgnoreCase("Annually"))
				{
			periodTypeObject=new Annually(); 
				}
		else if(type.equalsIgnoreCase("halfyearly"))
		{
	periodTypeObject=new HalfYearly(); 
		}
		else if(type.equalsIgnoreCase("quarterly"))
		{
	periodTypeObject=new Quaterly(); 
		}
		double amount=periodTypeObject.calculation(value, timeperiod);
		return (amount*princple-princple);
		
	}
	catch(Exception a)
	{
		Logger.getAnonymousLogger();
	}
		return 0.0;

	}
}
