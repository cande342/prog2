/* public class Capitulo {
    
    private String title;
    private String description;
    private boolean flag;
    private int calification ;
    private final int MAXCALIFICATION = 5;


    public Capitulo(){
        this.title = "random";
        this.description="ajajaja";
        this.calification = -1;
        this.flag = false;
    }
    //Ingresar la calificación de un episodio. Si el valor ingresado como calificación
    //no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.

    public void setCalification(int calification){
        if(calification>=1 && calification <= MAXCALIFICATION){
            this.calification = calification;
            this.flag = true;
        } else {
            System.out.println("La calificación del caítulo sólo puede ir de 1 a " + MAXCALIFICATION);
        }

    }

    public boolean getFlag(){
        return flag;
    }

    public void setFlag(){
        this.flag=true;
    }

    public int getCalification(){
        return calification;
    }


} */
