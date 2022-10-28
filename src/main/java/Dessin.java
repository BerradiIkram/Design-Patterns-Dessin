public abstract class  Dessin   {
 protected String name;
 protected int level;
 public Traitement traitement;

 public Dessin(String name) {
  this.name = name;

 }

 public abstract void show();
 public String tab(){
  String tab="";
  for(int i=0;i<level; i++){
   tab+="\t";
  }
  return tab;
 }

 abstract Double surface();
abstract Double perimetre();
 abstract void update(Observable observable);

 public void setTraitement(Traitement traitement) {
  this.traitement = traitement;
 }
 public void apliquerTraiter()
 {
  traitement.traitement();
 }

}
