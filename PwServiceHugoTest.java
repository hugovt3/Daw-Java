package pio.daw.Hugo.Encriptacion;

public class PwServiceHugoTest {

	public static void main(String[] args) {
		PwServiceHugo servicio = new PwServiceHugo();
		String password = "miSuperPassword"; //Crear contraseña a encriptar
		String passwordEncriptada = servicio.encriptarContrasena(password); //Encriptar contraseña
		System.out.println("Prueba de alumno Hugo");
		System.out.println("La contraseña es: " + passwordEncriptada); //Mostrar contraseña encriptada
		
		//Vamos a verfificarlo
		boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
		System.out.println("La contraseña encriptada es válida: " + esValida); //Mostrar si la contraseña es válida

	}

}
