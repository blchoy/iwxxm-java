//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:55:23 AM UTC 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The gml:SequenceRuleType is derived from the gml:SequenceRuleEnumeration through the addition of an axisOrder attribute.  The gml:SequenceRuleEnumeration is an enumerated type. The rule names are defined in ISO 19123. If no rule name is specified the default is "Linear".
 * 
 * <p>Java class for SequenceRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceRuleType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opengis.net/gml/3.2&gt;SequenceRuleEnumeration"&gt;
 *       &lt;attribute name="order" type="{http://www.opengis.net/gml/3.2}IncrementOrder" /&gt;
 *       &lt;attribute name="axisOrder" type="{http://www.opengis.net/gml/3.2}AxisDirectionList" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRuleType", propOrder = {
    "value"
})
public class SequenceRuleType {

    @XmlValue
    protected SequenceRuleEnumeration value;
    @XmlAttribute(name = "order")
    protected String order;
    @XmlAttribute(name = "axisOrder")
    protected List<String> axisOrder;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRuleEnumeration }
     *     
     */
    public SequenceRuleEnumeration getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRuleEnumeration }
     *     
     */
    public void setValue(SequenceRuleEnumeration value) {
        this.value = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the axisOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisOrder() {
        if (axisOrder == null) {
            axisOrder = new ArrayList<String>();
        }
        return this.axisOrder;
    }

}
