import java.util.ArrayList;

public class DiceHolder{

	private ArrayList<Die> holder;

	public DiceHolder(){
		holder = new ArrayList<Die>();
	}

	public int addDie(Die die){
		holder.add(die);
		System.out.println(die.toString());

		if(holder.size() > 5){
			return -1;
		}
		else{
			return 1;
		}
	}

	public void shake(){
		Die tempDie;
		for(int i = 0; i < holder.size(); i++){
			tempDie = holder.get(i);
			tempDie.roll();
		}
	}

	public String toString(){
		String holderString = "";
		Die tempDie;
		for(int i = 0; i < holder.size(); i++){
			tempDie = holder.get(i);
			holderString = holderString + tempDie.toString() + "\n";
		}
		return holderString;

	}

}