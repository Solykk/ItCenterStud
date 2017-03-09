package hw2;

/*Написать класс число (hw2.Number), выполняющий следующие операции:
- получение примитива (метод int get())
- сложение (метод Number add(Number num))
- вычитание (метод Number sub(Number num))
- умножение (метод Number mul(Number num))
- деление (метод Number div(Number num))
- возведение в степень (метод Number pow(Number exponent))
- вычисление факториала (метод Number fact())
- вычисление остатка от деления (метод Number mod(Number num))*/
public class Number {
	
	private int num;
	
	public Number(int num){
		this.num = num;
	}
	
	public int get(){
		return num;
	}
			
	public Number add(Number num){
		return new Number (this.num + num.get()); 
	}
	
	public Number sub(Number num){
		return new Number (this.num - num.get());
	}
	
	public Number mul(Number num){
		return new Number (this.num * num.get());
	}
	
	public Number div(Number num){
		return new Number (this.num / num.get());
	}
	
	public Number pow(Number exponent){
		return new Number ((int)Math.pow(this.num, exponent.get()));
	}
	
    public Number fact(){
    	int rez = 1;
    	for(int i = 1; i <= this.num; i++ ){
    		rez = rez * i; 
       	}
    	return new Number (rez);
	}
    
    public Number mod(Number num){
    	return new Number (this.num % num.get());
	}
    
}
