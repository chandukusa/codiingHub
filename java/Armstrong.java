class Armstrong                                                        
{
  public static void main (String args[])
{
    int num=370,temp=num,count=0,sum=0,pow=0;
	   while(num>0)
	      {
		   count++;
		   num=num/10;
		   
	   }
	   num=temp;
	  //System.out.println("the count of the digit is "+count);
    
	   while(num>0)
	     {
		  int rem=num%10;  
		  pow=(int)Math.pow(rem,count);
		  sum=sum+pow;
		  num=num/10;
		  
	   } 
	   System.out.println(sum);
	   if(sum==temp)
	     {
		   System.out.println("Armstrong");
	     }
	   else
	     {
		   System.out.println("Not an amstrong");
	     }
	}
	
	
		
	}




   }

}


}