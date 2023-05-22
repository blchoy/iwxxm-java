//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * <p>Java class for analysisAndForecastPositionAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="analysisAndForecastPositionAnalysisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="analysis" type="{http://icao.int/iwxxm/2023-1}SIGMETEvolvingConditionCollectionPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="forecastPositionAnalysis" type="{http://icao.int/iwxxm/2023-1}SIGMETPositionCollectionPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2023-1}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "analysisAndForecastPositionAnalysisType", propOrder = {
    "analysis",
    "forecastPositionAnalysis",
    "extension"
})
public class AnalysisAndForecastPositionAnalysisType
    extends AbstractFeatureType
{

    protected SIGMETEvolvingConditionCollectionPropertyType analysis;
    protected SIGMETPositionCollectionPropertyType forecastPositionAnalysis;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the analysis property.
     * 
     * @return
     *     possible object is
     *     {@link SIGMETEvolvingConditionCollectionPropertyType }
     *     
     */
    public SIGMETEvolvingConditionCollectionPropertyType getAnalysis() {
        return analysis;
    }

    /**
     * Sets the value of the analysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIGMETEvolvingConditionCollectionPropertyType }
     *     
     */
    public void setAnalysis(SIGMETEvolvingConditionCollectionPropertyType value) {
        this.analysis = value;
    }

    /**
     * Gets the value of the forecastPositionAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link SIGMETPositionCollectionPropertyType }
     *     
     */
    public SIGMETPositionCollectionPropertyType getForecastPositionAnalysis() {
        return forecastPositionAnalysis;
    }

    /**
     * Sets the value of the forecastPositionAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIGMETPositionCollectionPropertyType }
     *     
     */
    public void setForecastPositionAnalysis(SIGMETPositionCollectionPropertyType value) {
        this.forecastPositionAnalysis = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

}
