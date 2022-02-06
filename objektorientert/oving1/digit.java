package oving2;

public class digit {
    
    int tallsys;
    int siffer;

    public int getValue(){
        return siffer;
    }

    public int getBase(){
        return tallsys;
    }

    public digit(int tallsys){
        super();
        this.tallsys = tallsys;
    }

    public boolean increment(){
        if (siffer == (tallsys)){
            siffer = 0;
            return true;
        }
        else{
            siffer++;
            return false;
        }
    }

    @Override
    public String toString() {
        if (siffer > 9 && siffer < 36){
            return String.valueOf((char)(siffer + 55));
        }
        else{
            return String.valueOf(siffer);
        }
    }
    public static void main(String[] args) {
        digit num = new digit(15);
		System.out.println(num.toString());
		for (int i = 0 ; i <= 16; i++) {
			num.increment();
			System.out.println(num.toString());
		}
    }
}
