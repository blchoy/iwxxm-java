//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeSeaConditionPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeSeaConditionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://icao.int/iwxxm/2023-1}AerodromeSeaCondition"/&gt;
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
@XmlType(name = "AerodromeSeaConditionPropertyType", propOrder = {
    "aerodromeSeaCondition"
})
@XmlSeeAlso({
    icao.iwxxm.MeteorologicalAerodromeObservationType.SeaCondition.class
})
public class AerodromeSeaConditionPropertyType {

    @XmlElement(name = "AerodromeSeaCondition", required = true)
    protected AerodromeSeaConditionType aerodromeSeaCondition;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the aerodromeSeaCondition property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeSeaConditionType }
     *     
     */
    public AerodromeSeaConditionType getAerodromeSeaCondition() {
        return aerodromeSeaCondition;
    }

    /**
     * Sets the value of the aerodromeSeaCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeSeaConditionType }
     *     
     */
    public void setAerodromeSeaCondition(AerodromeSeaConditionType value) {
        this.aerodromeSeaCondition = value;
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
