public class cercles extends Dessin{
public Double rayon;
public Point center;

    public cercles(String name,Point center,Double rayon) {
        super(name);
        this.rayon = rayon;
        this.center = center;
    }

    @Override
    public void show() {
        System.out.println(tab()+name+"rayon"+this.rayon+"Center"+this.center);


    }

    @Override
    public Double surface() {

        return 3.14*(this.rayon)*(this.rayon);
    }

    @Override
    Double perimetre() {
        return 2*Math.PI*(this.rayon);
    }

    @Override
    void update(Observable observable) {
        this.center=new Point(0,0);
        System.out.println("++++cercles changed+++++");
        System.out.println("rayon"+this.rayon);
        System.out.println("Center"+this.center);
    }


}
