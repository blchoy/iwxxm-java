//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:55:23 AM UTC 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElevatedCurvePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElevatedCurvePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}ElevatedCurve"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedCurvePropertyType", propOrder = {
    "elevatedCurve"
})
public class ElevatedCurvePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ElevatedCurve", required = true)
    protected ElevatedCurveType elevatedCurve;

    /**
     * Gets the value of the elevatedCurve property.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedCurveType }
     *     
     */
    public ElevatedCurveType getElevatedCurve() {
        return elevatedCurve;
    }

    /**
     * Sets the value of the elevatedCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedCurveType }
     *     
     */
    public void setElevatedCurve(ElevatedCurveType value) {
        this.elevatedCurve = value;
    }

}
