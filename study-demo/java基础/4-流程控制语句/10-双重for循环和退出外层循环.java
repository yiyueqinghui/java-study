//break是结束当前循环
//continue 是跳过当前循环
 public class Helloworld {
    //break是结束当前循环
	public static void main(String[] args) {  
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2) 
                    break; //如果是双数，结束当前循环
            }
             
        }       
    }
	
	
	
	
	//借助boolean变量结束外部循环,需要在内部循环中修改这个变量值,每次内部循环结束后，都要在外部循环中判断，这个变量的值
	public void test() {
        boolean breakout = false; //是否终止外部循环的标记
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (0 == j % 2) {
                    breakout = true; //终止外部循环的标记设置为true
                    break;
                }
            }
            if (breakout) //判断是否终止外部循环
                break;
        }
 
    }
	
	
	
	//注意：这一点是javascript所没有的
	//在外部循环的前一行，加上标签 ,在break的时候使用该标签 ,即能达到结束外部循环的效果
	public static void main(String[] args) {   
        outloop:         //outloop这个标示是可以自定义的比如outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2) 
                    break outloop; //如果是双数，结束外部循环
            }     
        }
         
    }	
	
	
	
	
	
	
	
	
 
 
 
 
 }