/*
* 创建英雄类
* 1，类名首字母大写
* 2，定义的变量是属性，定义的函数是方法
*/
public class Hero {
	//属性
	String name;
	float hp;
	int moveSpeed;
	
	//方法,方法是一个类的动作行为，所以一般都是以动词开头的，比如 add ... 
    //如果有多个单词，后面的每个单词的第一个字母使用大写
	
	//void 表示该方法没有返回值
	void keng(){
		System.print.out('坑对友！');
	}
	
	//float 表示返回值是浮点数,
	float getHp(){
		return hp;
	}
	
	//表示增加速度，init speed表示参数speed是整数型
	void addSpeed(init speed){
	    moveSpeed = moveSpeed + speed;
	}
	
	
	public static void main(String[] args){
		Hero garen = new Hero();
		garen.name = '盖伦';
		garen.hp = 1236.25;
		garen.moveSpeed = 20;
		garen.addSpeed(100);
		
	}
	
}