package jrout.tutorial.corejava.collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapsClient {

	public static void main(String[] args) {
		
		Map schoolCommitee = new HashMap<>();
		
		Map<String,List> stJoseSchool = new HashMap<>();
		
		
		List<String> stJoseteacherList = new ArrayList();
		stJoseteacherList.add("Sravanti");
		stJoseteacherList.add("Meneka");
		
		List<String> stJoseStudentList = new ArrayList();
		stJoseStudentList.add("Vanaja");
		stJoseStudentList.add("Manoj");
		
		stJoseSchool.put("Teacher", stJoseteacherList);
		stJoseSchool.put("Student", stJoseStudentList);
		
		schoolCommitee.put("StJose", stJoseSchool);
		schoolCommitee.put("Vsv", "VSV School Details");
		schoolCommitee.put("DPS", "DPS School Details");
		
//		map.put(null, null);
//		map.put(null, "This is NULL");
		
		System.out.println(schoolCommitee);
		
		
		
		schoolCommitee.get("StJose");
		
		processSchoolCommitee(schoolCommitee);
		
	}

	public static void processSchoolCommitee(Map map){
		
	}
	
	public void mapFirst(){
		
		Map map = new HashMap<>();
		
		map.put("StJose", "St Jose School Details");
		map.put("Vsv", "VSV School Details");
		map.put("DPS", "DPS School Details");
		map.put(null,null);
		
		//System.out.println(map.get("Vsv"));
		
		Set entrySet = map.entrySet();
		Iterator<Map.Entry> iter = entrySet.iterator();
		while(iter.hasNext()){
//			Object obj = iter.next();
//			System.out.println(obj);
			Map.Entry<String, String> mapEntry = iter.next();
			System.out.println(mapEntry.getKey() +" ----- "+ mapEntry.getValue());
		}
	}
}
