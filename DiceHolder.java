import java.util.ArrayList;

public class DiceHolder{

	private ArrayList<Die> holder;

	public DiceHolder(){
		holder = new ArrayList<Die>();
	}

	public int addDie(Die die){
		for(int i = 0; i < 6; i++){
			holder.add(die);
			if(holder.size() < 6)
				return -1;
		}

		return 1;
	}

	public void shake(){
		for(int i = 0; i < holder.size(); i++){

		}
	}

	public String toString(){
		String holder = "";

	}

}