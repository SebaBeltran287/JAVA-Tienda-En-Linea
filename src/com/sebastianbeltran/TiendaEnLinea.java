package com.sebastianbeltran;

public class TiendaEnLinea {
	   public static void main(String[] args) {
	       // VARIABLES DE LA TIENDA
	       // Mensajes de la aplicación
	       String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
	       String mensajeConfirmacion = ", tu pedido ha sido confirmado";
	       String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
	       String mensajeMostrarTotal = "El total de tu compra es: $";
	      
	       // Variables de productos (agrega las tuyas a continuación)
	       double precioLibro = 15.99;
	       double precioCamiseta = 25.50;
	       double precioPantalon = 20.00;
	       double precioZapatos = 50.00;
	  
	       // Variables de clientes (agrega las tuyas a continuación)
	       String cliente1 = "Ana";
	       String cliente2 = "Alex";
	       String cliente3 = "Miguel";
	  
	       // Estado de pedidos (agrega las tuyas a continuación)
	       boolean pedidoConfirmadoCliente1 = true;
	       boolean pedidoConfirmadoCliente2 = true;
	       boolean pedidoConfirmadoCliente3 = false;
	  
	       // INTERACCIÓN DE LA APLICACIÓN
	       System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
	       // ** Aquí irán las declaraciones de impresión relacionadas con la interacción del cliente ** //
	       
	       if (pedidoConfirmadoCliente1) {
	    	   System.out.println(cliente1 + mensajeConfirmacion);
	       } else {
	    	   System.out.println(cliente1 + mensajeRechazo);
	       }
	       
	       double totalMiguel = precioZapatos + precioLibro;
	       System.out.println(mensajeMostrarTotal + totalMiguel);
	       if (pedidoConfirmadoCliente3) {
	           System.out.println(cliente3 + mensajeConfirmacion);
	       } else {
	           System.out.println(cliente3 + mensajeRechazo);
	       }

	       // Alex ha comprado 2 pares de zapatos, una camiseta y unos pantalones
	       double totalAlex = (2 * precioZapatos) + precioCamiseta + precioPantalon;
	       System.out.println(mensajeMostrarTotal + totalAlex);
	       if (pedidoConfirmadoCliente2) {
	           System.out.println(cliente2 + mensajeConfirmacion);
	       } else {
	           System.out.println(cliente2 + mensajeRechazo);
	       }

	       // Miguel se dio cuenta que le cobraron unos pantalones y una camiseta por error
	       double totalMiguelConError = totalMiguel + precioPantalon + precioCamiseta;
	       double diferencia = totalMiguelConError - totalMiguel;
	       System.out.println("Nuevo total corregido para " + cliente3 + ": " + mensajeMostrarTotal + totalMiguel);
	       System.out.println("La diferencia entre el pedido incorrecto y el correcto es: $" + diferencia);
	       
	       
	   }
	}