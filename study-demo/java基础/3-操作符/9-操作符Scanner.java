//使用System.out.println("") 向控制台输出数据。 
//那么如果需要用到从控制台输入数据，就需要用到Scanner类


import java.util.Scanner;   //引入Scanner类

public class HellowWorld {
	
	//使用Scanner读取整数
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();      //读取到第一个整数
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);	
		
    }
	
	//使用Scanner读取浮点数
	public void test(){
		Scanner s = new Scanner(System.in);
		float a = s.nextFloat();
        System.out.println("读取的浮点数的值是："+a);
	}
	
	
	
	//使用Scanner读取字符串
	public void test01(){
		Scanner s = new Scanner(System.in);
		float a = s.s.nextLine();
        System.out.println("读取的浮点数的值是："+a);
	}	
	
	
	
	//使用Scanner读取整数后读取字符串
	
	//需要注意的是，如果在通过nextInt()读取了整数后，再接着读取字符串，读出来的是回车换行:"\r\n",因为nextInt仅仅读取数字信息，而不会读取回车换行"\r\n".       
    //所以，如果在业务上需要读取了整数后，接着读取字符串，那么就应该连续执行两次nextLine()，第一次是取走回车换行，第二次才是读取真正的字符串
	public void test02() {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("读取的整数是"+ i);
        String rn = s.nextLine();     //第一次读取到的换行符 "\r\n"
        String a = s.nextLine();      //第二次才读取到真正的字符串内容
        System.out.println("读取的字符串是："+a);
    }
	
	
	
	
   
   
   
   
   
}