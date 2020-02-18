package tasktwo;

public class ConstructionCost {
	public  double costCalculation(double area,String material)
	{
		
		Cost costObject;
		if(material.equalsIgnoreCase("standard"))
		{
			costObject=new StandardMaterial();
		}
		else if(material.equalsIgnoreCase("above standard"))
		{
			costObject=new AboveStandardMaterial();
		}
		else if(material.equalsIgnoreCase("high standard"))
		{
			costObject=new HighStandardMaterial();
		}
		else
		{
			costObject=new AutomatedHome();
		}
		double materialcost=costObject.materialCostCalculation();
		return (materialcost*area);
	}

}
