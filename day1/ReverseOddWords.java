package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] strArr =test.split(" ");
       String revStr ="";
       for(int i=0;i<strArr.length;i++){
         if(i%2!=0){
           for(int j=0;j<strArr[i].length();j++){
             revStr =strArr[i].charAt(j) +revStr;
           }
           strArr[i]=revStr;
         }
       }
       
       String op="";
       for(int i=0;i<strArr.length;i++){
         op+=strArr[i].concat(" "); 
       }
       System.out.println(op);
       
       
		
	}

}
