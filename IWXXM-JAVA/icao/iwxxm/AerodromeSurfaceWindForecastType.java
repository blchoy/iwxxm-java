//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeSurfaceWindForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeSurfaceWindForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://icao.int/iwxxm/3.0}AerodromeSurfaceWindTrendForecastType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="variableWindDirection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSurfaceWindForecastType")
public class AerodromeSurfaceWindForecastType
    extends AerodromeSurfaceWindTrendForecastType
{

    @XmlAttribute(name = "variableWindDirection", required = true)
    protected boolean variableWindDirection;

    /**
     * Gets the value of the variableWindDirection property.
     * 
     */
    public boolean isVariableWindDirection() {
        return variableWindDirection;
    }

    /**
     * Sets the value of the variableWindDirection property.
     * 
     */
    public void setVariableWindDirection(boolean value) {
        this.variableWindDirection = value;
    }

}
