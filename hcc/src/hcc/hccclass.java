package hcc;

public class hccclass {
	public double cost(String stnd,double area)

	{

		double res=0;

		if(stnd.contentEquals("standard"))

		{

			res=1200*area;

		}

		else if(stnd.contentEquals("abovestandard"))

		{

			res=1500*area;

		}

		else if(stnd.contentEquals("highstandard"))

		{

			res=1800*area;

		}

		else if(stnd.contentEquals("highstandardandfullyautomated"))

		{



			res=2500+area;

		}

			return res;

	}
}
