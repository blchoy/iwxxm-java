//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The TemporalDatumBaseType partially defines the origin of a temporal coordinate reference system. This type restricts the AbstractDatumType to remove the "anchorDefinition" and "realizationEpoch" elements.
 * 
 * <p>Java class for TemporalDatumBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemporalDatumBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractDatumType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}metaDataProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}descriptionReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}identifier"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}remarks" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "TemporalDatumBaseType")
@XmlSeeAlso({
    TemporalDatumType.class
})
public abstract class TemporalDatumBaseType
    extends AbstractDatumType
{


}
