package pio.daw.Hugo.Encriptacion;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceHugo {
	
	private BasicPasswordEncryptor passwordEncryptor;
	
	public PwServiceHugo() {
		this.passwordEncryptor = new BasicPasswordEncryptor();
	}
	
	public String encriptarContrasena (String contrasena) {
		return passwordEncryptor.encryptPassword(contrasena);
	}
	
	public boolean verificarContrasena (String contrasena, String contrasenaEncriptada) {
		return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
	}
	
}
