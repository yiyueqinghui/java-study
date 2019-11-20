//引用和指向
public class Hero {
	String name;
	float hp;
	int moveSpeed;
	public static void main(String[] args){
		//创建一个对象
		new Hero();
		//使用一个引用来指向这个对象
		Hero h = new Hero();
		
		//多个引用，一个对象
		Hero h1 = h;
		Hero h2 = h1;    //不论是h1,h2,还是h,都指向的是同一个对象
		
		Hero h10 = new Hero();   //注意，h10和h,h1,h2不同。h,h1,h2指向同一个对象，h10指向另一个对象。但是它们都指向的是同一个类
		
	}
}


//类和对象的继承
//物品类
public class Item {
	String name;
	int price;
}
public class Weapon extends Item {
	int damage;    //攻击力
	public static void main(String[] args){
		Weapon infinityEdge = new Weapon();   //创建一个武器对象
		infinityEdge.damage = 100;         //damage属性是在Weapon中新设计的
		
		infinityEdge.name = '项羽';      //name和price来自继承的Item类
		infinityEdge.price = 998;
		
	}
}



//方法的重载
//为AdHero 提供三种方法, public void attack() , public void attack(Hero h1) ,public void attack(Hero h1, Hero h2);
//方法名是一样的，但是参数类型以及数量不一样,在调用方法attack的时候，会根据传递的参数类型以及数量，自动调用对应的方法,这就是方法的重载。
public class AdHero extends Hero{
	public void attach(){
		System.out.printIn(name + "进行了一次攻击,但是不确定打中了谁");
	}
	public void attach(Hero h1){
		System.out.printIn(name + "对"+h1.name+"进行了一次攻击");
	}
	public void attach(Hero h1,Hero h2){
	    System.out.printIn(name + "对"+h1.name+"和"+h2.name+"进行了一次攻击");
	}
	
	//可变数量的参数  Hero ...heros 表示heros是一个数组，并且其中的每一项都是一个Hero对象。
	public void attach(Hero ...heros){
		for(int i=0;i<heros.length;i++){
			System.out.printIn(heros[i].name);
		}
	}
	
	public static void main(String[] args){
		AdHero h1 = new AdHero();
		h1.name = "孙悟空";
		
		AdHero h2 = new AdHero();
		h2.name = "牛魔王";
		AdHero h3 = new AdHero();
		h3.name = "妖怪";
		
		h1.attach();
		h1.attach(h2);
		h1.attach(h2,h3);
		
		
	}
	
	
	
	
	
}










