package projet_tournoi;
import java.util.*;

/**
 * @author DELL
 * Une classe permetttant de creer un club
 *
 */
public class Club {
	private List<Equipe> equipe=new ArrayList<Equipe>();
	private Session session;
	/**
	 * Constructeur ? deux arguments(une liste dequipe et une liste de combat)
	 */
	public Club() {
		//this.equipe = null;
		//this.session = null;	
	}

	public List<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	}

	public Session getSession() {
		return session;
	}
	
	public void setSession(Session session) {
		this.session = session;
	}

	//fonction permettant d'ajouter une equipe qui re?oit en parametre une session
	public void creerEquipe() {
		
		Equipe equipe1=new Equipe();
		Equipe equipe2=new Equipe();
		List<Equipe> l=new ArrayList<Equipe>();
		l.add(equipe1);
		l.add(equipe2);
		this.setEquipe(l);	
	}
	//fonciton qu i permet de creer une session qui re ?oit en parametre une session 
	public void CreerSession() {
		this.setSession(new Session());
		
	}
	
	//fonciton qui permet de creer une liste 20 joueur
	public List<Joueur> tabJoueur(){
		List<Joueur> joueur =new ArrayList<Joueur>();
		for(int i=0;i<20;i++) {
			int p=40;
			Joueur J= new Joueur(i,"nom"+i,"prenom"+i,"adresse"+i,p,2021);
			joueur.add(J);
			p+=3;
			
		}
		return joueur;	
	}
	
	//fonciton qui permet de partager les 20 joueurs entre les deux equipe
	public void remplissageJoueurJoueur(Equipe equipe1, Equipe equipe2,Club club) {
		List<Joueur> joueur =new ArrayList<Joueur>();
		joueur=tabJoueur();
		for(int i=0;i<20;i++) {
			if(i<joueur.size()/2) {
				equipe1.getJoueur().add(joueur.get(0));
			}else {
				equipe2.getJoueur().add(joueur.get(1));
				
			}
			
		}
		
		
	}
}
