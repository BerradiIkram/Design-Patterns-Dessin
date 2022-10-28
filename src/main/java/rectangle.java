public class rectangle extends Dessin{
    Double largdeur;
    Double hauteur;
    @Override
    public Double surface() {
        return this.hauteur*this.largdeur;
    }

    @Override
    Double perimetre() {
        return (this.hauteur*this.largdeur)*(this.hauteur*this.largdeur);
    }

    @Override
    public void update(Observable observable) {
        System.out.println("etat changed");
    }
}
