package org.od;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class labJSON {
  public static int PRETTY_PRINT_IDENT_FACTOR = 2;

  public static String XML_STRING_MENU_DESAYUNO =
    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
      "<menu_desayuno>" +
        "<opcion>" +
          "<nombre>PanCakes</nombre>" +
          "<valor>$2,95</valor>" +
          "<descripcion>" +
            "Lithuanian Pancake Recipe - Blynai or Sklindzian" +
          "</descripcion>" +
          "<kcal>500</kcal>" +
        "</opcion>" +
        "<opcion>" +
          "<nombre>Belgian Waffles</nombre>" +
          "<valor>$5.95</valor>" +
          "<descripcion>" +
            "Two of our famous Belgian Waffles with plenty of real maple syrup" +
          "</descripcion>" +
          "<kcal>650</kcal>" +
        "</opcion>" +
        "<opcion>" +
          "<nombre>Strawberry Belgian Waffles</nombre>" +
          "<valor>$7.95</valor>" +
          "<descripcion>" +
            "Light Belgian waffles covered with strawberries and whipped cream" +
          "</descripcion>" +
          "<kcal>900</kcal>" +
        "</opcion>" +
      "</menu_desayuno>";

  public static String XML_STRING_LIBROS =
    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
      "<catalog>" +
        "<book id=\"bk101\">" +
          "<author>Gambardella, Matthew</author>" +
          "<title>XML Developer's Guide</title>" +
          "<genre>Computer</genre>" +
          "<price>44.95</price>" +
          "<publish_date>2000-10-01</publish_date>" +
          "<description>An in-depth look at creating applications with XML.</description>" +
        "</book>" +
        "<book id=\"bk102\">" +
          "<author>Ralls, Kim</author>" +
          "<title>Midnight Rain</title>" +
          "<genre>Fantasy</genre>" +
          "<price>5.95</price>" +
          "<publish_date>2000-12-16</publish_date>" +
          "<description>" +
            "A former architect battles corporate zombies, an evil sorceress, and her own childhood to become queen of the world." +
          "</description>" +
        "</book>" +
        "<book id=\"bk103\">" +
          "<author>Corets, Eva</author>" +
          "<title>Maeve Ascendant</title>" +
          "<genre>Fantasy</genre>" +
          "<price>5.95</price>" +
          "<publish_date>2000-11-17</publish_date>" +
          "<description>" +
            "After the collapse of a nanotechnology society in England, the young survivors lay the foundation for a new society." +
          "</description>" +
        "</book>" +
        "<book id=\"bk104\">" +
          "<author>Corets, Eva</author>" +
          "<title>Oberon's Legacy</title>" +
          "<genre>Fantasy</genre>" +
          "<price>5.95</price>" +
          "<publish_date>2001-03-10</publish_date>" +
          "<description>" +
            "In post-apocalypse England, the mysterious agent known only as Oberon helps to create a new life for the inhabitants of London. Sequel to Maeve Ascendant." +
          "</description>" +
        "</book>" +
      "</catalog>";

  public static void main(String[] argumentos) {
    try {
      JSONObject jsonObject = XML.toJSONObject(XML_STRING_MENU_DESAYUNO);
      System.out.println(jsonObject.toString(PRETTY_PRINT_IDENT_FACTOR));

      jsonObject = XML.toJSONObject(XML_STRING_LIBROS);
      System.out.println(jsonObject.toString(PRETTY_PRINT_IDENT_FACTOR));
    } catch(JSONException jsonException) {
      System.err.println(jsonException.toString());
    }
  }
}
