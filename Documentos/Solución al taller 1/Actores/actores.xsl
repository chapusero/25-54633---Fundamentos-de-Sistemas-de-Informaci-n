<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <h2>Lista de Actores</h2>
        <table border="1">
          <tr bgcolor="#9acd32">
            <th>Nombre del actor</th>
            <th>Nacimiento</th>
            <th>País</th>
            <th>Película</th>
            <th>Calificación</th>
          </tr>
          <xsl:for-each select="actores/actor">
            <tr>
              <td>
                <xsl:value-of select="nombre" />
              </td>
              <td>
                <xsl:value-of select="nacimiento" />
              </td>
              <td>
                <xsl:value-of select="pais" />
              </td>
              <td>
                <xsl:value-of select="pelicula" />
              </td>
              <td style="text-align: right;">
                <xsl:value-of select="calificacion" />
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
