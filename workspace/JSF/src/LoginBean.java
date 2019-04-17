import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String login;
	private String senha;
	private boolean termo;
	
	public String logar() {
		if(login.equals("ale") && senha.equals("123")) {
			System.out.println("Usuario logado: "+getLogin());
			System.out.println(isTermo());
			return "carrinho?faces-redirect=true";
		}else {
			System.out.println("Usuario inválido");
			FacesMessage mensagem = new FacesMessage("Usuario inválido!");
			FacesMessage mensagem2 = new FacesMessage("Senha inválida!");
			FacesContext.getCurrentInstance().addMessage( null , mensagem);
			FacesContext.getCurrentInstance().addMessage( null , mensagem2);
			return "login";
		}
		
	}
	
	public boolean isTermo() {
		return termo;
	}
	public void setTermo(boolean termo) {
		this.termo = termo;
	}
	public LoginBean() {
		super();
	}
	public LoginBean(String login, String senha, boolean termo) {
		super();
		this.login = login;
		this.senha = senha;
		this.termo = termo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
