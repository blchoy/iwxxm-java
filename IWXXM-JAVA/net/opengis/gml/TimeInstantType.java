//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:52:52 AM UTC 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeInstantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInstantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeGeometricPrimitiveType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}timePosition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInstantType", propOrder = {
    "timePosition"
})
public class TimeInstantType
    extends AbstractTimeGeometricPrimitiveType
{

    @XmlElement(required = true)
    protected TimePositionType timePosition;

    /**
     * Gets the value of the timePosition property.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getTimePosition() {
        return timePosition;
    }

    /**
     * Sets the value of the timePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setTimePosition(TimePositionType value) {
        this.timePosition = value;
    }

}
