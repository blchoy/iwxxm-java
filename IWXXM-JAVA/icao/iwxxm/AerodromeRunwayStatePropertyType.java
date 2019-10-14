//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:52:52 AM UTC 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeRunwayStatePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeRunwayStatePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://icao.int/iwxxm/2.1}AerodromeRunwayState"/&gt;
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
@XmlType(name = "AerodromeRunwayStatePropertyType", propOrder = {
    "aerodromeRunwayState"
})
public class AerodromeRunwayStatePropertyType {

    @XmlElement(name = "AerodromeRunwayState", required = true)
    protected AerodromeRunwayStateType aerodromeRunwayState;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the aerodromeRunwayState property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeRunwayStateType }
     *     
     */
    public AerodromeRunwayStateType getAerodromeRunwayState() {
        return aerodromeRunwayState;
    }

    /**
     * Sets the value of the aerodromeRunwayState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeRunwayStateType }
     *     
     */
    public void setAerodromeRunwayState(AerodromeRunwayStateType value) {
        this.aerodromeRunwayState = value;
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
