//变量有两种类型:  基本类型 和 类类型
//参数也是变量，所以传参分为   基本类型传参 和 类类型传参
public class Hero {
	String name;
	float hp;
	
	
	//回血
    public void huixue(int xp){
        hp = hp + xp;
        //回血完毕后，血瓶=0
        xp=0;
    }
      
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
 
    public static void main(String[] args) {
        Hero teemo =  new Hero("提莫",383);
        //血瓶，其值是100
        int xueping = 100;
         
        //提莫通过这个血瓶回血
        teemo.huixue(xueping);
         
        System.out.println(xueping);   //仍然是100。基本类型传参，在方法内，无法修改方法外的基本类型参数
         
    }
	
	
}




//如果一个变量是基本类型,比如 int hp = 50;我们就直接管hp叫变量,=表示赋值的意思。
//如果一个变量是类类型,比如 Hero h = new Hero();我们就管h叫做引用。=不再是赋值的意思,而是表示指向的意思，这句话的意思是，引用h，指向一个Hero对象




//类类型传参
public class Hero02 {

	String name; // 姓名

	float hp; // 血量

	float armor; // 护甲

	int moveSpeed; // 移动速度

	public Hero02(String name, float hp) {
		this.name = name;
		this.hp = hp;
	}

	// 攻击一个英雄，并让他掉damage点血
	public void attack(Hero02 hero, int damage) {
		hero.hp = hero.hp - damage;
	}

	public static void main(String[] args) {
		Hero02 teemo = new Hero02("提莫", 383);
		Hero02 garen = new Hero02("盖伦", 616);
		garen.attack(teemo, 100);
		System.out.println(teemo.hp);
	}

}




