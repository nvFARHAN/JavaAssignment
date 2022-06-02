package com.farhan.q2;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
	void searchOutdatedModel(String cName,String... modelName)
	{
		if(modelName.length==0)
		{
			System.out.println("No model found");
			return;
		}
		for(String model : modelName)
		{
			boolean flag = false;
			for(String str:this.outdatedModels)
			{
				if(model.equals(str))
				{
					System.out.println(model+"_OUTDATED");
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println(model);
			}
		}
	}
}
