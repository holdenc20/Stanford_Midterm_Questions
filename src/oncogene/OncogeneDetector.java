package oncogene;

import java.util.ArrayList;
import java.util.Arrays;

public class OncogeneDetector {

	public static boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String string) {
		if(healthySequences.isEmpty()) {
			return true;
		}
		if(cancerSequences.isEmpty()) {
			return true;
		} 
		if(string=="") {
			return false;
		}
		System.out.println(string);
		double health=0;
		double cancer=0;
		for(int i=0;i<healthySequences.size();i++) {
			for(int x=0;x<healthySequences.get(i).length()-2;x++) {
				System.out.println(healthySequences.get(i).substring(x, x+3)+" : "+ string);
				
				if(healthySequences.get(i).substring(x, x+3).equals(string)) {
					health=health+1;
				}
			}
		}
		System.out.println("healthy: "+health);
		for(int i=0;i<cancerSequences.size();i++) {
			for(int x=0;x<cancerSequences.get(i).length()-2;x++) {
				if(cancerSequences.get(i).substring(x, x+3).equals(string)) {
					cancer=cancer+1;
				}
			}
		}
		System.out.println("cancer: "+cancer);
		health=health/healthySequences.size();
		cancer=cancer/cancerSequences.size();
		System.out.println(health);
		System.out.println(cancer);
		if(health>cancer) {
			return false;
		}
		if(cancer>health){
			return true;
		}
		return false;
	}

}
