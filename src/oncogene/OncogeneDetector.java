package oncogene;

import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String string) {
		if(healthySequences.isEmpty()) {
			return true;
		}
		if(cancerSequences.isEmpty()) {
			return true;
		}
		if(cancerSequences.isEmpty()) {
			return true;
		}  
		//System.out.println(string);
		double health=0;
		double cancer=0;
		for(int i=0;i<healthySequences.size();i++) {
			for(int x=0;x<healthySequences.get(i).length()-3;x++) {
				if(healthySequences.get(x).substring(x, x+3).equals(string)) {
					health=health+1;
				}
			}
		}
		
		for(int i=0;i<cancerSequences.size();i++) {
			for(int x=0;x<cancerSequences.get(i).length()-3;x++) {
				if(cancerSequences.get(x).substring(x, x+3).equals(string)) {
					cancer=cancer+1;
				}
			}
		}
		System.out.println(health/cancer);
		return false;
	}

}
