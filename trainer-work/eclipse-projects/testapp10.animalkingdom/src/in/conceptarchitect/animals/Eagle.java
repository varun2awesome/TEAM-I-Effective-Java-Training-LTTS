package in.conceptarchitect.animals;

public class Eagle extends Bird {
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" is a flesh eater";
	}

	
	public String hunt() {
		return this+" is a flying hunter";
	}
}
