package TreeMap_Examples;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}
	
}


public class TreeMap_Examp_02 {

	public static void main(String[] args) 
	{
	    //This example is used for custom methods .
		
                                          //TreeMap is used for ordered data , HashMap is used unordered data .
				Map<Code,String> lectures = new TreeMap<>();
				lectures.put(new Code("S01","L03"), "Generics");
				lectures.put(new Code("S01","L01"), "Files under Java");
				lectures.put(new Code("S02","L03"), "Network programming");
				lectures.put(new Code("S01","L07"), "OOPS");
				lectures.put(new Code("S01","L05"), "Methods");
				lectures.put(new Code("S01","L03"), "Expressions");
				
				for(Map.Entry<Code, String> entry: lectures.entrySet())
				{
				   System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
				}

	}

}
