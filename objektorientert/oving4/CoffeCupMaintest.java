package oving4.testing;

public class CoffeCupMaintest {
    
    private double capacity;
	private double currentVolume;

	public CoffeCupMaintest() {
		this.capacity = 0.0;
		this.currentVolume = 0.0;
	}

	public CoffeCupMaintest(double capacity, double currentVolume) {
		if (isValidCapacity(capacity)) {
			this.capacity = capacity;
		} else {
			throw new IllegalArgumentException("Illegal capacity given.");
		}
		if (isValidVolume(currentVolume)) {
			this.currentVolume = currentVolume;
		} else {
			throw new IllegalArgumentException("Illegal volume given.");
		}
	}

	public double getCapacity() {
		return capacity;
	}

	public double getCurrentVolume() {
		return currentVolume;
	}

	public void increaseCupSize(double biggerCapacity) {
		if (isValidCapacity(biggerCapacity)) {
			this.capacity += biggerCapacity;
		}
	}

	private boolean isValidVolume(double volume) {
		if (volume > this.capacity || volume < 0.0) {
			return false;
		}
		return true;
	}

	private boolean canDrink(double volume) {
		if (this.currentVolume >= volume) {
			return true;
		}
		return false;
	}

	public void drinkCoffee(double volume) {
		if (isValidVolume(volume) && canDrink(volume)) {
			this.currentVolume -= volume;
		} else {
			throw new IllegalArgumentException("You can't drink that much coffee!");
		}
	}

	public void fillCoffee(double volume) {
		if (isValidVolume(this.currentVolume + volume)) {
			this.currentVolume += volume;
		} else {
			throw new IllegalArgumentException("You just poured coffee all over the table. Good job.");
		}
	}

	private boolean isValidCapacity(double capacity) {
		if (capacity >= 0.0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "CoffeeCup [capacity=" + capacity + ", currentVolume=" + currentVolume + "]";
	}

    //--test getCapacity() og getCurrentVolume()--

/* 	public static void main(String[] args) {
		CoffeCupMaintest newCup = new CoffeCupMaintest(40.0, 0.0);
        System.out.println(newCup.getCapacity()); //toSring burde bruke getCapasity og getCurrentVolume
        System.out.println(newCup.getCurrentVolume()); //toSring burde bruke getCapasity og getCurrentVolume
        newCup.increaseCupSize(25.0);
        newCup.fillCoffee(10.0);
        System.out.println(newCup.getCapacity()); 
        System.out.println(newCup.getCurrentVolume());
	} */

    //--test increaseCupSize()--

/*     public static void main(String[] args) {
        CoffeCupMaintest newCup = new CoffeCupMaintest(40.0, 0.0);
        System.out.println(newCup.toString());
        newCup.increaseCupSize(14.0);
        System.out.println(newCup.toString());
        newCup.increaseCupSize(-10.0); //bare ignoreres burde kanskje kaste en IllegalArgumentException
        System.out.println(newCup.toString());
    } */

    //--test drinkCoffee()--
    
/*     public static void main(String[] args) {
        CoffeCupMaintest newCup = new CoffeCupMaintest(40.0, 0.0);
        System.out.println(newCup.toString());
        newCup.fillCoffee(30.0);
        newCup.drinkCoffee(15.0);
        System.out.println(newCup.toString());
        newCup.drinkCoffee(-10.0); //bare ignoreres burde kanskje kaste en IllegalArgumentException
        System.out.println(newCup.toString());
        newCup.drinkCoffee(50.0);
        System.out.println(newCup.toString());
    } */

    //--test fillCoffee()--
    
/*     public static void main(String[] args) {
        CoffeCupMaintest newCup = new CoffeCupMaintest(40.0, 0.0);
        System.out.println(newCup.toString());
        newCup.fillCoffee(30.0);
        System.out.println(newCup.toString());
        newCup.fillCoffee(-15.0); //man kan "fylle" negative verdier gir ikke mening at er mulig
        System.out.println(newCup.toString());
        newCup.fillCoffee(50.0);
        System.out.println(newCup.toString());
    } */

}
