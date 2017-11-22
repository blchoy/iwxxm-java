//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 10:49:53 AM HKT 
//


package def.wmo.opm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="constraintProperty" type="{http://def.wmo.int/opm/2013}ObservablePropertyPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintType", propOrder = {
    "description",
    "constraintProperty"
})
@XmlSeeAlso({
    ScalarConstraintType.class,
    CategoryConstraintType.class,
    RangeConstraintType.class
})
public class ConstraintType {

    protected String description;
    @XmlElement(required = true)
    protected ObservablePropertyPropertyType constraintProperty;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the constraintProperty property.
     * 
     * @return
     *     possible object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public ObservablePropertyPropertyType getConstraintProperty() {
        return constraintProperty;
    }

    /**
     * Sets the value of the constraintProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservablePropertyPropertyType }
     *     
     */
    public void setConstraintProperty(ObservablePropertyPropertyType value) {
        this.constraintProperty = value;
    }

}