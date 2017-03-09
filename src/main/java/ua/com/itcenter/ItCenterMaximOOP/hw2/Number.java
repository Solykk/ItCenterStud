package hw2;

/*�������� ����� ����� (hw2.Number), ����������� ��������� ��������:
- ��������� ��������� (����� int get())
- �������� (����� Number add(Number num))
- ��������� (����� Number sub(Number num))
- ��������� (����� Number mul(Number num))
- ������� (����� Number div(Number num))
- ���������� � ������� (����� Number pow(Number exponent))
- ���������� ���������� (����� Number fact())
- ���������� ������� �� ������� (����� Number mod(Number num))*/
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
