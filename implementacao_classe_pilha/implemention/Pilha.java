package implemention;

public class Pilha {

	private No refNoEntradaPilha;

	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public boolean isEmpty() {
		
		if(refNoEntradaPilha == null) {
			return true;
		}
		
		return false;
	}
	
}
