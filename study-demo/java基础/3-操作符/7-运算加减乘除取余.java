// 运算单位计算
public class HellowWorld {
    //如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算.
	 public static void main(String[] args) {
        int a = 5;
        long b = 6;
        int c = (int) (a+b); //a+b的运算结果是long型，所以要进行强制转换
        long d = a+b;        //正常计算结果，返回值默认是最大长度单位类型
    }
	
	//如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算 
	public void add() {
        byte aa = 1;
        byte bb= 2;
        byte cc = (byte) (a+b); //虽然aa bb都是byte类型，但是运算结果是int类型，需要进行强制转换
        int dd = a+b;           //由于aa,bb运算单位的长度都小于int,所以返回结果默认是int
    }
	
	
	
	//自增 自减操作符置前以及置后的区别
	//以++为例 ,int i = 5; i++; 先取值，再运算 ;++i; 先运算，再取值;
	public void mainTest() {
        int i = 5;
        System.out.println(i++); //输出5
        System.out.println(i);   //输出6
         
        int j = 5;
        System.out.println(++j); //输出6
        System.out.println(j);   //输出6
    }
	
	
}