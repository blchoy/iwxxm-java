//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:52:52 AM UTC 
//


package org.isotc211.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.gco.CharacterStringPropertyType;
import org.isotc211.gco.ObjectReferencePropertyType;


/**
 * Description of the class of information covered by the information
 * 
 * <p>Java class for MD_ScopeDescription_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_ScopeDescription_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="attributes" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="features" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="featureInstances" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="attributeInstances" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="dataset" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="other" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ScopeDescription_Type", propOrder = {
    "attributes",
    "features",
    "featureInstances",
    "attributeInstances",
    "dataset",
    "other"
})
public class MDScopeDescriptionType {

    protected List<ObjectReferencePropertyType> attributes;
    protected List<ObjectReferencePropertyType> features;
    protected List<ObjectReferencePropertyType> featureInstances;
    protected List<ObjectReferencePropertyType> attributeInstances;
    protected CharacterStringPropertyType dataset;
    protected CharacterStringPropertyType other;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatures() {
        if (features == null) {
            features = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.features;
    }

    /**
     * Gets the value of the featureInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureInstances() {
        if (featureInstances == null) {
            featureInstances = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.featureInstances;
    }

    /**
     * Gets the value of the attributeInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getAttributeInstances() {
        if (attributeInstances == null) {
            attributeInstances = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.attributeInstances;
    }

    /**
     * Gets the value of the dataset property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDataset() {
        return dataset;
    }

    /**
     * Sets the value of the dataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDataset(CharacterStringPropertyType value) {
        this.dataset = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOther(CharacterStringPropertyType value) {
        this.other = value;
    }

}
