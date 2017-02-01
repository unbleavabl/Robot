class Robot{
	String RobotName="";
	public char getRandomChar(){
		int random = (int)(Math.random()*26+65);
		return (char)random;
	}
	public char getRandomNumber(){
		int random = (int)(Math.random()*10+48);
		return (char)random;
	}
	public String getNewName(){
		String Name="";
		Name += String.valueOf(getRandomChar());
		Name += String.valueOf(getRandomChar());
		Name += String.valueOf(getRandomNumber());
		Name += String.valueOf(getRandomNumber());
		Name += String.valueOf(getRandomNumber());
		return Name;
	}
	public void reset(){
		RobotName=getNewName();
	}
	public String getName(){
		if(RobotName.length()>0)
			return RobotName;
		else{
			RobotName = getNewName();
			return RobotName;
		}
	}
}
