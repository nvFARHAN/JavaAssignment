package com.farhan.q3;

public enum Stadium {
	EDEN_GARDENS_STADIUM
	{
		void message()
		{
			System.out.println("This is the home ground of KKR");
		}
	},
	WANKHEDE_STADIUM
	{
		void message()
		{
			System.out.println("This is the home ground of Mumbai Indians");
		}
	},
	CHIDAMBARAM_STADIUM
	{
		void message()
		{
			System.out.println("This is the home ground of CSK");
		}
	},
	M_CHINNASWAMY_STADIUM
	{
		void message()
		{
			System.out.println("This is the home ground of RCB");
		}
	};
	
	abstract void message();
}
