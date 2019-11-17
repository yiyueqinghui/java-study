//逻辑操作符
public class HellowWorld {
   //长路与(&) 和 短路与(&&)
   //同：无论长路与还是短路与，两边的运算单元都是布尔值，都为真时，才为真，任意为假，就为假。
   //异：长路与 两侧，都会被运算，短路与 只要第一个是false，第二个就不进行运算了
    public static void main(String[] args) {
        //长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i = 2;
        System.out.println( i== 1 & i++ ==2  ); //无论如何i++都会被执行，
        System.out.println(i);                  //所以i的值变成了3
         
        //短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
        int j = 2;
        System.out.println( j== 1 && j++ ==2  );  //因为j==1返回false,所以右边的j++就没有执行了，
        System.out.println(j);                    //所以j的值，还是2
         
    }
	
	
	
	//长路或(|) 和 短路或(||)
	//同：无论长路或还是短路或，两边的运算单元都是布尔值，都为假时，才为假，任意为真，就为真。
    //异：长路或 两侧都会被运算,短路或 只要第一个是true的，第二个就不进行运算了
	public void test() {
        //长路或  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i = 2;
        System.out.println( i== 1 | i++ ==2  ); //无论如何i++都会被执行，
        System.out.println(i);                  //所以i的值变成了3
         
        //短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
        int j = 2;
        System.out.println( j== 2 || j++ ==2  );  //因为j==2返回true,所以右边的j++就没有执行了，
        System.out.println(j);                    //所以j的值，还是2
         
    }
	
	
	
	//异或(^)
	//不同，返回真。相同，返回假
	public void test02(String[] args) {
        boolean a = true;
        boolean b = false;
         
        System.out.println(a^b); //不同返回真
        System.out.println(a^!b); //相同返回假
 
    }
	
	
	
	//赋值操作
	//+=   -=   *=   /=   %=  这些和js无异
	//&=  |=  ^=   <<=   >>=   >>>= 
	boolean e = true;
	boolean f = false;
	f &=true;       //相当于  f = f & true ;返回 false.     ｜=   ^= 同理
	
	//  <<=   >>=    >>>= 位移运算符     参考页面https://blog.csdn.net/qq_33218097/article/details/93196985
	//  >> ：右移，正数右移，高位补0，负数右移，高位补1
    //  >>>：右移，高位补0，不区分正数负数
    //  <<：左移，低位补0，不区分正数负数
    //  注：1.左移右移符号位也一起移动,  2.高位低位补1/0是指：移动完后空出来的位全部补1/0, 3.不存在<<<这个运算符
	
	
	public void test03() {
		int a = 0b10011111111111111111111111111111;//不用数了，这里是32位
		int b = a>>2;
		int c = a>>>2;
		int d = a<<2;
		System.out.println("a的值为："+a);
		System.out.println("a的二进制表示：" + Integer.toBinaryString(a));
		System.out.println("a>>2的值为："+b);
		System.out.println("a>>2的二进制表示：" + Integer.toBinaryString(b));
		System.out.println("a>>>2的值为："+c);
		System.out.println("a>>>2的二进制表示：" + Integer.toBinaryString(c));
		System.out.println("a<<2的值为："+d);
		System.out.println("a<<2的二进制表示：" + Integer.toBinaryString(d));
		
		
		// a的值为：-1610612737
	    // a的二进制表示：10011111111111111111111111111111（32位）
	    // a>>2的值为：-402653185
	    // a>>2的二进制表示：11100111111111111111111111111111（32位）
	    // a>>>2的值为：671088639
	    // a>>>2的二进制表示：100111111111111111111111111111（30位）
	    // a<<2的值为：2147483644
	    // a<<2的二进制表示：1111111111111111111111111111100（31位）

	}
	
	
	
	//java  三元操作符和js相同
	public void test04() {
        int i = 5;
        int j = 6;
        int k = i < j ? 99 : 88;
 
        // 相当于
        if (i < j) {
            k = 99;
        } else {
            k = 88;
        }
 
        System.out.println(k);
 
    }	
	
	
	
   
}