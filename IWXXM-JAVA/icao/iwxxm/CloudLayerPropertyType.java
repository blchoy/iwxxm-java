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
 * <p>Java class for CloudLayerPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloudLayerPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://icao.int/iwxxm/2.1}CloudLayer"/&gt;
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
@XmlType(name = "CloudLayerPropertyType", propOrder = {
    "cloudLayer"
})
@XmlSeeAlso({
    icao.iwxxm.AerodromeCloudForecastType.Layer.class,
    icao.iwxxm.AerodromeObservedCloudsType.Layer.class
})
public class CloudLayerPropertyType {

    @XmlElement(name = "CloudLayer", required = true)
    protected CloudLayerType cloudLayer;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the cloudLayer property.
     * 
     * @return
     *     possible object is
     *     {@link CloudLayerType }
     *     
     */
    public CloudLayerType getCloudLayer() {
        return cloudLayer;
    }

    /**
     * Sets the value of the cloudLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloudLayerType }
     *     
     */
    public void setCloudLayer(CloudLayerType value) {
        this.cloudLayer = value;
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
