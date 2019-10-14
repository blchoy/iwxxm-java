//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:55:23 AM UTC 
//


package def.wmo.opm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticalQualifierPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticalQualifierPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://def.wmo.int/opm/2013}StatisticalQualifier"/&gt;
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
@XmlType(name = "StatisticalQualifierPropertyType", propOrder = {
    "statisticalQualifier"
})
public class StatisticalQualifierPropertyType {

    @XmlElement(name = "StatisticalQualifier", required = true)
    protected StatisticalQualifierType statisticalQualifier;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the statisticalQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticalQualifierType }
     *     
     */
    public StatisticalQualifierType getStatisticalQualifier() {
        return statisticalQualifier;
    }

    /**
     * Sets the value of the statisticalQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticalQualifierType }
     *     
     */
    public void setStatisticalQualifier(StatisticalQualifierType value) {
        this.statisticalQualifier = value;
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
