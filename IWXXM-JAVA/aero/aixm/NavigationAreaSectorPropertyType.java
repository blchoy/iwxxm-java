//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavigationAreaSectorPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavigationAreaSectorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}NavigationAreaSector"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavigationAreaSectorPropertyType", propOrder = {
    "navigationAreaSector"
})
public class NavigationAreaSectorPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NavigationAreaSector", required = true)
    protected NavigationAreaSectorType navigationAreaSector;

    /**
     * Gets the value of the navigationAreaSector property.
     * 
     * @return
     *     possible object is
     *     {@link NavigationAreaSectorType }
     *     
     */
    public NavigationAreaSectorType getNavigationAreaSector() {
        return navigationAreaSector;
    }

    /**
     * Sets the value of the navigationAreaSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationAreaSectorType }
     *     
     */
    public void setNavigationAreaSector(NavigationAreaSectorType value) {
        this.navigationAreaSector = value;
    }

}
