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
 * <p>Java class for EquipmentUnavailableAdjustmentColumnPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentUnavailableAdjustmentColumnPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}EquipmentUnavailableAdjustmentColumn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentUnavailableAdjustmentColumnPropertyType", propOrder = {
    "equipmentUnavailableAdjustmentColumn"
})
public class EquipmentUnavailableAdjustmentColumnPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "EquipmentUnavailableAdjustmentColumn", required = true)
    protected EquipmentUnavailableAdjustmentColumnType equipmentUnavailableAdjustmentColumn;

    /**
     * Gets the value of the equipmentUnavailableAdjustmentColumn property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentUnavailableAdjustmentColumnType }
     *     
     */
    public EquipmentUnavailableAdjustmentColumnType getEquipmentUnavailableAdjustmentColumn() {
        return equipmentUnavailableAdjustmentColumn;
    }

    /**
     * Sets the value of the equipmentUnavailableAdjustmentColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentUnavailableAdjustmentColumnType }
     *     
     */
    public void setEquipmentUnavailableAdjustmentColumn(EquipmentUnavailableAdjustmentColumnType value) {
        this.equipmentUnavailableAdjustmentColumn = value;
    }

}
