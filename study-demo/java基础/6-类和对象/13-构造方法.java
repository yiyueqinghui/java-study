//通过一个类创建一个对象，这个过程叫做实例化.而实例化是通过调用构造方法(又叫做构造器)实现的。

//构造方法是什么？
//方法名和类名一样（包括大小写）,没有返回类型,实例化一个对象的时候，必然调用构造方法
public class Hero {
	String name;
	float hp;
	
	//构造方法,方法名和类名一样（包括大小写）,没有返回类型
	//注意：这个无参的构造方法，如果不写，就会默认提供一个
	//public Hero(){
		//System.out.println('实例化一个对象的时候，必然调用构造方法');
	//}
	
	
	//一旦提供了一个有参的构造方法,同时又没有显式的提供一个无参的构造方法,那么默认的无参的构造方法，就“没有了“
	public Hero(String heroName,float heroHp){
		name = heroName;
		hp = heroHp;
	}
	
	
	
	public static void main(String[] args){
		//在这里进行实例这个类，从而创建对象的时候，必然会调用构造方法
		Hero h = new Hero();      //
		
		Hero h1 = new Hero('盖伦',632.25);
	}
}




//注意：这个无参的构造方法，如果不写，就会默认提供一个
public class Hero1 {
	String name;
	float hp;
	
	//注意：这个无参的构造方法，如果不写，就会默认提供一个
	//public Hero(){
		//System.out.println('实例化一个对象的时候，必然调用构造方法');
	//}
	
	
	//一旦提供了一个有参的构造方法,同时又没有显式的提供一个无参的构造方法,那么默认的无参的构造方法，就“没有了“
	public Hero1(String heroName,float heroHp){
		name = heroName;
		hp = heroHp;
	}
	
	
	
	public static void main(String[] args){
		Hero h = new Hero1();      //由于没有无参的构造方法，所以这里调用会出错
		
		Hero h1 = new Hero1('盖伦',632.25);    //这里调用有两个参数的构造方法
	}
}




//和普通方法一样，构造方法也可以重载
public class Hero2 {
	String name;
	float hp;	
	
	//和普通方法一样，构造方法也可以重载
	public Hero2(String heroName,float heroHp){
		name = heroName;
		hp = heroHp;
	}
	public Hero2(String heroName){
		name = heroName;
	}
	
	
	public static void main(String[] args){
		Hero h = new Hero2('孔明');      //这里调用有一个参数的构造方法
		
		Hero h1 = new Hero2('盖伦',632.25);    //这里调用有两个参数的构造方法
	}
}


