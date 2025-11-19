package eredua.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.primefaces.event.SelectEvent;

import businessLogic.BLFacade;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

@Named("login")
@ApplicationScoped
public class LoginBean implements Serializable {
	private String izena;
	private String pasahitza;
	private BLFacade facadeBL;
		
	/*public LoginBean() {
		motak.add(new ErabiltzailearenMota(1,"ikaslea"));
		motak.add(new ErabiltzailearenMota(2,"irakaslea"));
	}*/
	
	/*public List<ErabiltzailearenMota> getMotak() {
		return motak;
	}*/
	
	public LoginBean() {
		facadeBL=FacadeBean.getBusinessLogic();
	}
	
	

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public String egiaztatu() {
		if (izena.length()!=pasahitza.length()){
			 FacesContext.getCurrentInstance().addMessage(null,
			 new FacesMessage("Errorea: izenaren eta pasahitzaren luzera desberdinak dira."));
			 return null;
		}
		return "ok";
	}
	
	

}