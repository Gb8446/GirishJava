package demogirish;
public class SwitchMonthExample {  
public static void main(String[] args) {  
   String a="Giris@$#$hBonde";
   int val [] =new int [256];
   for(int i=0;i<a.length();i++ ) {
	   val[a.charAt(i)]++;
   }
   for(int j=0;j<val.length;j++) {
	   if(val[j] != 0) {
		  System.out.println((char)j +"   "+val[j]);
	   }
   }
}  
} 