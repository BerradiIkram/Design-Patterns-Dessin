import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
private int EpaisseurContour;
private String couleurContour;
private String couleurRemplissage;

    private List<Dessin> dessins=new ArrayList<>();
    @Override
    public void addObserver(Dessin dessin) {
        dessins.add(dessin);
    }

    @Override
    public void removeObserver(Dessin dessin) {
        dessins.remove(dessin);

    }

    @Override
    public void notifyObservers() {
        for(Dessin o:dessins ){//pop
            o.update(this);}
    }


    public void setEpaisseurContour(int epaisseurContour) {
        EpaisseurContour = epaisseurContour;
        this.notifyObservers();
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
        this.notifyObservers();
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        this.notifyObservers();
    }

    public int getEpaisseurContour() {
        return EpaisseurContour;

    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }
}
