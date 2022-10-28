public class rectangle extends Dessin{
    Double largeur;
    Double hauteur;

    public rectangle(String name,Double largeur, Double hauteur) {
        super(name);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void show() {

        System.out.println(tab()+name+"largeur"+largeur+"hauteur"+hauteur);

    }

    @Override
    public Double surface() {
        return this.hauteur*this.largeur;
    }

    @Override
    Double perimetre() {
        return (this.hauteur*this.largeur)*(this.hauteur*this.largeur);
    }

    @Override
    public void update(Observable observable) {
        System.out.println("rectongle changed");
    }


}
