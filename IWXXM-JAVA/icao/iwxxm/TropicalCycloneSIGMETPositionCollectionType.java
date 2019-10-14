//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:55:23 AM UTC 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.PointPropertyType;


/**
 * <p>Java class for TropicalCycloneSIGMETPositionCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TropicalCycloneSIGMETPositionCollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://icao.int/iwxxm/3.0}SIGMETPositionCollectionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tropicalCyclonePosition" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="tropicalCycloneId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TropicalCycloneSIGMETPositionCollectionType", propOrder = {
    "rest"
})
public class TropicalCycloneSIGMETPositionCollectionType
    extends SIGMETPositionCollectionType
{

    @XmlElementRefs({
        @XmlElementRef(name = "tropicalCyclonePosition", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extension", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;
    @XmlAttribute(name = "tropicalCycloneId", required = true)
    protected String tropicalCycloneId;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Extension" is used by two different parts of a schema. See: 
     * line 62 of http://schemas.wmo.int/iwxxm/3.0/sigmet.xsd
     * line 444 of http://schemas.wmo.int/iwxxm/3.0/sigmet.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtensionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

    /**
     * Gets the value of the tropicalCycloneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTropicalCycloneId() {
        return tropicalCycloneId;
    }

    /**
     * Sets the value of the tropicalCycloneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTropicalCycloneId(String value) {
        this.tropicalCycloneId = value;
    }

}
