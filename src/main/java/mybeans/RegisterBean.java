package mybeans;

import businessLogic.BLFacade;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.context.FacesContext;

@ManagedBean(name = "registerBean")
@RequestScoped
public class RegisterBean {

    private String username;
    private String password;
    private String email;

    private BLFacade bl;

    public RegisterBean() {
        System.out.println(">>> RegisterBean sortu da");
        bl = FacadeBean.getBusinessLogic();
    }

    // GETTERS/SETTERS
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    //===========================
    //   ERREGISTRO METODOA
    //===========================
    public String register() {

        System.out.println("=== ERREGISTROA HASITA ===");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("email    = " + email);

        //=== Balidazioa ===
        if (isEmpty(username) || isEmpty(password) || isEmpty(email)) {
            addMessage("Eremu guztiak derrigorrezkoak dira.");
            return null;
        }

        try {
            // Logika deitzen dugu
            bl.registerUser(username, password, email);

        } catch (Exception e) {

            System.out.println(">>> ERROREA registerUser-en: " + e.getMessage());

            addMessage("Errorea: erabiltzailea existitzen da edo DB arazoa.");
            return null;
        }

        //=== Ongi eginda: login-era
        addMessage("Erabiltzailea ongi sortu da! Saioa hasi.");
        return "Login?faces-redirect=true";
    }


    //===========================
    //   LAGUNTZA METODOAK
    //===========================
    private boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    private void addMessage(String text) {
        FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(text));
    }
}
