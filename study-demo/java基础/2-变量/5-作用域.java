//作用域
public class HellowWorld {
	//字段，属性
	//当一个变量被声明在类下面, 变量就叫做字段 或者属性、成员变量
	//比如变量i,就是一个属性。从这个变量声明的位置开始，整个类都可以访问得到,
	//所以其作用域就是从其声明的位置开始的整个类
	int ii = 1;
	int jj = i;
	
	
	
	
	//参数
	//如果一个变量，是声明在一个方法上的，就叫做参数.参数的作用域即为该方法内的所有代码,其他方法不能访问该参数,类里面也不能访问该参数
	public void method1(int num){
		System.out.println(num);
	}
	
	
	
	
	
	//局部变量
	//声明在方法内的变量，叫做局部变量,其作用域在声明开始的位置，到其所处于的块结束位置,以{}为块
	public void method2() {
        int i  = 5;  //其作用范围是从声明的第26行，到其所处于的块结束33行位置
        System.out.println(i);
        {            //子块
            System.out.println(i); //可以访问i
            int j = 6;
            System.out.println(j); //可以访问j
        }
        System.out.println(j); //不能访问j,因为其作用域到第31行就结束了
    }
	
}