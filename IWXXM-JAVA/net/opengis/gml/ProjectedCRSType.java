//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectedCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectedCRSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralDerivedCRSType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}baseGeodeticCRS"/&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}baseGeographicCRS"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedCRSType", propOrder = {
    "baseGeodeticCRS",
    "baseGeographicCRS",
    "cartesianCS"
})
public class ProjectedCRSType
    extends AbstractGeneralDerivedCRSType
{

    protected GeodeticCRSPropertyType baseGeodeticCRS;
    protected GeographicCRSPropertyType baseGeographicCRS;
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;

    /**
     * Gets the value of the baseGeodeticCRS property.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticCRSPropertyType }
     *     
     */
    public GeodeticCRSPropertyType getBaseGeodeticCRS() {
        return baseGeodeticCRS;
    }

    /**
     * Sets the value of the baseGeodeticCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticCRSPropertyType }
     *     
     */
    public void setBaseGeodeticCRS(GeodeticCRSPropertyType value) {
        this.baseGeodeticCRS = value;
    }

    /**
     * Gets the value of the baseGeographicCRS property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCRSPropertyType }
     *     
     */
    public GeographicCRSPropertyType getBaseGeographicCRS() {
        return baseGeographicCRS;
    }

    /**
     * Sets the value of the baseGeographicCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCRSPropertyType }
     *     
     */
    public void setBaseGeographicCRS(GeographicCRSPropertyType value) {
        this.baseGeographicCRS = value;
    }

    /**
     * Gets the value of the cartesianCS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<CartesianCSPropertyType> getCartesianCS() {
        return cartesianCS;
    }

    /**
     * Sets the value of the cartesianCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public void setCartesianCS(JAXBElement<CartesianCSPropertyType> value) {
        this.cartesianCS = value;
    }

}
