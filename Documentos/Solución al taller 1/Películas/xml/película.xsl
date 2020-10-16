<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <!--
    De "https://www.tutorialspoint.com/xml/xml_cdata_sections.htm":

    "[...] The term CDATA means, Character Data. CDATA is defined as blocks of
    text that are not parsed by the parser, but are otherwise recognized as
    markup."

    "[...] By using CDATA section, you are commanding the parser that the
    particular section of the document contains no markup and should be treated
    as regular text."
  -->
  <![CDATA[
    Aquí hay un ejemplo que permite incrustar links e imágenes en un fichero XML,
    utiliza una plantilla general al primer nivel (match="/"), y ordenada por
    título.
  ]]>

  <xsl:template match="/">
    <html>
      <head>
        <title>Formateando con XSLT</title>
        <style>body,td{font-family:verdana;font-size:10px}</style>
      </head>
      <body>
        <table cellspacing="0" cellpadding="10" align="center" width="300">
          <xsl:for-each select="trailers/película">
            <xsl:sort select="titulo" order="ascending" />

            <tr>
              <td bgcolor="yellow" valign="top">
                <!--aqui va la imagen-->
                <img width="134" height="193">
                  <xsl:attribute name='src'>
                    <xsl:value-of select="cartel"/>
                  </xsl:attribute>
                </img>
                <!--fin de la imagen-->
              </td>
              <td bgcolor="yellow" valign="top">
                <!--aqui va el enlace-->
                <p>
                  <b>
                    <font size="2">
                      <a>
                        <xsl:attribute name="href">
                          <xsl:value-of select="url"/>
                        </xsl:attribute>
                        <xsl:attribute name="title">
                          Pulsa para ver el trailer de <xsl:value-of select="titulo"/>
                        </xsl:attribute>
                        <xsl:value-of select="titulo"/>
                      </a>
                    </font>
                  </b><!--fin del enlace-->
                </p>
                <p>Género: <xsl:value-of select="género"/></p>
                <p><xsl:value-of select="tema"/></p>
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
