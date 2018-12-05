import java.util.ArrayList;

public class DiceHolder{

	private ArrayList<Die> holder;

	public DiceHolder(){

	}

	public int addDie(Die die){
		for(int i = 0; i < 6; i++){
			holder.add(die);
			if(holder.size() < 6)
				return -1;
		}

		return 1;
	}


}