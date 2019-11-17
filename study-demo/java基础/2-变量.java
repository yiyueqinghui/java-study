/*
Java中有八种基本类型，都是Java语言预先定义好的，并且是关键字。

整型(4种)     用于存放整数,区别在于不同类型的整型,最大值、最小值不一样   表示的范围从小到大分别是byte < short < int < long ;   
字符型(1种)   char,用于存放一个字符，值用单引号'表示 (双引号表示字符串)   
浮点型(2种)   float 长度为32位   double 长度为64位  注意：默认的小数值是double类型的，也可以在小数后面加一个字母f，直接把该小数声明成float类型
布尔型(1种)   boolean   虽然布尔型真正存放的数据是0(false) 1(true),但是，不能直接使用0 1 进行赋值
String类型    String 其并不是基本类型,用双引号""表示

*/
public class HelloWorld {
	public static void main(String[] args){
	  //整型
	  byte b = 1;
      short s = 200;
      int i = 300;
      long l = 400; 
      /*如果试图给byte类型的变量赋予超出其范围的值，就会产生编译错误*/
      byte b2 = 200;
	  
	  
	  //字符型
	  char c = '我';
	  /*char 只能存放一个字符，超过一个字符就会产生编译错误*/
      char c2 = '中国'; //报错
		
		
	  //浮点型(小数默认的是double类型)
      double d = 123.45;      
      //该行会出现编译错误，因为54.321是double型的
      float f = 54.321;
      //在小数后面加一个字母f，直接把该小数声明成float类型  
      float f2 = 54.321f;	  
	  
	  
	  //布尔型
	  boolean b = true;
	  boolean b1 = false;
	  //虽然布尔型真正存放的数据是0(false) 1(true),但是，不能直接使用0 1 进行赋值,只能true false
	  boolean b2 = 1;
	  
	  //String 
	  String str = "hellow world!";
	  
		
		
	} 
}