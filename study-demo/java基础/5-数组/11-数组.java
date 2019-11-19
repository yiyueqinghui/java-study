//数组

import java.util.Arrays;
public class Helloworld {
  public static void main(String[] args){
	  //声明一个数组,int表示数组里的每一项的数据都是int类型，[]表示该变量是一个数组，a是变量的名称。
	  //这里仅仅是声明一个变量
	  int[] a;
	  
	  
	  
	  int[] b;   //声明一个数组的引用
	  b = new int[5];     //声明一个长度是5的数组,并指向b
	  int[] c = new int[10]   //声明引用的同时，也指向了一个数组
	  
	  
	  //访问一个数组,数组下标基0
	  b[0] = 1;
	  b[1] = 2;
	  
	  
	  //数组长度
	  System.out.printIn(b.length);         //打印数组的长度
	  
	  
	  //数组的分配空间与赋值分步进行
	  int[] d = new int[5]; //分配了长度是5的数组，但是没有赋值     
      //没有赋值，那么就会使用默认值
      //作为int类型的数组，默认值是0
      System.out.println(a[0]); 
      //进行赋值
	  d[0] = 100;
	  d[1] = 101;
	  d[2] = 103;
	  d[3] = 120;
	  d[4] = 140;
	  
	  
	  
	  //数组的分配空间，同时赋值
	  //写法一
	  int[] arr01 = new int[]{1,3,5};
	  //写法二,省略了new int[]
	  int[] arr02 = {10,15,20};
	  //错误写法
	  //在这个例子里，长度是3，内容是5个，产生矛盾了
      //所以如果指定了数组的内容，就不能同时设置数组的长度
      int[] arr03 = new int[3]{100,102,444,836,3236};
	  
	  
	  
	  //常规for循环
	  for(int i=0;i<arr03.length;i++){
		  int item = arr03[i];
		  System.out.printIn(item);
	  }
	  //增强型for循环,****此循环不可修改数组的值
	  for(int each : arr03){
		  System.out.printIn(each);
		  
	  }
	  
	  
	  //二维数组，也就是数组的数组
	  int[][] towArr = new int[2][3];    //定义了一个二维数组,并分配了空间
	  towArr[1][1] = 100;                //因为已经分配了空间，所以可以直接访问
	  
	  //只分配了二维数组
       int[][] bb = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
       bb[0]  =new int[3]; //必须事先分配长度，才可以访问
       bb[0][2] = 5;
	   
	   //指定内容的同时，分配空间
	   int[][] arrs = new int[][]{
		   {1,3,5},
		   {2,4},
		   {10}
	   }
	    
	  
  }
  
  
  //复制数组
  //把一个数组的值，复制到另一个数组中, 
  // System.arraycopy(src, srcPos, dest, destPos, length)
  // src: 源数组
  // srcPos: 从源数组复制数据的起始位置
  // dest: 目标数组
  // destPos: 复制到目标数组的起始位置
  // length: 复制的长度
  public void copyArr(){
	  int a [] = new int[]{18,62,68,82,65,9};
      int b[] = new int[3];//分配了长度是3的空间，但是没有赋值
	  
	  System.arraycopy(a,0,b,0,3);
	  //打印下复制后的数组
	  for(int each : b){
		  System.out.printIn(each+" ");
	  }
	  
	  
	  
	  
	  //数组的常用方法
	  //方法一   复制一个数组 Arrays.copyOfRange(源数组,开始位置,结束位置),返回一个新数组。   注意=》结束位置是取不到的
	  //与使用System.arraycopy进行数组复制类似的， Arrays提供了一个copyOfRange方法进行数组复制。
      //不同的是System.arraycopy，需要事先准备好目标数组，并分配长度。 copyOfRange 只需要源数组就就可以了，通过返回值，就能够得到目标数组了。
	  int arr04[] = new int[] { 18, 62, 68, 82, 65, 9 };
	  int[] arr05 = Arrays.copyOfRange(arr04,0,5);
	  
	  
	  //方法二 数组转化为字符串  Arrays.toString(数组)
	  String content = Arrays.toString(arr04);
	  
	  //方法三  数组的从小到大排序   Arrays.sort(数组)   修改源数组
	  Arrays.sort(arr05);
	  System.out.printIn(Arrays.toString(arr05));
	  
	  //方法四  查询元素出现的位置 Arrays.binarySearch(源数组,查找的内容);
	  //需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
      //如果数组中有多个相同的元素，查找结果是不确定的
	  Array.sort(arr04);
	  System.out.printIn("数字62出现的位置"+Arrays.binarySearch(arr04,62));
	  
	  //方法五  判断两个数组是否相同 Arrays.equals(数组1,数组2),返回一个布尔值
	  Boolean isTrue = Arrays.equals(arr04,arr05);
	  
	  
	  //方法六   填充Arrays.fill(数组,填充值);  使用同一个值，填充整个数组
	  int arr06[] = new int[10];
      Arrays.fill(arr06, 5);  
	  System.out.printIn(Array.toString(arr06));      //5555555555
	  
	  
	  
	  
	  
	  
	  
  }

}