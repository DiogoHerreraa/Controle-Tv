package entitites;

public class Controlador {

    private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public Controlador(int volume,boolean ligado,boolean tocando ) {
		
		this.volume=volume;
		ligado=false;
		tocando=false;
	}
	
	// getters and setters to volume
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
	}
	
	//getters and setters to turn on(ligado)
	public boolean getLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		
		this.ligado=ligado;
		}
	
	// getters and setters playing the sound
	
	public boolean getTocando() {
		return tocando;
	}
	
	public void setTocando(boolean tocando) {
		this.tocando=tocando;
	}
	
	
	public void ligar() {
		this.setLigado(true);
	}
	
	public void desligar() {
		this.setLigado(false);
	}
	
	public void abrirMenu() {
		
		System.out.println("Está ligado ?"+ this.getLigado());
		System.out.println("Está tocando ? "+ this.getTocando());
		System.out.println("Volume : "+this.getVolume());
		
		for(int i=0;i<this.getVolume();i+=10) {
			
			System.out.print("|");
		}
	}
	
	public void fecharMenu() {
		System.out.println("Fechando menu...");
		
	}
	 // aumentar o volume
	public void maisVolume() {
		if(this.getLigado()==true) {
			this.volume+=1; // poderia por getVolume() + 1;
		}
		else {
		}
	}
	
	// abaixar o volume
	public void menosVolume() {
		if(this.getLigado()==true) {
			this.volume-=1; // poderia por getVolume() -1 ;
		}
		else {
			
		}
		
	}
	
	// ligar o mudo
	public void ligarMudo() {
		if(this.ligado==true && this.volume>0) {
			this.volume=0; // poderia por setVolume(0);
		}
     }
	
	// desligar o mudo
	public void desligarMudo() {
		if(this.ligado=true && this.volume==0) {
			this.volume=20;// poderia por setVolume(20);
		}
		
	}
	
	public void play() {
		if(this.ligado==true && this.tocando ==true) {
			this.setTocando(true);
		}
		
	}
	
	public void pause() {
		if(this.ligado=true && tocando==false) {
			this.setTocando(false);
		}
	}
	
}
