
public class HellowWorld {
	public static void main(String[] args){
		//整数字面值
		//当以l或者L结尾的时候，一个整数字面值是long类型，否则就是int类型。
		long val = 26L;   //以L结尾，是long类型
		init num = 100;   //默认是init类型
		
		
		
		//浮点数字面值
		//当以f或者F结尾的时候，就表示一个float类型的浮点数，否则就是double类型（以d或者D结尾，写不写都可以）。
		//浮点数还可以用E或者e表示（科学计数法）
		//e2表示10的二次方，即100. 1.234e2 = 1.234x100
		float min = 12.3569F;   //以F结尾的字面值表示float类型
		double max = 15.985;    // 默认就是double类型
		double d = 1.234e2;     //表示1.234*100
		
		
		
		//字符和字符串字面值
		//字符的字面值放在单引号中,字符串的字面值放在双引号中,\表示转义符。
		char a = 'a';
		String desc = "这是一个描述性文档";
		
		//以下是转义字符
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠	
		
	}
	
}