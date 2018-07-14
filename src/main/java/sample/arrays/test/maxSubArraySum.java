package sample.arrays.test;

// Kadane's Algorithum 
public class maxSubArraySum {
	
	public static void main(String[] args){
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Inside Main");
		maxSubArraySum max_sub = new maxSubArraySum();
		System.out.println(max_sub.maxSubArraySum(a));
		System.out.println(max_sub.maxSubArraySumwithIndex(a));
	}
	
	
	public static int maxSubArraySum(int a[]){
		
		 int size = a.length;
	        int max_so_far = Integer.MIN_VALUE;
	        int max_ending_here = 0;
	        for(int i=0;i<size;i++) {
	        	max_ending_here = max_ending_here + a[i];
	        	if(max_ending_here<0){
	        		max_ending_here=0;
	        	}
	        	if(max_so_far<max_ending_here){
	        		max_so_far = max_ending_here;
	        	}
	        }
	        
	        return max_so_far;
		
	}
	
	
	public static int maxSubArraySumwithIndex(int a[]){
		
		int size = a.length;
		
		int s=0,start=0,end=0;
		
		  int max_ending_here = 0;
		  int max_so_far = Integer.MIN_VALUE;
		  
		  for (int i=0;i<size;i++){
			  
			  max_ending_here = max_ending_here+ a[i];
			  
			  if(max_ending_here<0){
				  max_ending_here =0;
				  start = i+1;
			  }
			  
			  if(max_so_far<max_ending_here){
				  max_so_far =max_ending_here;
				  start = s;
				  end =i;
			  }
		  }
		  
		  return max_so_far;
		
	}

}