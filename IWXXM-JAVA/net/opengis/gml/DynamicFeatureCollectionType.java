//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicFeatureCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicFeatureCollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DynamicFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}dynamicMembers"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFeatureCollectionType", propOrder = {
    "dynamicMembers"
})
public class DynamicFeatureCollectionType
    extends DynamicFeatureType
{

    @XmlElement(required = true)
    protected DynamicFeatureMemberType dynamicMembers;

    /**
     * Gets the value of the dynamicMembers property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public DynamicFeatureMemberType getDynamicMembers() {
        return dynamicMembers;
    }

    /**
     * Sets the value of the dynamicMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public void setDynamicMembers(DynamicFeatureMemberType value) {
        this.dynamicMembers = value;
    }

}
