import java.lang.String;

public class Bomba{
  String status;
	boolean sts;
	int atual;
	public int maximo;
	public int minimo;

  //CONSTRUTOR
  public Bomba(){
    this.status="";
		atual = 0;
	  this.maximo = 5;
	  this.minimo = 0;
  }

public boolean bombaStatus(){ 
		if(sts = false){
		  status = new String("***Bomba Desligada");
		} else if(sts = true){
		  status = new String("***Bomba Ligada");
		}
    return sts;
  } 
}