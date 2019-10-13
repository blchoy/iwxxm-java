//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.09 at 01:48:28 AM UTC 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeObservedCloudsPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeObservedCloudsPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://icao.int/iwxxm/2.1}AerodromeObservedClouds"/&gt;
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
@XmlType(name = "AerodromeObservedCloudsPropertyType", propOrder = {
    "aerodromeObservedClouds"
})
@XmlSeeAlso({
    icao.iwxxm.MeteorologicalAerodromeObservationRecordType.Cloud.class
})
public class AerodromeObservedCloudsPropertyType {

    @XmlElement(name = "AerodromeObservedClouds", required = true)
    protected AerodromeObservedCloudsType aerodromeObservedClouds;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the aerodromeObservedClouds property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeObservedCloudsType }
     *     
     */
    public AerodromeObservedCloudsType getAerodromeObservedClouds() {
        return aerodromeObservedClouds;
    }

    /**
     * Sets the value of the aerodromeObservedClouds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeObservedCloudsType }
     *     
     */
    public void setAerodromeObservedClouds(AerodromeObservedCloudsType value) {
        this.aerodromeObservedClouds = value;
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
