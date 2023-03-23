package servlet;

import clasesNaves.Atat;
import clasesNaves.Nave;
import clasesNaves.Supremacy;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "servletito", urlPatterns = {"/servletito"})
public class servletito extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        int capacidad = Integer.parseInt(request.getParameter("capacidad"));
        double parsec = Double.parseDouble(request.getParameter("parsec"));
        double recorrido = Double.parseDouble(request.getParameter("recorrido"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        
        String nombre2 = request.getParameter("nombre2");
        int capacidad2 = Integer.parseInt(request.getParameter("capacidad2"));
        double parsec2 = Double.parseDouble(request.getParameter("parsec2"));
        double recorrido2 = Double.parseDouble(request.getParameter("recorrido2"));
        int cantidad2 = Integer.parseInt(request.getParameter("cantidad2"));
        String nombre3 = request.getParameter("nombre3");
        int capacidad3 = Integer.parseInt(request.getParameter("capacidad3"));
        double parsec3 = Double.parseDouble(request.getParameter("parsec3"));
        double recorrido3 = Double.parseDouble(request.getParameter("recorrido3"));
        int cantidad3 = Integer.parseInt(request.getParameter("cantidad3"));
        
        String nombre4 = request.getParameter("nombre4");
        int capacidad4 = Integer.parseInt(request.getParameter("capacidad4"));
        double parsec4 = Double.parseDouble(request.getParameter("parsec4"));
        double recorrido4 = Double.parseDouble(request.getParameter("recorrido4"));
        int cantidad4 = Integer.parseInt(request.getParameter("cantidad4"));
        int navecitas = Integer.parseInt(request.getParameter("navecitas"));
        String nombre5 = request.getParameter("nombre5");
        int capacidad5 = Integer.parseInt(request.getParameter("capacidad5"));
        double parsec5 = Double.parseDouble(request.getParameter("parsec5"));
        double recorrido5 = Double.parseDouble(request.getParameter("recorrido5"));
        int cantidad5 = Integer.parseInt(request.getParameter("cantidad5"));
        
        double total = 0;
        
        Nave halconMilenario = new Nave(nombre, capacidad, parsec, recorrido, cantidad);
        Nave destructorEstelar = new Nave(nombre2, capacidad2, parsec2, recorrido2, cantidad2);
        Nave lanzaderaImperial = new Nave(nombre3, capacidad3, parsec3, recorrido3, cantidad3);        
        Supremacy supremacy = new Supremacy(nombre4, capacidad4, parsec4, recorrido4, cantidad4, navecitas);
        Atat atAt = new Atat(nombre5, capacidad5, parsec5, recorrido5, cantidad5);
        
        halconMilenario.mostrarDatos();
        destructorEstelar.mostrarDatos();
        lanzaderaImperial.mostrarDatos();
        supremacy.mostrarDatos();
        atAt.mostrarDatos();
        
        total = halconMilenario.calcularCombustible(parsec) + destructorEstelar.calcularCombustible(parsec2) + lanzaderaImperial.calcularCombustible(parsec3) + supremacy.calcularCombustible(parsec4, recorrido4, cantidad4) + atAt.calcularCombustible(parsec5, recorrido5, cantidad5);
        
        request.getSession().setAttribute("HM", halconMilenario);
        request.getSession().setAttribute("DE", destructorEstelar);
        request.getSession().setAttribute("LI", lanzaderaImperial);
        request.getSession().setAttribute("SU", supremacy);
        request.getSession().setAttribute("AT", atAt);
        request.getSession().setAttribute("tot", total);
        
        response.sendRedirect("salida.jsp");
    }
    
}
