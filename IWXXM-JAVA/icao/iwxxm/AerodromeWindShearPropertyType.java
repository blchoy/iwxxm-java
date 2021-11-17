//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeWindShearPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeWindShearPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://icao.int/iwxxm/2021-2}AerodromeWindShear"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeWindShearPropertyType", propOrder = {
    "aerodromeWindShear"
})
@XmlSeeAlso({
    icao.iwxxm.MeteorologicalAerodromeObservationType.WindShear.class
})
public class AerodromeWindShearPropertyType {

    @XmlElement(name = "AerodromeWindShear", required = true)
    protected AerodromeWindShearType aerodromeWindShear;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the aerodromeWindShear property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeWindShearType }
     *     
     */
    public AerodromeWindShearType getAerodromeWindShear() {
        return aerodromeWindShear;
    }

    /**
     * Sets the value of the aerodromeWindShear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeWindShearType }
     *     
     */
    public void setAerodromeWindShear(AerodromeWindShearType value) {
        this.aerodromeWindShear = value;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

}
