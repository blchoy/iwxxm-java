//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CirclingRestrictionPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CirclingRestrictionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}CirclingRestriction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CirclingRestrictionPropertyType", propOrder = {
    "circlingRestriction"
})
public class CirclingRestrictionPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "CirclingRestriction", required = true)
    protected CirclingRestrictionType circlingRestriction;

    /**
     * Gets the value of the circlingRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link CirclingRestrictionType }
     *     
     */
    public CirclingRestrictionType getCirclingRestriction() {
        return circlingRestriction;
    }

    /**
     * Sets the value of the circlingRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CirclingRestrictionType }
     *     
     */
    public void setCirclingRestriction(CirclingRestrictionType value) {
        this.circlingRestriction = value;
    }

}