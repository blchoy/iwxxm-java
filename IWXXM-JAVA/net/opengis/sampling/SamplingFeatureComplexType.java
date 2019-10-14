//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:52:52 AM UTC 
//


package net.opengis.sampling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.ReferenceType;


/**
 * A "SamplingFeatureRelation" is used to describe relationships between
 * 				sampling features, including part-whole, siblings, etc.
 * 
 * <p>Java class for SamplingFeatureComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamplingFeatureComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="role" type="{http://www.opengis.net/gml/3.2}ReferenceType"/&gt;
 *         &lt;element name="relatedSamplingFeature" type="{http://www.opengis.net/sampling/2.0}SF_SamplingFeaturePropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamplingFeatureComplexType", propOrder = {
    "role",
    "relatedSamplingFeature"
})
public class SamplingFeatureComplexType {

    @XmlElement(required = true)
    protected ReferenceType role;
    @XmlElement(required = true)
    protected SFSamplingFeaturePropertyType relatedSamplingFeature;

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
     * Gets the value of the relatedSamplingFeature property.
     * 
     * @return
     *     possible object is
     *     {@link SFSamplingFeaturePropertyType }
     *     
     */
    public SFSamplingFeaturePropertyType getRelatedSamplingFeature() {
        return relatedSamplingFeature;
    }

    /**
     * Sets the value of the relatedSamplingFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SFSamplingFeaturePropertyType }
     *     
     */
    public void setRelatedSamplingFeature(SFSamplingFeaturePropertyType value) {
        this.relatedSamplingFeature = value;
    }

}
