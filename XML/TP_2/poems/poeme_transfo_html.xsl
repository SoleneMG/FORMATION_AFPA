<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" 
				xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" 
			doctype-public="-//W3C//DTD HTML 4.01//EN"
			doctype-system="http://www.w3.org/TR/html4/strict.dtd" 
			version="4.01"/>

<xsl:template match="/">
<html>
	<head>
		<title><xsl:value-of select="poeme/titre" /></title>
	</head>
	<body>
		<h1><xsl:value-of select="poeme/titre" /></h1>		
		<xsl:if test = "poeme/auteur!=''">
			<h2>de <xsl:value-of select="poeme/auteur" /></h2>
		</xsl:if>
		<xsl:apply-templates select = "poeme/strophe" />
		<p><i>
		<xsl:choose>
			<xsl:when test="poeme/date = '' or count(poeme/date)=0">
				Date non connue				
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="poeme/date" />
			</xsl:otherwise>
		</xsl:choose>
		</i></p>		
	</body>
</html>
</xsl:template>

<xsl:template match="strophe">
	<p><xsl:apply-templates select="vers" /></p>
</xsl:template>

<xsl:template match="vers">
	<xsl:if test = "position() = 1">&#160;&#160;</xsl:if>
	<xsl:value-of select="." />
	<br/>
</xsl:template>

</xsl:stylesheet>