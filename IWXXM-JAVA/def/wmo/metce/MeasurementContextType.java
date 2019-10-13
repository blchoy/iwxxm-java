//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.10 at 02:53:01 AM UTC 
//


package def.wmo.metce;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import def.wmo.opm.ObservablePropertyType;
import def.wmo.opm.QualifiedObservablePropertyType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AbstractMemberType;
import net.opengis.gml.UnitOfMeasureType;


/**
 * <p>Java class for MeasurementContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.opengis.net/gml/3.2}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="measureand"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/opm/2013}ObservableProperty"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="measuringInterval" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://def.wmo.int/metce/2013}RangeBounds"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="resolutionScale" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementContextType", propOrder = {
    "unitOfMeasure",
    "measureand",
    "measuringInterval",
    "resolutionScale"
})
public class MeasurementContextType
    extends AbstractGMLType
{

    protected UnitOfMeasureType unitOfMeasure;
    @XmlElement(required = true)
    protected MeasurementContextType.Measureand measureand;
    protected MeasurementContextType.MeasuringInterval measuringInterval;
    protected BigInteger resolutionScale;

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasureType value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the measureand property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementContextType.Measureand }
     *     
     */
    public MeasurementContextType.Measureand getMeasureand() {
        return measureand;
    }

    /**
     * Sets the value of the measureand property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementContextType.Measureand }
     *     
     */
    public void setMeasureand(MeasurementContextType.Measureand value) {
        this.measureand = value;
    }

    /**
     * Gets the value of the measuringInterval property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementContextType.MeasuringInterval }
     *     
     */
    public MeasurementContextType.MeasuringInterval getMeasuringInterval() {
        return measuringInterval;
    }

    /**
     * Sets the value of the measuringInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementContextType.MeasuringInterval }
     *     
     */
    public void setMeasuringInterval(MeasurementContextType.MeasuringInterval value) {
        this.measuringInterval = value;
    }

    /**
     * Gets the value of the resolutionScale property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResolutionScale() {
        return resolutionScale;
    }

    /**
     * Sets the value of the resolutionScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResolutionScale(BigInteger value) {
        this.resolutionScale = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://def.wmo.int/opm/2013}ObservableProperty"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "observableProperty"
    })
    public static class Measureand
        extends AbstractMemberType
    {

        @XmlElementRef(name = "ObservableProperty", namespace = "http://def.wmo.int/opm/2013", type = JAXBElement.class)
        protected JAXBElement<? extends ObservablePropertyType> observableProperty;

        /**
         * Gets the value of the observableProperty property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link QualifiedObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservablePropertyType }{@code >}
         *     
         */
        public JAXBElement<? extends ObservablePropertyType> getObservableProperty() {
            return observableProperty;
        }

        /**
         * Sets the value of the observableProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link QualifiedObservablePropertyType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ObservablePropertyType }{@code >}
         *     
         */
        public void setObservableProperty(JAXBElement<? extends ObservablePropertyType> value) {
            this.observableProperty = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://def.wmo.int/metce/2013}RangeBounds"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rangeBounds"
    })
    public static class MeasuringInterval
        extends AbstractMemberType
    {

        @XmlElement(name = "RangeBounds", required = true)
        protected RangeBoundsType rangeBounds;

        /**
         * Gets the value of the rangeBounds property.
         * 
         * @return
         *     possible object is
         *     {@link RangeBoundsType }
         *     
         */
        public RangeBoundsType getRangeBounds() {
            return rangeBounds;
        }

        /**
         * Sets the value of the rangeBounds property.
         * 
         * @param value
         *     allowed object is
         *     {@link RangeBoundsType }
         *     
         */
        public void setRangeBounds(RangeBoundsType value) {
            this.rangeBounds = value;
        }

    }

}
