//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefinitionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefinitionBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}metaDataProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}descriptionReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}identifier"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinitionBaseType")
@XmlSeeAlso({
    DefinitionType.class
})
public class DefinitionBaseType
    extends AbstractGMLType
{


}
