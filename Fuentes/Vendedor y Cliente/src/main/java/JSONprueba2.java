import org.od.Cliente;
import org.od.Vendedor;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public class JSONprueba2 {
  public static int SANGRIA = 2;

  public static void main(String[] args) {
    List<Vendedor> vendedores  = new ArrayList<Vendedor>();

    {
      final Vendedor v1 = new Vendedor();
      v1.setNombre("Juan");
      v1.setApellido("Perez");
      v1.setEdad(10);

      vendedores.add(v1);

      final Cliente c1 = new Cliente();
      c1.setNombre("HIVYMAR");
      c1.setDirección("Victor Emilio Estrada 204");
      c1.setTeléfono("5020800");

      final Cliente c2 = new Cliente();
      c2.setNombre("PROMESA");
      c2.setDirección("Via. Daule KM 5.5");
      c2.setTeléfono("5013604");

      {
        final List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);

        v1.setClientes(clientes);
      }
    }

    {
      final List<Cliente> clientes = new ArrayList<Cliente>();

      final Vendedor v2 = new Vendedor();
      v2.setNombre("Vendedor");
      v2.setApellido("Estrella");
      v2.setEdad(15);

      vendedores.add(v2);
      v2.setClientes(clientes);

      {
        final Cliente c1 = new Cliente();
        c1.setNombre("Buen Cliente");
        c1.setDirección("Casa de camino a la paz");
        c1.setTeléfono("1236547");

        clientes.add(c1);
      }

      {
        final Cliente c2 = new Cliente();
        c2.setNombre("Pablito Clavó un Clavito");
        c2.setDirección("¿ dónde clavó el clavito Pablito ?");
        c2.setTeléfono("9874563");

        clientes.add(c2);
      }
    }

    {
      final Vendedor vendedor = new Vendedor();
      vendedor.setNombre("Vendedor");
      vendedor.setApellido("Novedoso");
      vendedor.setEdad(1);

      vendedores.add(vendedor);

      {
        final List<Cliente> clientes = new ArrayList<Cliente>();
        vendedor.setClientes(clientes);
      }

      {
        final Cliente cliente = new Cliente();
        cliente.setNombre("Primer Cliente");
        cliente.setDirección("Allí donde nace el río.");
        cliente.setTeléfono("5957515");

        vendedor.getClientes().add(cliente);
      }

      {
        final Cliente cliente = new Cliente();
        cliente.setNombre("Cliente Arriesgado");
        cliente.setDirección("La casa Azul");
        cliente.setTeléfono("9632587");

        vendedor.getClientes().add(cliente);
      }
    }

    try {
      final JSONArray listaVendedores = new JSONArray(vendedores);
      System.out.println(listaVendedores.toString(SANGRIA));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}