//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.AbstractObjectType;


/**
 * Description of the spatial and temporal reference systems used in the dataset
 * 
 * <p>Java class for AbstractRS_ReferenceSystem_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRS_ReferenceSystem_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gmd}RS_Identifier_PropertyType"/&gt;
 *         &lt;element name="domainOfValidity" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRS_ReferenceSystem_Type", propOrder = {
    "name",
    "domainOfValidity"
})
public abstract class AbstractRSReferenceSystemType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected RSIdentifierPropertyType name;
    protected List<EXExtentPropertyType> domainOfValidity;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link RSIdentifierPropertyType }
     *     
     */
    public RSIdentifierPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSIdentifierPropertyType }
     *     
     */
    public void setName(RSIdentifierPropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the domainOfValidity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainOfValidity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainOfValidity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXExtentPropertyType }
     * 
     * 
     */
    public List<EXExtentPropertyType> getDomainOfValidity() {
        if (domainOfValidity == null) {
            domainOfValidity = new ArrayList<EXExtentPropertyType>();
        }
        return this.domainOfValidity;
    }

}
