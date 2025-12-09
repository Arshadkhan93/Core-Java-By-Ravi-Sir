package com.ak.cake_order;
class OrderedCake extends Cake
{
	private String massage;
	
	public OrderedCake() 
	{
		super("Round", "Vanilla", 1);
	}

	public OrderedCake(String shape, String flavor, int quantity) 
	{
		super(shape, flavor, quantity);
		
	}

	public OrderedCake(String shape, String flavor, int quantity, String massage) 
	{
		super(shape, flavor, quantity);
		this.massage = massage;
	}

	@Override
	public String toString() {
		if(massage!=null)
		return "A "+this.getShape()+" "+this.getFlavor()+" Cake of "+this.getQuantity()+" KG is Ready with Happy Birthday "+this.massage+" @ Rs."+(this.getQuantity()*Cake.price)+"\".\r\n"
				+"";
		else
			return super.toString();
		
	}
	
	
	

}
