//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
//


package net.opengis.om;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.ReferenceType;


/**
 *  Some observations depend on other observations to provide context which
 * 				is important, sometimes essential, in understanding the result. These dependencies
 * 				are stronger than mere spatiotemporal coincidences, requiring explicit
 * 				representation. If present, the association class ObservationContext (Figure 2)
 * 				shall link a OM_Observation to another OM_Observation, with the role name
 * 				relatedObservation for the target. 
 * 
 * <p>Java class for ObservationContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="role" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="relatedObservation" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationContextType", propOrder = {
    "role",
    "relatedObservation"
})
public class ObservationContextType {

    @XmlElement(required = true)
    protected ReferenceType role;
    @XmlElement(required = true)
    protected ReferenceType relatedObservation;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRole(ReferenceType value) {
        this.role = value;
    }

    /**
     * Gets the value of the relatedObservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRelatedObservation() {
        return relatedObservation;
    }

    /**
     * Sets the value of the relatedObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRelatedObservation(ReferenceType value) {
        this.relatedObservation = value;
    }

}
