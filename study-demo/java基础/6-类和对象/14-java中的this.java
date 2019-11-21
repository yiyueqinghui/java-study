//java中的this    this即代表当前对象
public class Hero {
	String name;
	float hp;
	
	public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }
	
	
	
	
	//带一个参数的构造方法
    public Hero(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }
      
    //带两个参数的构造方法
    public Hero(String name,float hp){
        this(name);     ////通过this调用一个参数的构造方法
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }
	
	
	
	
	
	
	//通过this访问属性
    public void setName3(String name){
        //name代表的是参数name
        //this.name代表的是属性name
        this.name = name;
    }
     
    public static void main(String[] args) {
        Hero garen =  new Hero('盖伦',360.258);
        //直接打印对象，会显示该对象在内存中的虚拟地址
        //格式：Hero@c17164 c17164即虚拟地址，每次执行，得到的地址不一定一样
 
        System.out.println("打印对象看到的虚拟地址："+garen);
        //调用showAddressInMemory，打印该对象的this，显示相同的虚拟地址
        garen.showAddressInMemory();
		
		garen.setName3('盖伦1');
		
    }  
	
	
}




