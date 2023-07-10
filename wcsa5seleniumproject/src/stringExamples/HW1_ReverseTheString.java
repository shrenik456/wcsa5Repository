package stringExamples;

import org.apache.poi.hslf.record.TextCharsAtom;

public class HW1_ReverseTheString {

	public static void main(String[] args) {

              String s="kINERHS";
              
              char[]c=s.toCharArray();
              
              for (int i = c.length-1; i>=0; i--) 
            {
            	System.out.print(c[i]);
			}

	}

	
	}


