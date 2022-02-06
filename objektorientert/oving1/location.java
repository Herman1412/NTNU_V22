package oving2;

public class location {

    int x;
    int y;

    public void up(){
        x += 1;
    }

    public void down(){
        x -= 1;
    }

    public void left(){
        y -= 1;
    }

    public void right(){
        y += 1;
    }

    public int getX(){
        return x; 
    }

    public int getY(){
        return y;
    }

    @Override
    public String toString() {
        return "x pos:" + getX() + " y pos:" + getY();
    }


    public static void main(String[] args) {
        location loc = new location();
        loc.up();
        loc.up();
        loc.up();
        loc.down();
        loc.left();
        loc.left();
        loc.left();
        loc.right();
        System.out.println(loc.toString());
    }
}
