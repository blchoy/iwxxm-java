//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationParameterGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationParameterGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralOperationParameterType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}maximumOccurs" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}parameter" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationParameterGroupType", propOrder = {
    "maximumOccurs",
    "parameter"
})
public class OperationParameterGroupType
    extends AbstractGeneralOperationParameterType
{

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumOccurs;
    @XmlElementRef(name = "parameter", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> parameter;

    /**
     * Gets the value of the maximumOccurs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumOccurs() {
        return maximumOccurs;
    }

    /**
     * Sets the value of the maximumOccurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumOccurs(BigInteger value) {
        this.maximumOccurs = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<JAXBElement<AbstractGeneralOperationParameterPropertyType>>();
        }
        return this.parameter;
    }

}
