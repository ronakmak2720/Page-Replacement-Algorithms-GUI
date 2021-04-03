package mywork;

import java.util.ArrayList;

public class AlgorithmFunctions {
	int i=10;
	@SuppressWarnings("unused")
	public Number LruFunction(int capacity, String getInput) {
		int i=0,ct=0;
		int n = capacity + 1;
		boolean page_fault=false;
		float hr1;
		String hr ="";
		String tempstr="";
		ArrayList<Integer> arrl = new ArrayList<>();
		while(i<getInput.length()) {
			if(!Character.isWhitespace(getInput.charAt(i))) {
				tempstr+=getInput.charAt(i);
			}	
			else {
				arrl.add(ct, Integer.parseInt(tempstr));
				ct++;
				tempstr = "";
			}
			if(i == getInput.length()-1)
				arrl.add(ct, Integer.parseInt(tempstr));
			i++;
		}
		//System.out.println(arrl);
		int len = arrl.size();
		
		int[] array = new int[len];
		for(i=0;i<len;i++) {
			array[i]=arrl.get(i);
		}
		int[][] process = new int[n][len];
		ArrayList<Integer> temp= new ArrayList<>();
		ct = 0;
		
		for(i=0;i<len;i++) {
			if(!temp.contains(array[i])) {
				if(temp.size()== capacity ) {
					temp.remove(0);
					temp.add(capacity-1, array[i]);
				}
				else {
					temp.add(ct, array[i]);
				}
			    page_fault = true;
				ct++;
			}
			else {
				temp.remove((Object)array[i]);
				temp.add(temp.size(), array[i]);
				page_fault = false;
			}
			for(int j=0;j<n;j++) {
				if(temp.size()<n) {
					if(j==temp.size())
						break;
				}
				process[j][i] = temp.get(j);
				if(page_fault == true)
				{
					process[n-1][i] = 1;
				}
				else
				{
					process[n-1][i] = 0;
				}
			}
		}
		return ct;
	}
	@SuppressWarnings("unused")
	public Number OprFunction(int frames, String getInput) {
		int ptr = 0, hit = 0, fault = 0,i=0,ct=0;
		boolean isFull = false;
		int buff[];
		int rfr_temp[];
		int layout[][];
		int str_len =getInput.length();
		rfr_temp = new int[str_len];
		String tempstr="";
		while(i<getInput.length()) {
			if(!Character.isWhitespace(getInput.charAt(i))) {
				tempstr+=getInput.charAt(i);
			}	
			else {
				rfr_temp[ct] = Integer.parseInt(tempstr);
				ct++;
				tempstr = "";
			}
			if(i == getInput.length()-1) {
				rfr_temp[ct] = Integer.parseInt(tempstr);
			}
			i++;
		}
		ct++;
		int[] rfr = new int[ct];
		int[] hitFaultArray = new int[ct];
		layout = new int[ct][frames];
		buff = new int[frames];
		for (int j = 0; j < frames; j++) {
			buff[j] = -1;
		}
		for (int j = 0; j < ct; j++) {
			hitFaultArray[j] = 0;
		}
		//System.out.println("reference string::");
		for ( i = 0; i < ct; i++) {
			rfr[i] = Integer.parseInt(String.valueOf(rfr_temp[i]));
			//System.out.println(rfr[i]);
		}
		System.out.println();
		for ( i = 0; i < ct; i++) {
			int temp = -1;
			for (int j = 0; j < frames; j++) {
				if (buff[j] == rfr[i]) {
					temp = j;
					hit++;
					break;
				}
			}
			if (temp == -1) {
				if (isFull) {
					int ind[] = new int[frames];
					boolean ind_temp[] = new boolean[frames];
					for (int j = i + 1; j < ct; j++) {
						for (int k = 0; k < frames; k++) {
							if ((rfr[j] == buff[k]) && (ind_temp[k] == false)) {
								ind[k] = j;
								ind_temp[k] = true;
								break;
							}
						}
					}
					int mx = ind[0];
					ptr = 0;
					if (mx == 0) {
						mx = 200;
					}
					for (int j = 0; j < frames; j++) {
						if (ind[j] == 0) {
							ind[j] = 200;
						}
						if (ind[j] > mx) {
							mx = ind[j];
							ptr = j;
						}
					}
				}
				buff[ptr] = rfr[i];
				fault++;
				hitFaultArray[i] = 1;
				if (!isFull) {
					ptr++;
					if (ptr == frames) {
						ptr = 0;
						isFull = true;
					}
				}
			}
			for (int j = 0; j < frames; j++) {
				layout[i][j] = buff[j];
			}
		}
		return fault;
	}
	@SuppressWarnings("unused")
	public Number FifoFunction(int frames, String input) {
		int i=0,ct=0,num=0,pageHit=0;
		String tempstr="";
		int[] farray = new int[frames];
		int[] pages = new int[input.length()];
		for(i=0;i<frames;i++)
		{
			farray[i]=-1;
		}
		
		i = 0;
		while(i<input.length()) {
			
			if(!Character.isWhitespace(input.charAt(i))) {
				tempstr+=input.charAt(i);
			}	
			else {
				pages[ct]=Integer.parseInt(tempstr);
				ct++;
				tempstr = "";
			}
			if(i == input.length()-1)
				pages[ct]=Integer.parseInt(tempstr);
			i++;
		}
		int length  = ct+1;
		boolean flag = true;
	    int arry[][] = new int[frames+1][length];
	   String processstr[][] = new String[frames+1][length];
	   String arraystr[] = new String[length];
		  for(i=0; i<length; i++)
	        {
	            flag = true;
	            int page = pages[i];
	            for(int j=0; j<frames; j++)
	            {
	                if(farray[j] == page)
	                {
	                	
	                    flag = false;
	                    pageHit++;
	                    for(j=0;j<frames;j++)
	                    {
	                    	arry[j][i] = farray[j];	
	                    }
	                    arry[frames][i] = 0;
	                    break;
	                }
	            }
	            if(num == frames)
	                num = 0;
	          
	            if(flag)
	            {
	                farray[num] = page;
	                for(int j=0;j<frames;j++)
	                {
	                arry[j][i] = farray[j];}
	                arry[frames][i] = 1;
	                num++;
	            }
		
	        }
		  int pfault = (length - pageHit);
		
		return (pfault);
	}



}
