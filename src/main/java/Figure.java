import java.util.ArrayList;
import java.util.List;

public class Figure extends Dessin{
    private List<Dessin> childs=new ArrayList<>();

    public Figure(String name) {
        super(name);
    }

    public Dessin addFigure(Dessin dessin){
        dessin.level=this.level+1;
        childs.add(dessin);
        return dessin;
    }

    @Override
    public void show() {
        System.out.println(tab()+"Figure:"+name);
        for(Dessin c:childs){
            c.show();
        }
    }

    @Override
    Double surface() {
        return null;
    }

    @Override
    Double perimetre() {
        return null;
    }

    @Override
    void update(Observable observable) {

    }

}
