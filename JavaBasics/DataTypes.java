package JavaBasics;

public class DataTypes {
   public static void main (String args[]){
//data types-primitive or non primitive
//primitive data types-byte,short,char,boolean,int,long,float,double
//non-primitive -string,array,class,object,interface
//java is a typed language it means we have to tell the data type before variable name
     byte b=8;                   //only 250 numbers can store
     System.out.println(b);
     char ch='a';               //only characters can be stored
     System.out.println(ch);      
     boolean var=true;           //only true/false
     System.out.println(var);
     float price = 19.04f;         //only decimal values
     System.out.println(price);
     long n=2308485;              //integers of large values
     System.out.println(n);
     double p=1243.80238825;      //deciaml values of larger size
     System.out.println(p);  
     short m=45;                  //any integer
     System.out.println(m);      

   } 
}
//size of data types;
//byte- 1byte[-128 to 127]
//short- 2bytes
//char- 2bytes['a'-'z','A'-'Z','@','%',...]
//boolean- 1byte
//int- 4bytes[-2B to 2B]
//long- 8bytes
//float- 4bytes
//double- 8bytes 
