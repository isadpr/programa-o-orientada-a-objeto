
public interface Voador {
	public abstract void levantarVoo(); //nao precisa ser necessariamente void
	public abstract void pousar();
	public abstract void voar();
	//String A; � public static final!!
}
/*IMPORTANTE!
todos os metodos na interface sao public abstract,  logo 
especificar isso � opcional
ex: void pousar() tambem esta correto
*/
