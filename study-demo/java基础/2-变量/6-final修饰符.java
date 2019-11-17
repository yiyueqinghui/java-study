//final修饰符  
//当一个变量被final修饰的时候，该变量只有一次赋值的机会
public class HellowWorld {
	
	public void method1() {
        final int i = 5;
         
        i = 10; //i在第4行已经被赋值过了，所以这里会出现编译错误
         
    }
	
	//如果在声明的时候未赋值，那么可以在后面代码进行唯一的一次赋值
	 public void method2() {
        final int j;   //只是被声明，但是没有被赋值
         
        j = 10; //所以在这里可以进行第一次赋值
         
        j = 11; //j已经被赋值过了，所以这里会出现编译错误
         
    }
	
}



// 从{ 开始 到对应的} 结束，即一个块