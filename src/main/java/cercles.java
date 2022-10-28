public class cercles extends Dessin{
public Double rayon;
public Point center;
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
        System.out.println("cercles changed");
    }
}
