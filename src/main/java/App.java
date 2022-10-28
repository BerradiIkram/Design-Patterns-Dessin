public class App {
    public static void main(String[] args)  {

        Point p1=new Point(2,1);
        Point p2=new Point(0,1);
//Design pattern Composite
        Figure root=new Figure("f1");
        Figure figure=new Figure("f2");

        root.addFigure(figure);

        figure.addFigure(new cercles("cercle",p1,3.2));
        figure.addFigure(new rectangle("rectangle",4.3,4.2));

        root.addFigure(new cercles("cercle",p2,5.1));
        root.addFigure(new cercles("cercle",p2,2.3));
        root.show();
            // cercles c1=new cercles("cercle",p2,2.6);
       // root.serialise(c1);

      /*  System.out.println("La surface de cercle: "+c1.perimetre());
        System.out.println("La surface de cercle: "+c1.surface());

        rectangle r1=new rectangle("rectangle",8.6,4.6);
        System.out.println("Le perimetre du rect: "+r1.perimetre());
        System.out.println("La surface du rect: "+r1.surface());*/

        //Design pattern Observer

        ObservableImpl observable= new ObservableImpl();
        cercles c1=new cercles("cercles",p2,2.6);
        rectangle r1=new rectangle("rectengle",4.4,3.5);
        System.out.println("--------Changement d'état------");
        observable.setCouleurContour("black");
        observable.addObserver(c1);
        observable.addObserver(r1);
        observable.setEpaisseurContour(12);
        //Design pattern Strategy
        Point p3=new Point(0,1);
        Dessin dessin=new cercles("cercles",p3,2.9);
        dessin.setTraitement(new TraitementImpl());
        dessin.apliquerTraiter();
        dessin.setTraitement(new TraitementImpl());
        dessin.apliquerTraiter();
        dessin.setTraitement(new TraitementImpl1());
        dessin.apliquerTraiter();
    }




}
