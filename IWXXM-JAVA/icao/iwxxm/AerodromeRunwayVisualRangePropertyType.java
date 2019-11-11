//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeRunwayVisualRangePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeRunwayVisualRangePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://icao.int/iwxxm/3.0}AerodromeRunwayVisualRange"/&gt;
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
@XmlType(name = "AerodromeRunwayVisualRangePropertyType", propOrder = {
    "aerodromeRunwayVisualRange"
})
@XmlSeeAlso({
    icao.iwxxm.MeteorologicalAerodromeObservationType.Rvr.class
})
public class AerodromeRunwayVisualRangePropertyType {

    @XmlElement(name = "AerodromeRunwayVisualRange", required = true)
    protected AerodromeRunwayVisualRangeType aerodromeRunwayVisualRange;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the aerodromeRunwayVisualRange property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeRunwayVisualRangeType }
     *     
     */
    public AerodromeRunwayVisualRangeType getAerodromeRunwayVisualRange() {
        return aerodromeRunwayVisualRange;
    }

    /**
     * Sets the value of the aerodromeRunwayVisualRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeRunwayVisualRangeType }
     *     
     */
    public void setAerodromeRunwayVisualRange(AerodromeRunwayVisualRangeType value) {
        this.aerodromeRunwayVisualRange = value;
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
