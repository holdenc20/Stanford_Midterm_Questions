package animal_hipster;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class AnimalHipster {

	public AbstractCollection<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network,
			HashMap<String, String> favoriteAnimals) {
			
			Set<String> names=network.keySet();
			ArrayList<String> hipsters=new ArrayList<String>();
			
			for(int i=0;i<names.size();) {
				String name=names.iterator().next();
				ArrayList<String> friends=network.get(name);
				System.out.println("#");
				names.remove(name);
				System.out.println(name);
				System.out.println(friends);
				boolean isAnimalHipster=true;
				String animal=favoriteAnimals.get(name);
				for(int x=0;x<friends.size();x++) {
					String friendsAnimal=favoriteAnimals.get(friends.get(x));
					if(animal==friendsAnimal) {
						isAnimalHipster=false;
					}
					else {
						
					}
				}
				if(isAnimalHipster==true) {
					hipsters.add(name);
				}
				
			}
			
		System.out.println("hipsters: "+hipsters);
		return hipsters;
	}

}
