package in.conceptarchitect.animals;

public class Camel extends Mammal implements Domestic,Transport{

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" is harvivour";
	}
	
	public String ride() {
		return this+" is a great desert ride";
	}
	
	
}
