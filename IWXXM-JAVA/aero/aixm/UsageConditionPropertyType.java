//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package aero.aixm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageConditionPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageConditionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractUsageCondition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageConditionPropertyType", propOrder = {
    "abstractUsageCondition"
})
public class UsageConditionPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "AbstractUsageCondition", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractUsageConditionType> abstractUsageCondition;

    /**
     * Gets the value of the abstractUsageCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractUsageConditionType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractUsageConditionType> getAbstractUsageCondition() {
        return abstractUsageCondition;
    }

    /**
     * Sets the value of the abstractUsageCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApronAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ManoeuvringAreaUsageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractUsageConditionType }{@code >}
     *     
     */
    public void setAbstractUsageCondition(JAXBElement<? extends AbstractUsageConditionType> value) {
        this.abstractUsageCondition = value;
    }

}
